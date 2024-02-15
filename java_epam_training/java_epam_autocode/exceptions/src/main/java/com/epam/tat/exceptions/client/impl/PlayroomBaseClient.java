package com.epam.tat.exceptions.client.impl;

import com.epam.tat.exceptions.bean.Toy;
import com.epam.tat.exceptions.client.IPlayroom;
import com.epam.tat.exceptions.constants.GameType;
import com.epam.tat.exceptions.constants.Gender;
import com.epam.tat.exceptions.constants.Material;
import com.epam.tat.exceptions.constants.Size;
import com.epam.tat.exceptions.exception.*;
import java.util.ArrayList;
import java.util.List;

	public class PlayroomBaseClient implements IPlayroom {

	private List<Toy> toyList;

	public PlayroomBaseClient(List<Toy> toyList) {
		if (toyList == null || toyList.isEmpty()) throw new InitializationException();
		this.toyList = toyList;
	}

	@Override
	public List<Toy> getAllToys(){
		return toyList;
	}

	@Override
	public List<Toy> getToysByParameter(String parameter, String value) {
		if (parameter == null || value == null) throw new GetToysByParameterException();
		List<Toy> newListToys = new ArrayList<>();
		switch (parameter) {
			case "id":
				for (Toy toy : toyList) {
					if (toy.getId().equals(Long.valueOf(value))) {
						newListToys.add(toy);
					}
				}
				break;

			case "toyName":
				for (Toy toy : toyList) {
					if (toy.getToyName().equals(value)) {
						newListToys.add(toy);
					}
				}
				break;

			case "gameType":
				for (Toy toy : toyList) {
					if (toy.getGameType().equals(GameType.valueOf(value))) {
						newListToys.add(toy);
					}
				}
				break;

			case "gender":
				for (Toy toy : toyList) {
					if (toy.getGender().equals(Gender.valueOf(value))) {
						newListToys.add(toy);
					}
				}
				break;

			case "age":
				for (Toy toy : toyList) {
					if (toy.getAge() == Integer.valueOf(value)) {
						newListToys.add(toy);
					}
				}
				break;

			case "size":
				for (Toy toy : toyList) {
					if (toy.getSize().equals(Size.valueOf(value))) {
						newListToys.add(toy);
					}
				}
				break;

			case "material":
				for (Toy toy : toyList) {
					if (toy.getMaterial().equals(Material.valueOf(value))) {
						newListToys.add(toy);
					}
				}
				break;

			case "price":
				for (Toy toy : toyList) {
					if (toy.getPrice() == Double.valueOf(value)) {
						newListToys.add(toy);
					}
				}
				break;

			default:
				throw new GetToysByParameterException();
		}
		return newListToys;
	}

	@Override
	public boolean addToy(Toy toy) {
		if (toy == null) throw new AddToyException();
		if (toyList.stream().anyMatch(toy1 -> toy1.getId().equals(toy.getId()))) throw new AddToyException();
		return toyList.add(toy);
	}

	@Override
	public boolean removeToy(Toy toy) {
		if (!toyList.contains(toy)) throw new RemoveToyException();
		return toyList.remove(toy);
	}

	@Override
	public boolean updateToy(Long id, Toy toy) {
		if (toy == null){
			throw new UpdateToyException();
		}
		if (toyList.stream().noneMatch(toy1 -> toy1.getId().equals(id))) {
			throw new UpdateToyException();
		}

			for (int i = 0; i < toyList.size(); i++) {
				if (toyList.get(i).getId().equals(id)) {
					toyList.set(i, toy);
					return true;
				}
			}
		return false;
	}

}
