package com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app;

import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.Airplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.BusinessAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.CargoAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.PassengerAirplane;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.EngineTyp;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airplanes.enam_airplane.Name;
import com.epam.training.student_matsvei_shablouski.collections.main_task.airport_app.airport.Airport;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemoAirport {
    public static void main(String[] args) {
        List<Airplane> airplaneList = new ArrayList<>();
                airplaneList.add(new PassengerAirplane(Name.BOEING, "737-400", EngineTyp.TURBOFAN_ENGINES, 4204, 3, 171, 1800, 88, false, true));
                airplaneList.add(new PassengerAirplane(Name.EMBRAER, "175", EngineTyp.TURBOFAN_ENGINES, 3900, 2, 88, 1400, 45, false, false));
                airplaneList.add(new PassengerAirplane(Name.AIRBUS, "A380", EngineTyp.TURBOFAN_ENGINES, 15200, 8, 933, 4800, 388, true, true));
                airplaneList.add(new BusinessAirplane(Name.BEECHCRAFT, "PREMIER I", EngineTyp.JET_ENGINES, 3200, 1, 18, 800, 18, false));
                airplaneList.add(new BusinessAirplane(Name.BEECHCRAFT, "KING AIR 90", EngineTyp.TURBOPROP_ENGINES, 2700, 1, 16, 1200, 8, false));
                airplaneList.add(new BusinessAirplane(Name.BEECHCRAFT, "HAWKER 900 XP", EngineTyp.JET_ENGINES, 3120, 1, 22, 1350, 13, true));
                airplaneList.add(new CargoAirplane(Name.BOEING, "747-700", EngineTyp.TURBOFAN_ENGINES, 14200, 119, 22, 4400, 380, true));
                airplaneList.add(new CargoAirplane(Name.ANTONOV, "AN-225 MRIYA", EngineTyp.TURBOFAN_ENGINES, 15400, 150, 32, 6800, 660, true));
                airplaneList.add( new CargoAirplane(Name.ANTONOV, "AN-22 ANTEY", EngineTyp.TURBOPROP_ENGINES, 12000, 88, 12, 4400, 220, false));

        Airport airport = new Airport(airplaneList);

        String instruction = "To get information, select the desired item from 1 to 4:";
        String selectTheDesiredItem = "1. Calculate Total Capacity \n2. Calculate Total Load Capacity \n3. Sort Aircraft By Flight Range \n4. Find An Aircraft By Given Range Of Fuel Consumption";

        System.out.println("Hello, welcome to Lufthansa airline!");
        System.out.println(instruction);
        System.out.println(selectTheDesiredItem);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt();
            if (input == 0) {
                System.out.println("Session ended.");
                break;
            }
            switch (input) {
                case (1):
                    System.out.println("Total Capacity - " + airport.calculateTotalCapacity() + "\n");
                    System.out.println(instruction);
                    System.out.println(selectTheDesiredItem);
                    break;

                case (2):
                    System.out.println("Total Load Capacity - " + airport.calculateTotalLoadCapacity() + "\n");
                    System.out.println(instruction);
                    System.out.println(selectTheDesiredItem);
                    break;

                case (3):
                    System.out.println("Sort Aircraft By Flight Range:");
                    airport.sortAircraftByFlightDistance().forEach(airplane -> System.out.println(airplane.toString()));
                    System.out.println();
                    System.out.println(instruction);
                    System.out.println(selectTheDesiredItem);
                    break;

                case (4):
                    System.out.println("Enter two numbers separated by a space:");
                    int from = Integer.parseInt(scanner.next());
                    int to = scanner.nextInt();
                    System.out.println("Aircraft By Given Range Of Fuel Consumption:");
                    airport.findAnAircraftByGivenRangeOfFuelConsumption(from, to).forEach(airplane -> System.out.println(airplane.toString()));
                    System.out.println();
                    System.out.println(instruction);
                    System.out.println(selectTheDesiredItem);
                    break;

                default:
                    System.out.println("Non-existent item! Please try again.");
                    System.out.println(instruction);
                    System.out.println(selectTheDesiredItem);
            }
        }
    }
}
