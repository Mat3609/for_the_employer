package com.epam.training.student_matsvei_shablouski.classes.main_task.car_market;



import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Brand;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarMarket implements FilterCars {

    private List<Car> carList;

    public CarMarket() {
        carList = new ArrayList<> ();
    }

    public void addCar(Car car) {
        carList.add (car);
    }


    @Override
    public List<Car> getListCarsOfThisBrand(Brand brand) {
        return carList.stream ()
                .filter (car -> car.getBrand ().equals (brand))
                .collect(Collectors.toList());
    }

    @Override
    public List<Car> getListCarsOfThisBrandWhichUsesMoreThanNYears(Brand brand, int years) {
        int year = 2022 - years;
        return carList.stream().filter(car -> car.getBrand().equals(brand) && car.getYear() < year).collect(Collectors.toList());
    }

    @Override
    public List<Car> grtListCarsOfThisYearsPriseMoreThanGiven(int years, int price) {
        return carList.stream().filter(car -> car.getYear() == years && car.getPrice() > price).collect(Collectors.toList());
    }
}
