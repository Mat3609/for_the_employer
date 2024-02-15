package com.epam.training.student_matsvei_shablouski.collections;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.Airplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.BusinessAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.CargoAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.PassengerAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airport.Airport;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AirCompanyTest {
    List<Airplane> airplanes = Arrays.asList(
            new PassengerAirplane(Name.BOEING, "737-400", EngineTyp.TURBOFAN_ENGINES, 4204, 3, 171, 1800, 88, false, true),
            new PassengerAirplane(Name.EMBRAER, "175", EngineTyp.TURBOFAN_ENGINES, 3900, 2, 88, 1400, 45, false, false),
            new PassengerAirplane(Name.AIRBUS, "A380", EngineTyp.TURBOFAN_ENGINES, 15200, 8, 933, 4800, 388, true, true),
            new BusinessAirplane(Name.BEECHCRAFT, "PREMIER I", EngineTyp.JET_ENGINES, 3200, 1, 18, 800, 18, false),
            new BusinessAirplane(Name.BEECHCRAFT, "KING AIR 90", EngineTyp.TURBOPROP_ENGINES, 2700, 1, 16, 1200, 8, false),
            new BusinessAirplane(Name.BEECHCRAFT, "HAWKER 900 XP", EngineTyp.JET_ENGINES, 3120, 1, 22, 1350, 13, true),
            new CargoAirplane(Name.BOEING, "747-700", EngineTyp.TURBOFAN_ENGINES, 14200, 119, 22, 4400, 380, true),
            new CargoAirplane(Name.ANTONOV, "AN-225 MRIYA", EngineTyp.TURBOFAN_ENGINES, 15400, 150, 32, 6800, 660, true),
            new CargoAirplane(Name.ANTONOV, "AN-22 ANTEY", EngineTyp.TURBOPROP_ENGINES, 12000, 88, 12, 4400, 220, false)
    );

    @Test
    void testCalculateTotalCapacity() {
        Airport airCompany = new Airport(airplanes);
        assertEquals(1314, airCompany.calculateTotalCapacity());
    }

    @Test
    void testcCalculateTotalLoadCapacity() {
        Airport airCompany = new Airport(airplanes);
        assertEquals(373, airCompany.calculateTotalLoadCapacity());
    }

    @Test
    void testSortAircraftByFlightDistance() {
        Airport airCompany = new Airport(airplanes);
        List<Airplane> airplanesSort = airCompany.sortAircraftByFlightDistance();

        for (int i = 0; i < airplanesSort.size() - 1; i++) {
            Assert.assertTrue(airplanesSort.get(i).getFlightDistance() <= airplanesSort.get(i + 1).getFlightDistance());
        }
    }

    @Test
    void testFindAnAirplanesByGivenRangeOfFuelConsumption() {
        Airport airCompany = new Airport(airplanes);
        List<Airplane> sortAirplane = airCompany.findAnAircraftByGivenRangeOfFuelConsumption(1500, 5000);

        for (Airplane airplane : sortAirplane) {
            Assert.assertFalse(airplane.getFuelConsumptionKg_Hour() < 1500 || airplane.getFuelConsumptionKg_Hour() > 5000);
        }
    }

}