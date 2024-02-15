package com.epam.training.student_matsvei_shablouski.exceptions.university.univer;

import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.LackOfFacultiesAtTheUniversityException;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.StudentsLackOfSubjectsException;

import java.util.ArrayList;
import java.util.List;

public class University {
    String nameUniversity;
    List<Faculty> faculties = new ArrayList<>();

    public University(String name) {
        this.nameUniversity = name;
    }

    public double getAverageGradeBySpecificSubjectAllFaculty(Subject subject) {
        if (faculties == null || faculties.isEmpty()) throw new LackOfFacultiesAtTheUniversityException("Lack of faculties at the university.");
        double averageGrade = 0;
        double amountGrade = 0;
        for (Faculty faculty : faculties) {
            for (Group group : faculty.getGroupsList()) {
                for (Student student : group.getStudentsList()) {
                    if (student.getSubjects() == null || student.getSubjects().isEmpty()) throw new StudentsLackOfSubjectsException("Absence of subjects from the student, there must be at least one.");
                    if (student.getSubjects().containsKey(subject)) {
                        averageGrade += student.getAverageGradeBySubject(subject);
                        amountGrade++;
                    }
                }
            }
        }

        return averageGrade / amountGrade;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public List<Faculty> getFaculties() {
        return faculties;
    }
}
