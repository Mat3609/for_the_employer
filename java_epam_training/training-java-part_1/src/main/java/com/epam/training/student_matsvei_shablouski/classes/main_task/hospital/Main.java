package com.epam.training.student_matsvei_shablouski.classes.main_task.hospital;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Dmitry", "Khrolovich", Diagnosis.AUTISM, 46);
        Patient patient1 = new Patient("Sasha", "Shaushenko", Diagnosis.ANUREZ, 52);
        Patient patient2 = new Patient("Volodya", "Putler", Diagnosis.MARAZM, 53);
        Patient patient3 = new Patient("Adolf", "Hitler", Diagnosis.PSIHOZ, 66);
        Patient patient4 = new Patient("Iosif", "Stalin", Diagnosis.ANUREZ, 62);
        Patient patient5 = new Patient("Iosif", "Kabzon", Diagnosis.MARAZM, 48);
        Patient patient6 = new Patient("Lector", "Ganibal", Diagnosis.PSIHOZ, 50);

        Hospital hospital = new Hospital();
        hospital.addPatient(patient);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);
        hospital.addPatient(patient6);


        System.out.println(hospital.getListOfPatientsWithThisDiagnosis(Diagnosis.PSIHOZ));
        System.out.println(hospital.getListPatientsNumberMedCardGivenInterval(50, 60));

    }
}
