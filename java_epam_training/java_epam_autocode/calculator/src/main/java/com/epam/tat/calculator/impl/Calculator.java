package com.epam.tat.calculator.impl;

import com.epam.tat.calculator.ICalculator;



public class Calculator implements ICalculator {

    private int precision;


    public Calculator(int precision) {
        this.precision = precision;
    }

    @Override
    public double add(double a, double b) {
        double result = a + b;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) return result;

        double scale = Math.pow(10.0, precision);
        return Math.round(result * scale) / scale;
    }

    @Override
    public double subtract(double a, double b) {
        double result = a - b;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) return result;

        double scale = Math.pow(10.0, precision);
        return Math.round(result * scale) / scale;
    }

    @Override
    public double multiply(double a, double b) {
        double result = a * b;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) return result;

        double scale = Math.pow(10.0, precision);
        return Math.round(result * scale) / scale;
    }

    @Override
    public double divide(double a, double b){
        double result = a / b;
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) return result;

        double scale = Math.pow(10.0, precision);
        return Math.round(result * scale) / scale;
    }
}
