package com.kodilla.testing.calculator;

public class Calculator {
    public int a;
    public int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public int subtract(int a, int b){
        int c = a - b;
        return c;
    }
}
