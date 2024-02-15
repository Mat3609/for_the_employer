package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;

import java.util.Objects;

public abstract class Airplane {
    private Name name;
    private String model;
    private EngineTyp engineTyp;
    private int flightDistance;
    private int loadCapacity;
    private int passengersCapacity;
    private int fuelConsumptionKg_Hour;
    private int aircraftCost;

    public Airplane(Name name, String model, EngineTyp engineTyp, int rangeOfFlight, int loadCapacity, int capacityPassengers, int fuelConsumption_KgInHours, int aircraftCost) {
        this.name = name;
        this.model = model;
        this.engineTyp = engineTyp;
        this.flightDistance = rangeOfFlight;
        this.loadCapacity = loadCapacity;
        this.passengersCapacity = capacityPassengers;
        this.fuelConsumptionKg_Hour = fuelConsumption_KgInHours;
        this.aircraftCost = aircraftCost;
    }

    public Name getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public EngineTyp getEngineTyp() {
        return engineTyp;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public int getFuelConsumptionKg_Hour() {
        return fuelConsumptionKg_Hour;
    }

    public int getAircraftCost() {
        return aircraftCost;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name=" + name +
                ", model='" + model + '\'' +
                ", engineTyp=" + engineTyp +
                ", rangeOfFlight=" + flightDistance +
                ", loadCapacity=" + loadCapacity +
                ", capacityPassengers=" + passengersCapacity +
                ", fuelConsumption_KgInHours=" + fuelConsumptionKg_Hour +
                ", aircraftCost=" + aircraftCost +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return flightDistance == airplane.flightDistance && loadCapacity == airplane.loadCapacity && passengersCapacity == airplane.passengersCapacity && fuelConsumptionKg_Hour == airplane.fuelConsumptionKg_Hour && aircraftCost == airplane.aircraftCost && name == airplane.name && Objects.equals(model, airplane.model) && engineTyp == airplane.engineTyp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, engineTyp, flightDistance, loadCapacity, passengersCapacity, fuelConsumptionKg_Hour, aircraftCost);
    }
}
