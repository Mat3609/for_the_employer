package com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule;

import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.schedule_train.Schedule;
import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train.Places;
import com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train.Train;


public class Main {
    public static void main(String[] args) {

        Train train1 = new Train(12, new Places(12, 67, 15, 18), "London", 1800);
        Train train2 = new Train(13, new Places(0, 72, 37, 2), "London", 1345);
        Train train3 = new Train(14, new Places(111, 47, 24, 22), "London", 1025);
        Train train4 = new Train(15, new Places(0, 49, 24, 33), "London", 1235);
        Train train5 = new Train(16, new Places(313, 26, 57, 6), "London", 2115);
        Train train55 = null;
        Train train6 = new Train(17, new Places(262, 46, 14, 13), "Parish", 2355);
        Train train7 = new Train(18, new Places(125, 73, 75, 35), "Parish", 1435);
        Train train8 = new Train(19, new Places(217, 16, 64, 21), "Parish", 1655);
        Train train9 = new Train(20, new Places(122, 23, 42, 4), "Krakow", 1925);
        Train train10 = new Train(21, new Places(117, 3, 36, 2), "Krakow", 1700);
        Train train11 = new Train(22, new Places(322, 12, 56, 18), "Krakow", 845);
        Train train122 = new Train(212, new Places(3222, 112, 526, 118), "Krakow", 8452);


        Schedule schedule = new Schedule();

        schedule.addTrain(train1);
        schedule.addTrain(train2);
        schedule.addTrain(train3);
        schedule.addTrain(train4);
        schedule.addTrain(train5);
        schedule.addTrain(train55);
        schedule.addTrain(train6);
        schedule.addTrain(train7);
        schedule.addTrain(train8);
        schedule.addTrain(train9);
        schedule.addTrain(train10);
        schedule.addTrain(train11);
        schedule.addTrain(train122);



        schedule.getListOfTrainsGoingToGivenDest("Krakow").stream().forEach(train -> System.out.println(train.toString()));
        System.out.println();
        schedule.getListOfTrainsGoingToGivenDestDepartingAfterSpecifHour("Parish", 1500).stream().forEach(train -> System.out.println(train.toString()));
        System.out.println();
        schedule.getListOfTrainsGoingToGivenDestWhichHaveGeneralPlaces("London").stream().forEach(train -> System.out.println(train.toString()));


    }
}
