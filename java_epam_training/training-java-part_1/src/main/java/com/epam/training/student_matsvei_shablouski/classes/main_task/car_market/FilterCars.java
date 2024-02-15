package com.epam.training.student_matsvei_shablouski.classes.main_task.car_market;



import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Brand;

import java.util.List;

public interface FilterCars {
    List<Car> getListCarsOfThisBrand(Brand brand);
    List<Car> getListCarsOfThisBrandWhichUsesMoreThanNYears(Brand brand, int years);
    List<Car> grtListCarsOfThisYearsPriseMoreThanGiven(int years, int price);
}
