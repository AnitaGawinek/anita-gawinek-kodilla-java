package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args){

        SecondChallenge challenge = new SecondChallenge();

        try {
            System.out.println(challenge.probablyWillThrowException(2, 1));
        } catch (Exception e) {
            System.out.println("Something went wrong! Error: " + e);
        } finally {
            System.out.println("Illegal values: x >= 2 || x < 1 || y == 1.5");
        }
    }
}
