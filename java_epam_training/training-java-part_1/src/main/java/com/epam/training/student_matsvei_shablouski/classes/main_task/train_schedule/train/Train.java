package com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train;

public class Train {
    private int numberTrain;
    private Places places;
    private String destination;
    private int timeDepart;

    public Train() {
    }

    public Train(int numberTrain, String destination) {
        this.numberTrain = numberTrain;
        this.destination = destination;
    }

    public Train(int numberTrain, Places places, String destination, int timeDepart) {
        this.numberTrain = numberTrain;
        this.places = places;
        this.destination = destination;
        this.timeDepart = timeDepart;
    }

    public int getNumberTrain() {
        return numberTrain;
    }

    public void setNumberTrain(int numberTrain) {
        this.numberTrain = numberTrain;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTimeDepart() {
        return timeDepart;
    }

    public void setTimeDepart(int timeDepart) {
        this.timeDepart = timeDepart;
    }

    public Places getPlaces() {
        return places;
    }

    public void setPlaces(Places places) {
        this.places = places;
    }

    @Override

    public String toString() {
        return "Train{" +
                "numberTrain=" + numberTrain +
                ", places=" + places +
                ", destination='" + destination + '\'' +
                ", timeDepart=" + timeDepart +
                '}';
    }
}
