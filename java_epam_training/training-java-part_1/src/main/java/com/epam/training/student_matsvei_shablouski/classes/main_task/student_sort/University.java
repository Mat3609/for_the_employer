package com.epam.training.student_matsvei_shablouski.classes.main_task.student_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class University implements SortMethods {

    private List<Student> studentsList;

    public University() {
        studentsList = new ArrayList<>();
    }

    public void addStudents(Student student) {
        studentsList.add(student);
    }


    @Override
    public List<Student> getListStudentsByGivenFaculty(Faculty faculty) {
       return studentsList.stream().filter(student -> student.getFaculty() == faculty).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Student> getListStudentsForEachFacultyAndCourse() {
        return studentsList.stream().
                            sorted(Comparator.comparing(Student :: getFaculty).thenComparing(Student :: getCurs)).
                            collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Student> getListStudentsBornAfterGivenEar(int ear) {
        return studentsList.stream().filter(student -> student.getBirthday() > ear).collect(Collectors.toUnmodifiableList());
    }

    @Override
    public List<Student> getListStudyGroup() {
        return studentsList;
    }
}
