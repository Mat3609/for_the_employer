package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;

import java.util.Objects;

public class BusinessAirplane extends Airplane {
    private boolean goldenToilet;

    public BusinessAirplane(Name name, String model, EngineTyp engineTyp, int rangeOfFlight, int loadCapacity, int capacityPassengers, int fuelConsumption_KgInHours, int aircraftCost, boolean goldenToilet) {
        super(name, model, engineTyp, rangeOfFlight, loadCapacity, capacityPassengers, fuelConsumption_KgInHours, aircraftCost);
        this.goldenToilet = goldenToilet;
    }

    public boolean isGoldenToilet() {
        return goldenToilet;
    }


    @Override
    public String toString() {
        return super.toString() + " BusinessAirplane{" +
                "goldenToilet=" + goldenToilet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BusinessAirplane that = (BusinessAirplane) o;
        return goldenToilet == that.goldenToilet;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), goldenToilet);
    }
}
