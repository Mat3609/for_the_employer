package com.epam.training.student_matsvei_shablouski.exceptions.university.client;
import com.epam.training.student_matsvei_shablouski.exceptions.university.constants.Subject;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Faculty;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Group;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.Student;
import com.epam.training.student_matsvei_shablouski.exceptions.university.univer.University;

public interface IReceivingTheInformation {

    double getAverageGradByAllSubjectsSpecificStudent(Student student);
    double getAverageGradeBySpecificSubjectGroupFaculty(Faculty faculty, Group group, Subject subject);
    double getAverageGradeBySubjectAllUniversity(University university, Subject subject);
}
