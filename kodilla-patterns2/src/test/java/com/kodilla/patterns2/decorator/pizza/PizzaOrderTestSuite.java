package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza: thin crust, tomato sauce, cheese", description);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        System.out.println(theOrder.getCost());
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(17), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithExtraCheeseOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza: thin crust, tomato sauce, cheese + extra cheese", description);
    }

    @Test
    public void testBasicPizzaWithOtherIngredientsOrderGetCost() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        System.out.println(theOrder.getCost());
        // When
        BigDecimal calculatedCost = theOrder.getCost();
        // Then
        assertEquals(new BigDecimal(26), calculatedCost);
    }

    @Test
    public void testBasicPizzaWithOtherIngredientsOrderGetDescription() {
        // Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new BaconDecorator(theOrder);
        theOrder = new ChickenDecorator(theOrder);
        theOrder = new MushroomsDecorator(theOrder);
        theOrder = new PepperDecorator(theOrder);
        theOrder = new OnionDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        // When
        String description = theOrder.getDescription();
        // Then
        assertEquals("Pizza: thin crust, tomato sauce, cheese + extra cheese + bacon + chicken + mushrooms + pepper + onion", description);
    }
}
