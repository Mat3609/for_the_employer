package com.epam.training.student_matsvei_shablouski.classes.main_task.student_sort;



import java.util.List;

public interface SortMethods {
    List<Student> getListStudentsByGivenFaculty(Faculty faculty);
    List<Student> getListStudentsForEachFacultyAndCourse();
    List<Student> getListStudentsBornAfterGivenEar(int ear);
    List<Student> getListStudyGroup();
}
