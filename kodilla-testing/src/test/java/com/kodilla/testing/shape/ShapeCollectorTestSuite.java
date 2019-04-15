package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;

public class ShapeCollectorTestSuite {
    @Before
    public void beforeEveryTest(){

        System.out.println("Preparing to execute next test...");
    }
    @BeforeClass
    public static void beforeAllTests(){
        System.out.println("This is the beginning of tests.");
    }
    @AfterClass
    public static void afterAllTests(){
        System.out.println("All tests are finished");
    }

    @Test
    public void testAddFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 25, 5);
        // When
        shapeCollector.addFigure(square);
        int result = shapeCollector.figuresCount();
        // Then
        Assert.assertEquals(1, result);
    }
    @Test
    public void testRemoveFigure(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square("square", 25, 5);
        // When
        shapeCollector.addFigure(square);
        boolean result = shapeCollector.removeFigure(square);
        // Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, shapeCollector.figuresCount());
    }
    @Test
    public void testRemoveFigureNotExisting(){
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle("triangle",25, 5, 10);
        // When
        boolean result = shapeCollector.removeFigure(triangle);
        // Then
        Assert.assertFalse(result);
    }
    @Test
    public void testGetFigure(){
        // Given
        ArrayList<Shape> collection = new ArrayList<>();
        ShapeCollector shapeCollector = new ShapeCollector();
        collection.add(new Triangle("triangle",25, 5, 10));
        // When
        shapeCollector.addFigure(new Triangle("triangle",25, 5, 10));
        Shape result = shapeCollector.getFigure(0);
        // Then
        Assert.assertEquals(collection.get(0), result);
    }
    @Test
    public void testGetFigureNotExisting() {
        // Given
        ShapeCollector shapeCollector = new ShapeCollector();
        // When
        Shape result = shapeCollector.getFigure(5);
        // Then
        Assert.assertNull(result);
    }
    @Test
    public void testShowFigures(){
        // Given
        ArrayList<Shape> collection = new ArrayList<>();
        collection.add(new Square("square", 25, 5));
        collection.add(new Triangle("triangle",25, 5, 10));
        collection.add(new Circle("circle", 78.5, 5));
        ShapeCollector shapeCollector = new ShapeCollector();
        // When
        shapeCollector.addFigure(new Square("square", 25, 5));
        shapeCollector.addFigure(new Triangle("triangle",25, 5, 10));
        shapeCollector.addFigure(new Circle("circle", 78.5, 5));
        ArrayList<Shape> result = shapeCollector.showFigures();
        // Then
        Assert.assertEquals(collection, result);
    }
}
