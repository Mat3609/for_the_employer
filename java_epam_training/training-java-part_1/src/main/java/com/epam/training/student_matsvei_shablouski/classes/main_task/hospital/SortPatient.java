package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

import java.util.List;

public interface SortPatient {
    List<Patient> getListOfPatientsWithThisDiagnosis(Diagnosis diagnosis);
    List<Patient> getListPatientsNumberMedCardGivenInterval(int fromThis, int toThis);
}
