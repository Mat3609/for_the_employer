package com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions;

public class AbsenceOfStudentsInTheGroupException extends RuntimeException{
    public AbsenceOfStudentsInTheGroupException() {
    }

    public AbsenceOfStudentsInTheGroupException(String message) {
        super(message);
    }

    public AbsenceOfStudentsInTheGroupException(String message, Throwable cause) {
        super(message, cause);
    }

    public AbsenceOfStudentsInTheGroupException(Throwable cause) {
        super(cause);
    }
}
