package com.epam.training.student_matsvei_shablouski.classes.main_task.student_sort;


public class Main {
    public static void main(String[] args) {

        Student student = new Student(2233, "Andy", "Bayker street 221b", 4, Faculty.INO, 1995);
        Student student1 = new Student(2244, "Andrew", "Braytan avenue 12", 5, Faculty.PIANO, 2003);
        Student student2 = new Student(2255, "Kris", "Wole street 233", 1, Faculty.BRASS_BAND, 2001);
        Student student3 = new Student(2266, "Amanda", "Wite house 88", 2, Faculty.BRASS_BAND, 1992);
        Student student4 = new Student(2277, "Kate", "Las vegas 1", 2, Faculty.PIANO, 1996);
        Student student5 = new Student(2288, "Sam", "Saylant hill 234", 1, Faculty.INO, 1996);
        Student student6 = new Student(2299, "Jon", "Grant cannyon", 3, Faculty.PIANO, 1983);
        Student student7 = new Student(1166, "Matthew", "Pogranichnaya 10", 5, Faculty.INO, 1999);

        University university = new University();

        university.addStudents(student);
        university.addStudents(student1);
        university.addStudents(student2);
        university.addStudents(student3);
        university.addStudents(student4);
        university.addStudents(student5);
        university.addStudents(student6);
        university.addStudents(student7);


        System.out.println(university.getListStudentsForEachFacultyAndCourse());


    }
}
