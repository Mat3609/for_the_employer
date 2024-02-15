package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airport;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.Airplane;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Airport implements GetInformationAboutAircraft {

    private List<Airplane> airplanes;

    public Airport(List<Airplane> airplaneList) {
        this.airplanes = airplaneList;
    }

    public void addAirplane(Airplane airplane) {
        airplanes.add(airplane);
    }

    @Override
    public int calculateTotalCapacity() {
        int totalCapacity = 0;
        Iterator<Airplane> iterator = airplanes.iterator();
        while (iterator.hasNext()) {
            Airplane airplane = iterator.next();
            totalCapacity += airplane.getPassengersCapacity();
        }
        return totalCapacity;
    }

    @Override
    public int calculateTotalLoadCapacity() {
        int totalLoadCapacity = 0;
        for (Airplane airplane : airplanes) {
            totalLoadCapacity += airplane.getLoadCapacity();
        }
        return totalLoadCapacity;
    }

    @Override
    public List<Airplane> sortAircraftByFlightDistance() {
        return airplanes.stream().sorted(Comparator.comparing(Airplane ::getFlightDistance)).collect(Collectors.toList());
    }

    @Override
    public List<Airplane> findAnAircraftByGivenRangeOfFuelConsumption(int from, int to) {
        List<Airplane> newAirplaneList = new ArrayList<>();
        Iterator<Airplane> iterator = airplanes.iterator();
        while (iterator.hasNext()) {
            Airplane airplane = iterator.next();
            if (airplane.getFuelConsumptionKg_Hour() >= from && airplane.getFuelConsumptionKg_Hour() <= to) {
                newAirplaneList.add(airplane);
            }
        }
        if (newAirplaneList.isEmpty()) System.out.println("There are no aircraft in this range.");
        return newAirplaneList;
    }
}