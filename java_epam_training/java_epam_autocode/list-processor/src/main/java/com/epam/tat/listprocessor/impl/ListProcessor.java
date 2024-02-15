package com.epam.tat.listprocessor.impl;

import com.epam.tat.listprocessor.IListProcessor;
import com.epam.tat.listprocessor.exception.ListProcessorException;
import java.util.*;
import java.util.stream.Collectors;


public class ListProcessor implements IListProcessor {


	@Override
	public String getSecondStringByLength(List<String> list) {
		if (list == null || list.size() == 1 || list.isEmpty()) throw new ListProcessorException();
		int listLengthFirstElement = list.get(0).length();
		if (list.stream().allMatch(s -> s.length() == listLengthFirstElement)) throw new ListProcessorException();

		Collections.sort(list, (o1, o2) -> o1.length()-o2.length());

		return list.get(list.size() - 2);
	}


	@Override
	public List<String> getSortedListByLength(List<String> list) {
		if (list == null || list.isEmpty()) throw new ListProcessorException();

		List<String> result = new ArrayList<>();
		for (String s : list) {
			result.add(s);
		}
		result.sort(Comparator.comparing(String::length));
		return result;

	}


	@Override
	public List<String> getSortedListByCountOfVowels(List<String> list) throws ListProcessorException {
		String vowels = "[^aAeEiIoOuU]";
		if (list == null || list.isEmpty()) throw new ListProcessorException();
		if (list.stream().allMatch(s -> s.replaceAll(vowels, "").length() == 0)) throw new ListProcessorException();

		Comparator<String> comparator = (string1, string2) -> {
		int numberVowels1 = string1.replaceAll(vowels,"").length();
		int numberVowels2 = string2.replaceAll(vowels,"").length();

			int comparison = numberVowels1 - numberVowels2;
			if (comparison == 0) {
				return string1.compareTo(string2);
			}
			return comparison;
		};

		return list.stream().sorted(comparator).collect(Collectors.toList());
	}


	@Override
	public List<String> getSortedListByCountOfConsonants(List<String> list) {
		String consonants = "[^ BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]";
		if (list == null || list.isEmpty()) throw new ListProcessorException();
		if (list.stream().allMatch(s -> s.replaceAll(consonants, "").length() == 0)) throw new ListProcessorException();

		Comparator<String> comparator = (o1, o2) -> {
			int numberConsonants1 = o1.replaceAll(consonants, "").length();
			int numberConsonants2 = o2.replaceAll(consonants, "").length();

			int comparison = numberConsonants1 - numberConsonants2;
			if (comparison == 0) return o1.compareTo(o2);
			return comparison;
		};

		return list.stream().sorted(comparator).collect(Collectors.toList());
	}

	@Override
	public List<String> changeByPlacesFirstAndLastSymbolsInEachSecondStringOfList(List<String> list) {
		if (list == null || list.isEmpty() || list.size() < 2) throw new ListProcessorException();

		for (int i = 1; i < list.size(); i += 2) {
			if (list.get(i).length() <= 2) {
				continue ;
			}

			char[] str = list.get(i).toCharArray();

			char firstLetter = str[0];
			str[0] = str[str.length - 1];
			str[str.length -1] = firstLetter;
			String newWord = String.valueOf(str);
			list.set(i, newWord);
		}
		return list;
	}


	@Override
	public List<String> reverseStringsOfList(List<String> list) {
		if (list == null || list.isEmpty()) throw new ListProcessorException();
		List<String> list1 = new ArrayList<>();

		for (String s : list) {
			if (Collections.frequency(list, s) > 1) throw new ListProcessorException();
			list1.add(new StringBuilder(s).reverse().toString());
		}

		return list1;
	}
}
