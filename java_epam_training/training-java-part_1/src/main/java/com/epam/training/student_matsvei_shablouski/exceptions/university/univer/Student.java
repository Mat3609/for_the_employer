package com.epam.training.student_matsvei_shablouski.exceptions.university.univer;


import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.IncorrectGradeRangeException;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.StudentsLackOfSubjectsException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Student {
    private String name;
    private int id;
    private Faculty faculty;
    private Map<Subject, ArrayList<Integer>> subjects = new HashMap<>();

    public Student(String name, int id, Faculty faculty) {
        this.name = name;
        this.id = id;
        this.faculty = faculty;
    }



    public double getAverageGradeBySubject(Subject subject) {
        if (subjects == null || subjects.isEmpty()) throw new StudentsLackOfSubjectsException("Absence of subjects from the student, there must be at least one.");
        double sumGrades = 0;
        double amountGrade = 0;
        List<Integer> gradeList = subjects.get(subject);
        for (Integer grade : gradeList) {
            sumGrades += grade;
            amountGrade++;
        }
        return  sumGrades / amountGrade;
    }


    public void initializationSubjects(Subject[] subject) {
        for (Subject subj : subject) {
            subjects.put(subj, new ArrayList<>());
        }
    }

    public void addGrades(Subject subject, ArrayList<Integer> integerList) {
        if (integerList.stream().anyMatch(integer -> integer <= 0 || integer > 10)) throw new IncorrectGradeRangeException("Incorrect grade range");
        subjects.put(subject, integerList);
    }



    public Faculty getFaculty() {
        return faculty;
    }

    public Map<Subject, ArrayList<Integer>> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", faculty=" + faculty +
                ", subjects=" + subjects +
                '}';
    }
}
