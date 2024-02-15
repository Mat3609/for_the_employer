package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

import java.util.Objects;

public class  Patient extends BasePatient {
   private String name;
   private String surname;
   private Diagnosis diagnosis;
   private int numberMedicalCard;

    public Patient(String name, String surname, Diagnosis diagnosis, int numberMedicalCard) {
        this.name = name;
        this.surname = surname;
        this.diagnosis = diagnosis;
        this.numberMedicalCard = numberMedicalCard;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public Diagnosis getDiagnosis() {
        return diagnosis;
    }

    @Override
    public int getNumberMedicalCard() {
        return numberMedicalCard;
    }

    @Override
    public String toString() {
        return "Patient{" +
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
        Patient patient = (Patient) o;
        return numberMedicalCard == patient.numberMedicalCard && Objects.equals(name, patient.name) && Objects.equals(surname, patient.surname) && diagnosis == patient.diagnosis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, diagnosis, numberMedicalCard);
    }
}
