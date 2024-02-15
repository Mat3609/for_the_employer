package com.epam.training.student_matsvei_shablouski.classes.main_task.car_market;


import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Brand;
import com.epam.training.student_matsvei_shablouski.classes.main_task.car_market.konst.Color;

import java.util.Objects;

public class Car {

    private Brand brand;
    private String model;
    private int id;
    private int year;
    private int registrationNumber;
    private int price;
    private Color color;


    public Car(Brand brand, String model, int id, int year, int registrationNumber, int price, Color color) {
        this.brand = brand;
        this.model = model;
        this.id = id;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.price = price;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public int getPrice() {
        return price;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", id=" + id +
                ", year=" + year +
                ", registrationNumber=" + registrationNumber +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && year == car.year && registrationNumber == car.registrationNumber && price == car.price && brand == car.brand && Objects.equals(model, car.model) && color == car.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, id, year, registrationNumber, price, color);
    }
}
