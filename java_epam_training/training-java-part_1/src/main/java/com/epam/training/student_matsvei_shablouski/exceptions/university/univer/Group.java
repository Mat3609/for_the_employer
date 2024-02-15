package com.epam.training.student_matsvei_shablouski.exceptions.university.univer;


import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.GroupName;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.AbsenceOfStudentsInTheGroupException;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.InvalidArgumentException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group {
    private GroupName name;
    private Faculty faculty;
    private List<Student> studentsList = new ArrayList<>();

    public Group(GroupName name, Faculty faculty) {
        this.name = name;
        this.faculty = faculty;
    }


    public void addStudents(List<Student> students)  {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (!student.getFaculty().equals(faculty)) throw new InvalidArgumentException("Attempting to add a student with an invalid field \"FacultyName\"");
            this.studentsList.add(student);
        }
    }

    public double getAverageGradeInGroupBySpecificSubject(Subject subject) {
        if (studentsList == null || studentsList.isEmpty()) throw new AbsenceOfStudentsInTheGroupException("Absence of students in this group.");
        double sumGrades = 0;
        double amountGrades = 0;
        Iterator<Student> iterator = studentsList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (!student.getSubjects().containsKey(subject)) {
                throw new InvalidArgumentException("There is no such subject at this group!");
            }
            sumGrades += student.getAverageGradeBySubject(subject);
            amountGrades++;
        }
        return sumGrades / amountGrades;
    }

    public Faculty getFaculty() {
        return faculty;
    }


    public GroupName getName() {
        return name;
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }
}


