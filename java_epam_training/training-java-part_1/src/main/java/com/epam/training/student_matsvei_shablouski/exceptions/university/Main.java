package com.epam.training.student_matsvei_shablouski.exceptions.university;

import com.epam.training.student_matsvei_shablouski.exceptions.university.client.impl.TeachersRoom;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.FacultyName;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.GroupName;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Faculty;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Group;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Student;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.University;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Subject[] subjectsHistoricalFaculty = {Subject.ARCHEOLOGY, Subject.RESTORATION_AND_CONSERVATION, Subject.FIELD_ARCHEOLOGY, Subject.TOTAL_SUBJECT};
        Subject[] subjectsBiologyFaculty = {Subject.BIOLOGY_ACTIVE_SUBSTANCES, Subject.HUMAN_ANATOMY, Subject.PHYSIOLOGY_ANIMAL, Subject.TOTAL_SUBJECT};
        Subject[] subjectsChemicalFaculty = {Subject.BASICS_OF_ENERGY_SUPPLY, Subject.PHYSICAL_CHEMISTRY, Subject.STRUCTURE_OF_SUBSTANCES, Subject.TOTAL_SUBJECT};

        University university = new University("MIT");

        Faculty historicalFaculty  = new Faculty(FacultyName.HISTORICAL);
        Faculty biologyFaculty = new Faculty(FacultyName.BIOLOGY);
        Faculty chemicalFaculty = new Faculty(FacultyName.CHEMICAL);

        Group group1Historical = new Group(GroupName.GROUP1, historicalFaculty);
        Group group2Historical = new Group(GroupName.GROUP2, historicalFaculty);

        Group group1Biology = new Group(GroupName.GROUP1, biologyFaculty);
        Group group2Biology = new Group(GroupName.GROUP2, biologyFaculty);

        Group group1Chemical = new Group(GroupName.GROUP1, chemicalFaculty);
        Group group2Chemical = new Group(GroupName.GROUP2, chemicalFaculty);


        Student student1 = new Student("Matthew", 1, historicalFaculty);
        student1.initializationSubjects(subjectsHistoricalFaculty);
        student1.addGrades(Subject.ARCHEOLOGY, new ArrayList<>(Arrays.asList(1,3,5)));
        student1.addGrades(Subject.RESTORATION_AND_CONSERVATION ,new ArrayList<>(Arrays.asList(6,7,3,9,5)));
        student1.addGrades(Subject.FIELD_ARCHEOLOGY,new ArrayList<>(Arrays.asList(2,3,1)));
        student1.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student2 = new Student("Phil", 2, historicalFaculty);
        student2.initializationSubjects(subjectsHistoricalFaculty);
        student2.addGrades(Subject.ARCHEOLOGY, new ArrayList<>(Arrays.asList(6,7,3,9,5)));
        student2.addGrades(Subject.RESTORATION_AND_CONSERVATION ,new ArrayList<>(Arrays.asList(4,6,2,2)));
        student2.addGrades(Subject.FIELD_ARCHEOLOGY,new ArrayList<>(Arrays.asList(5,9,8,6)));
        student2.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student3 = new Student("Jessica", 3, historicalFaculty);
        student3.initializationSubjects(subjectsHistoricalFaculty);
        student3.addGrades(Subject.ARCHEOLOGY, new ArrayList<>(Arrays.asList(3,2,1,3)));
        student3.addGrades(Subject.RESTORATION_AND_CONSERVATION ,new ArrayList<>(Arrays.asList(4,2,4)));
        student3.addGrades(Subject.FIELD_ARCHEOLOGY,new ArrayList<>(Arrays.asList(7,5,8,3)));
        student3.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student4 = new Student("Jessica", 33, historicalFaculty);
        student4.initializationSubjects(subjectsHistoricalFaculty);
        student4.addGrades(Subject.ARCHEOLOGY, new ArrayList<>(Arrays.asList(3,2,1,3)));
        student4.addGrades(Subject.RESTORATION_AND_CONSERVATION ,new ArrayList<>(Arrays.asList(4,2,4)));
        student4.addGrades(Subject.FIELD_ARCHEOLOGY,new ArrayList<>(Arrays.asList(7,5,8,3)));
        student4.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));


        Student student5 = new Student("Brad", 4, biologyFaculty);
        student5.initializationSubjects(subjectsBiologyFaculty);
        student5.addGrades(Subject.HUMAN_ANATOMY, new ArrayList<>(Arrays.asList(4,10,5,2)));
        student5.addGrades(Subject.BIOLOGY_ACTIVE_SUBSTANCES,new ArrayList<>(Arrays.asList(7,3,9,5)));
        student5.addGrades(Subject.PHYSIOLOGY_ANIMAL,new ArrayList<>(Arrays.asList(5,9,5)));
        student5.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student6 = new Student("Samanta", 5, biologyFaculty);
        student6.initializationSubjects(subjectsBiologyFaculty);
        student6.addGrades(Subject.HUMAN_ANATOMY, new ArrayList<>(Arrays.asList(5,3,6,3)));
        student6.addGrades(Subject.BIOLOGY_ACTIVE_SUBSTANCES,new ArrayList<>(Arrays.asList(8,7,9,7)));
        student6.addGrades(Subject.PHYSIOLOGY_ANIMAL,new ArrayList<>(Arrays.asList(9,5)));
        student6.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student7 = new Student("Bill", 6, biologyFaculty);
        student7.initializationSubjects(subjectsBiologyFaculty);
        student7.addGrades(Subject.HUMAN_ANATOMY, new ArrayList<>(Arrays.asList(5,3,7)));
        student7.addGrades(Subject.BIOLOGY_ACTIVE_SUBSTANCES,new ArrayList<>(Arrays.asList(8,7,9)));
        student7.addGrades(Subject.PHYSIOLOGY_ANIMAL,new ArrayList<>(Arrays.asList(9,5,3,2)));
        student7.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student8 = new Student("Bill", 66, biologyFaculty);
        student8.initializationSubjects(subjectsBiologyFaculty);
        student8.addGrades(Subject.HUMAN_ANATOMY, new ArrayList<>(Arrays.asList(5,3,7)));
        student8.addGrades(Subject.BIOLOGY_ACTIVE_SUBSTANCES,new ArrayList<>(Arrays.asList(8,7,9)));
        student8.addGrades(Subject.PHYSIOLOGY_ANIMAL,new ArrayList<>(Arrays.asList(9,5,3,2)));
        student8.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));


        Student student9 = new Student("Kira", 7, chemicalFaculty);
        student9.initializationSubjects(subjectsChemicalFaculty);
        student9.addGrades(Subject.BASICS_OF_ENERGY_SUPPLY,new ArrayList<>(Arrays.asList(3,7,1,2)));
        student9.addGrades(Subject.PHYSICAL_CHEMISTRY,new ArrayList<>(Arrays.asList(2,5,9,9)));
        student9.getSubjects().get(Subject.STRUCTURE_OF_SUBSTANCES).addAll(Arrays.asList(9,2,7));
        student9.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));


        Student student10 = new Student("Kira", 8, chemicalFaculty);
        student10.initializationSubjects(subjectsChemicalFaculty);
        student10.addGrades(Subject.BASICS_OF_ENERGY_SUPPLY,new ArrayList<>(Arrays.asList(5,3,2)));
        student10.addGrades(Subject.PHYSICAL_CHEMISTRY,new ArrayList<>(Arrays.asList(1,6,9)));
        student10.addGrades(Subject.STRUCTURE_OF_SUBSTANCES,new ArrayList<>(Arrays.asList(8,8,9,7)));
        student10.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));


        Student student11 = new Student("Quentin", 9, chemicalFaculty);
        student11.initializationSubjects(subjectsChemicalFaculty);
        student11.addGrades(Subject.BASICS_OF_ENERGY_SUPPLY,new ArrayList<>(Arrays.asList(1,2)));
        student11.addGrades(Subject.PHYSICAL_CHEMISTRY,new ArrayList<>(Arrays.asList(2,4,5)));
        student11.addGrades(Subject.STRUCTURE_OF_SUBSTANCES,new ArrayList<>(Arrays.asList(3,4,8,7)));
        student11.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        Student student12 = new Student("Quentin", 99, chemicalFaculty);
        student12.initializationSubjects(subjectsChemicalFaculty);
        student12.addGrades(Subject.BASICS_OF_ENERGY_SUPPLY,new ArrayList<>(Arrays.asList(1,2)));
        student12.addGrades(Subject.PHYSICAL_CHEMISTRY,new ArrayList<>(Arrays.asList(2,4,5)));
        student12.addGrades(Subject.STRUCTURE_OF_SUBSTANCES,new ArrayList<>(Arrays.asList(3,4,8,7)));
        student12.addGrades(Subject.TOTAL_SUBJECT,new ArrayList<>(Arrays.asList(2,2,3,1)));

        university.addFaculty(historicalFaculty);
        university.addFaculty(biologyFaculty);
        university.addFaculty(chemicalFaculty);



        group1Historical.addStudents(Arrays.asList(student1,student2));
        group2Historical.addStudents(Arrays.asList(student3,student4));

        group1Biology.addStudents(Arrays.asList(student5, student6));
        group2Biology.addStudents(Arrays.asList(student7, student8));

        group1Chemical.addStudents(Arrays.asList(student9, student10));
        group2Chemical.addStudents(Arrays.asList(student11, student12));


        historicalFaculty.addGroup(group1Historical);
        historicalFaculty.addGroup(group2Historical);

        biologyFaculty.addGroup(group1Biology);
        biologyFaculty.addGroup(group2Biology);

        chemicalFaculty.addGroup(group1Chemical);
        chemicalFaculty.addGroup(group2Chemical);




        TeachersRoom teachersRoom = new TeachersRoom();

        System.out.println(teachersRoom.getAverageGradByAllSubjectsSpecificStudent(student1));
        System.out.println(teachersRoom.getAverageGradeBySpecificSubjectGroupFaculty(biologyFaculty, group2Biology, Subject.HUMAN_ANATOMY));
        System.out.println(teachersRoom.getAverageGradeBySubjectAllUniversity(university, Subject.PHYSICAL_CHEMISTRY));
    }
}
