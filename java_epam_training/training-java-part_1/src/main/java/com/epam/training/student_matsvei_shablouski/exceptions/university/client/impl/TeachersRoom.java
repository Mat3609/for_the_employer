package com.epam.training.student_matsvei_shablouski.exceptions.university.client.impl;

import com.epam.training.student_matsvei_shablouski.exceptions.university.client.IReceivingTheInformation;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.InvalidArgumentException;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Faculty;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Group;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Student;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.University;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;


public class TeachersRoom implements IReceivingTheInformation {
    @Override
    public double getAverageGradByAllSubjectsSpecificStudent(Student student) {
        double averageGrade = 0;
        double amountOfGradesBySubjects = 0;
        for (Map.Entry<Subject, ArrayList<Integer>> map : student.getSubjects().entrySet()) {
            amountOfGradesBySubjects += map.getValue().size();
            averageGrade += map.getValue().stream().mapToInt(Integer::intValue).sum();
        }
        return averageGrade / amountOfGradesBySubjects;
    }

    @Override
    public double getAverageGradeBySpecificSubjectGroupFaculty(Faculty faculty, Group group, Subject subject) {
        Iterator<Group> iterator = faculty.getGroupsList().iterator();
        while (iterator.hasNext()) {
            Group groupI = iterator.next();
            if (groupI.equals(group)) {
               return groupI.getAverageGradeInGroupBySpecificSubject(subject);
            }
        }
        throw new InvalidArgumentException("There is no such group at this faculty!");
    }

    @Override
    public double getAverageGradeBySubjectAllUniversity(University university, Subject subject) {
        return university.getAverageGradeBySpecificSubjectAllFaculty(subject);
    }
}

