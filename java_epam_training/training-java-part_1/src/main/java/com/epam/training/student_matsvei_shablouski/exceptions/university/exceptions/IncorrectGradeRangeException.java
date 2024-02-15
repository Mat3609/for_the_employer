package com.epam.training.student_matsvei_shablouski.exceptions.university.exceptions;

public class IncorrectGradeRangeException extends RuntimeException{
    public IncorrectGradeRangeException() {
    }

    public IncorrectGradeRangeException(String message) {
        super(message);
    }

    public IncorrectGradeRangeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectGradeRangeException(Throwable cause) {
        super(cause);
    }
}
