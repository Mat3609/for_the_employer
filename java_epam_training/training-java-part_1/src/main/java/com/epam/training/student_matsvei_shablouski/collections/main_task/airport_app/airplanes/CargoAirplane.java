package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;

import java.util.Objects;

public class CargoAirplane extends Airplane {
    private boolean availabilityHydraulicRamp;

    public CargoAirplane(Name name, String model, EngineTyp engineTyp, int rangeOfFlight, int loadCapacity, int capacityPassengers, int fuelConsumption_KgInHours, int aircraftCost, boolean availabilityHydraulicRamp) {
        super(name, model, engineTyp, rangeOfFlight, loadCapacity, capacityPassengers, fuelConsumption_KgInHours, aircraftCost);
        this.availabilityHydraulicRamp = availabilityHydraulicRamp;
    }

    public boolean isAvailabilityHydraulicRamp() {
        return availabilityHydraulicRamp;
    }


    @Override
    public String toString() {
        return super.toString() + " CargoAirplane{" +
                "availabilityHydraulicRamp=" + availabilityHydraulicRamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoAirplane that = (CargoAirplane) o;
        return availabilityHydraulicRamp == that.availabilityHydraulicRamp;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), availabilityHydraulicRamp);
    }
}
