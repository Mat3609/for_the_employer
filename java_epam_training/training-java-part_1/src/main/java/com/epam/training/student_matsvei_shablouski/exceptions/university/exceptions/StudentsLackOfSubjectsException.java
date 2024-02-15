package com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions;

public class StudentsLackOfSubjectsException extends RuntimeException {
    public StudentsLackOfSubjectsException() {
    }

    public StudentsLackOfSubjectsException(String message) {
        super(message);
    }

    public StudentsLackOfSubjectsException(String message, Throwable cause) {
        super(message, cause);
    }

    public StudentsLackOfSubjectsException(Throwable cause) {
        super(cause);
    }
}
