package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        // Given
        int[] numbers = new int[20];
        numbers[0]= 4;
        numbers[1]= 3;
        numbers[2]= 5;
        numbers[3]= 1;
        numbers[4]= 3;
        numbers[5]= 2;
        numbers[6]= 2;
        numbers[7]= 4;
        numbers[8]= 4;
        numbers[9]= 6;
        numbers[10]= 3;
        numbers[11]= 2;
        numbers[12]= 3;
        numbers[13]= 6;
        numbers[14]= 6;
        numbers[15]= 4;
        numbers[16]= 4;
        numbers[17]= 2;
        numbers[18]= 1;
        numbers[19]= 1;
        // When
        Double expectedAverage = 3.3;
        Double receivedAverage = getAverage(numbers);
        // Then
        Assert.assertEquals(expectedAverage, receivedAverage);
    }
}
