package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airport;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.Airplane;

import java.util.List;

public interface GetInformationAboutAircraft {

    int calculateTotalCapacity();
    int calculateTotalLoadCapacity();
    List<Airplane> sortAircraftByFlightDistance();
    List<Airplane> findAnAircraftByGivenRangeOfFuelConsumption(int from, int to);

}
