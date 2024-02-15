package com.epam.training.student_matsvei_shablouski.classes.main_task.student_sort;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String surname;
    private int birthday;
    private String address;
    private int numberPhone;
    private Faculty faculty;
    private int curs;
    private String group;

    public Student(){};

    public Student(String name) {
        this.name = name;
    }

    public Student(int id, String name, String address, int curs, Faculty faculty, int birthday) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.curs = curs;
        this.faculty = faculty;
        this.birthday = birthday;
    }

    public Student(int id, String name, String surname, int birthday, String address, int numberPhone, Faculty faculty, int curs, String group) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
        this.address = address;
        this.numberPhone = numberPhone;
        this.faculty = faculty;
        this.curs = curs;
        this.group = group;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public int getCurs() {
        return curs;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                ", numberPhone=" + numberPhone +
                ", faculty=" + faculty +
                ", curs=" + curs +
                ", group='" + group + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && birthday == student.birthday && numberPhone == student.numberPhone && curs == student.curs && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && Objects.equals(address, student.address) && faculty == student.faculty && Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, birthday, address, numberPhone, faculty, curs, group);
    }
}
