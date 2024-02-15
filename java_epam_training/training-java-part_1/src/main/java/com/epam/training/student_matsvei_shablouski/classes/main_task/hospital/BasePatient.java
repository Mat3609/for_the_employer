package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

import java.util.Objects;

public abstract class BasePatient {
    String name;
    String surname;
    Diagnosis diagnosis;
    int numberMedicalCard;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    @Override
    public String toString() {
        return "BasePatient{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", diagnosis=" + diagnosis +
                ", numberMedicalCard=" + numberMedicalCard +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasePatient that = (BasePatient) o;
        return numberMedicalCard == that.numberMedicalCard && Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && diagnosis == that.diagnosis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, diagnosis, numberMedicalCard);
    }
}
