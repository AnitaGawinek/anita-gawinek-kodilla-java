package com.kodilla.testing.collection;
import java.lang.*;
import java.util.*;

class OddNumbersExterminator {
    public OddNumbersExterminator(ArrayList<Integer> numbers) {
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        for(Integer number : numbers){
            if(number % 2 == 0){
                evenNumbers.add(number);
            }
        }
        System.out.println("result is: " + evenNumbers);
        return evenNumbers;
    }
}