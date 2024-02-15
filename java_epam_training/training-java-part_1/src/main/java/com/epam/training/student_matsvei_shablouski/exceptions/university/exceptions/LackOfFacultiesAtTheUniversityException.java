package com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions;

public class LackOfFacultiesAtTheUniversityException extends RuntimeException{
    public LackOfFacultiesAtTheUniversityException() {
    }

    public LackOfFacultiesAtTheUniversityException(String message) {
        super(message);
    }

    public LackOfFacultiesAtTheUniversityException(String message, Throwable cause) {
        super(message, cause);
    }

    public LackOfFacultiesAtTheUniversityException(Throwable cause) {
        super(cause);
    }
}
