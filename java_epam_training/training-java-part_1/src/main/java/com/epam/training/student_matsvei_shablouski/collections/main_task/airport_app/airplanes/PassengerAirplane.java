package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;

public class PassengerAirplane extends Airplane {
    private boolean hotDishes;
    private  boolean wifi;

    public PassengerAirplane(Name name, String model, EngineTyp engineTyp, int rangeOfFlight, int loadCapacity, int capacityPassengers, int fuelConsumption_KgInHours, int aircraftCost, boolean hotDishes, boolean wifi) {
        super(name, model, engineTyp, rangeOfFlight, loadCapacity, capacityPassengers, fuelConsumption_KgInHours, aircraftCost);
        this.hotDishes = hotDishes;
        this.wifi = wifi;
    }

    public boolean isHotDishes() {
        return hotDishes;
    }

    public boolean isWifi() {
        return wifi;
    }


    @Override
    public String toString() {
        return super.toString() + " PassengerAirplane{" +
                "hotDishes=" + hotDishes +
                ", wifi=" + wifi +
                '}';
    }


}
