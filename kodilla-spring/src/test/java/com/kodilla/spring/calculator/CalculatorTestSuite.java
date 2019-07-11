package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        // When
        double resultAdd = calculator.add(5, 5);
        double resultSub = calculator.sub(5, 5);
        double resultMul = calculator.mul(5, 5);
        double resultDiv = calculator.div(5, 5);
        // Then
        Assert.assertEquals(10.0, resultAdd, 0.001);
        Assert.assertEquals(0.0, resultSub, 0.001);
        Assert.assertEquals(25.0, resultMul, 0.001);
        Assert.assertEquals(1.0, resultDiv, 0.001);
    }
}
