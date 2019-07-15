package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac(){
        // Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("With sesame seeds")
                .sauce("Standard")
                .burgers(0)
                .ingredient("Lettuce")
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Chilli peppers")
                .ingredient("Cheese")
                .build();
        System.out.println(bigmac);

        // When
        int howManyIngredients = bigmac.getIngredients().size();

        // Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
