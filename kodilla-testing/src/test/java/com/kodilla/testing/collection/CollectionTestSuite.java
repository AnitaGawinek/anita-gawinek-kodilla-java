package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.lang.*;

public class CollectionTestSuite {
    @Before
    public void before(){System.out.println("Test Case: begin");}
    @After
    public void after(){System.out.println("Test Case: end");}
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        numbers.add(18);
        numbers.add(19);
        numbers.add(20);

        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);

        ArrayList<Integer> expectedNumbers = new ArrayList<>();
        expectedNumbers.add(2);
        expectedNumbers.add(4);
        expectedNumbers.add(6);
        expectedNumbers.add(8);
        expectedNumbers.add(10);
        expectedNumbers.add(12);
        expectedNumbers.add(14);
        expectedNumbers.add(16);
        expectedNumbers.add(18);
        expectedNumbers.add(20);
        //When
        ArrayList<Integer> receivedNumbers = exterminator.exterminate(numbers);
        System.out.println("Expected: " + expectedNumbers);
        //Then
        Assert.assertEquals(expectedNumbers, receivedNumbers);
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> expectedNumbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator(numbers);
        //When
        ArrayList<Integer> receivedNumbers = exterminator.exterminate(numbers);
        System.out.println("Expected: " + expectedNumbers);
        //Then
        Assert.assertEquals(expectedNumbers, receivedNumbers);
    }
}
