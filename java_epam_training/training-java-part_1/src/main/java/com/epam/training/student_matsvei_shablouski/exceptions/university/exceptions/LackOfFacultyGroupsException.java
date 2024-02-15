package com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions;

public class LackOfFacultyGroupsException extends RuntimeException{
    public LackOfFacultyGroupsException() {
    }

    public LackOfFacultyGroupsException(String message) {
        super(message);
    }

    public LackOfFacultyGroupsException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfFacultyGroupsException(Throwable cause) {
        super(cause);
    }
}
