package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;
import java.lang.*;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        if(result.equals("theForumUser")) {
            System.out.println("Test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator(45, 500);
        int result1 = calculator.add(45, 500);
        if(result1 == 545){
            System.out.println("Result of adding numbers is correct");
        } else {
            System.out.println("Result of adding numbers is incorrect");
        }

        int result2 = calculator.subtract(45, 500);
        if(result2 == -455) {
            System.out.println("Result of subtracting numbers is correct");
        } else {
            System.out.println("Result of subtracting numbers is incorrect");
        }
    }
}