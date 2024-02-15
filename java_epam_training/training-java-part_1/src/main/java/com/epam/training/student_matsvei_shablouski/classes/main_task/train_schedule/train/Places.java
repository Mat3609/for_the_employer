package com.epam.training.student_matsvei_shablouski.classes.main_task.train_schedule.train;

import java.util.Objects;

public class Places {

    private int general;
    private int coupe;
    private int reservedSeat;
    private int luxury;

    public Places(int general, int coupe, int reservedSeat, int luxury) {
        this.general = general;
        this.coupe = coupe;
        this.reservedSeat = reservedSeat;
        this.luxury = luxury;
    }

    public int getGeneral() {
        return general;
    }

    public int getCoupe() {
        return coupe;
    }

    public int getReservedSeat() {
        return reservedSeat;
    }

    public int getLuxury() {
        return luxury;
    }

    @Override
    public String toString() {
        return "TypPlaces{" +
                "general=" + general +
                ", coupe=" + coupe +
                ", reserved_seat=" + reservedSeat +
                ", luxury=" + luxury +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Places places = (Places) o;
        return general == places.general && coupe == places.coupe && reservedSeat == places.reservedSeat && luxury == places.luxury;
    }

    @Override
    public int hashCode() {
        return Objects.hash(general, coupe, reservedSeat, luxury);
    }
}
