package com.epam.training.student_matsvei_shablouski.classes.main_task.car_market;


import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Brand;
import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Color;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car (Brand.AUDI, "A4", 1, 2006, 4208, 8600, Color.GREEN);
        Car car2 = new Car (Brand.AUDI, "A6", 2, 2000, 3245, 4200, Color.BLUE);
        Car car3 = new Car (Brand.AUDI, "A8", 3, 1998, 4345, 4800, Color.GREEN);
        Car car4 = new Car (Brand.FORD, "Focus", 4, 1998, 5423, 1624, Color.BLUE);
        Car car5 = new Car (Brand.FORD, "Mustang", 5, 2008, 4611, 21000, Color.RED);
        Car car6 = new Car (Brand.FORD, "Escort", 6, 2004, 7422, 6400, Color.GREY);
        Car car7 = new Car (Brand.NISAN, "Skyline", 7, 2010, 4633, 14000, Color.GREEN);
        Car car8 = new Car (Brand.NISAN, "Almera", 8, 1991, 1263, 1726, Color.RED);
        Car car9 = new Car (Brand.NISAN, "Silvia", 9, 1998, 6224, 2400, Color.BLUE);
        Car car10 = new Car (Brand.BMW, "M3", 10, 2021, 1276, 47000, Color.RED);
        Car car11 = new Car (Brand.BMW, "M5", 11, 2018, 4822, 64000, Color.GREEN);
        Car car12 = new Car (Brand.BMW, "M6", 12, 2016, 7777, 82000, Color.GREY);


        CarMarket carMarket = new CarMarket();

        carMarket.addCar (car1);
        carMarket.addCar (car2);
        carMarket.addCar (car3);
        carMarket.addCar (car4);
        carMarket.addCar (car5);
        carMarket.addCar (car6);
        carMarket.addCar (car7);
        carMarket.addCar (car8);
        carMarket.addCar (car9);
        carMarket.addCar (car10);
        carMarket.addCar (car11);
        carMarket.addCar (car12);


        carMarket.getListCarsOfThisBrand(Brand.AUDI).stream().forEach(car -> System.out.println(car.toString()));
        System.out.println();
        carMarket.getListCarsOfThisBrandWhichUsesMoreThanNYears(Brand.BMW, 2).stream ().forEach (car -> System.out.println (car.toString ()));
        System.out.println();
        carMarket.grtListCarsOfThisYearsPriseMoreThanGiven(1998, 1700).stream().forEach(car -> System.out.println(car.toString()));
    }
}
