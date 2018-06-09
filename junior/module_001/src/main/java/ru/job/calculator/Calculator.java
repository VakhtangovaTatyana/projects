package ru.job.calculator;

public class Calculator {
    private double result;

    void add(double first, double second) {
        this.result = first + second;
    }

    void mult(double first, double second) {
        this.result = first * second;
    }

    void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return result;
    }
}
