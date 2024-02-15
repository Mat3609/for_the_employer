package com.epam.training.student_matsvei_shablouski.exceptions.university.univer;

import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.FacultyName;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.InvalidArgumentException;
import com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions.LackOfFacultyGroupsException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Faculty {
    private FacultyName facultyname;
    private List<Group> groupsList = new ArrayList<>();

    public Faculty(FacultyName name) {
        this.facultyname = name;
    }



    public double getAverageGradeBySubjectAllGroup(Subject subject) {
        if (groupsList == null || groupsList.isEmpty()) throw new LackOfFacultyGroupsException("The absence of groups in the faculty.");
        double averageGrade = 0;
        Iterator<Group> iterator = groupsList.iterator();
            while (iterator.hasNext()) {
                Group group = iterator.next();
                averageGrade += group.getAverageGradeInGroupBySpecificSubject(subject);
            }
        return averageGrade / groupsList.size();
    }


    public void addGroup(Group group) {
        if (!group.getFaculty().equals(this)) throw new InvalidArgumentException("Attempting to add a group with an invalid field \"FacultyName\"");
        groupsList.add(group);


    }

    public List<Group> getGroupsList() {
        return groupsList;
    }
}
