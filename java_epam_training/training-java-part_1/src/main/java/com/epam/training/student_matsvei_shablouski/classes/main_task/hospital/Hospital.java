package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hospital implements SortPatient {

    private List<Patient> patients;

    public Hospital() {
        patients = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    @Override
    public List<Patient> getListOfPatientsWithThisDiagnosis(Diagnosis diagnosis) {
        return patients.stream().filter(patient -> patient.getDiagnosis() == diagnosis).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Patient> getListPatientsNumberMedCardGivenInterval(int fromThis, int toThis) {
        return patients.stream().
                        filter(patient -> patient.getNumberMedicalCard() > fromThis && patient.getNumberMedicalCard() < toThis).
                        collect(Collectors.toUnmodifiableList());
    }
}
