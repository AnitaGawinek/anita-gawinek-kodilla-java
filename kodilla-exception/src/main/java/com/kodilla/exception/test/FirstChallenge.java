package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        try {
            if (b == 0){
                throw new ArithmeticException();
            }
        } catch (ArithmeticException e){
            System.out.println("Oh no! Something went wrong! Error: " + e);
        } finally {
            System.out.println("Remember to never divide by zero!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);
        System.out.println("Result is: " + result);
    }
}
