package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        // Given
        Country poland = new Country("Poland", new BigDecimal("38104832"));
        Country spain = new Country("Spain", new BigDecimal("46397452"));
        Country france = new Country("France", new BigDecimal("65233271"));
        Country japan = new Country("Japan", new BigDecimal("126577125"));
        Country pakistan = new Country("Pakistan", new BigDecimal("207855697"));
        Country indonesia = new Country("Indonesia", new BigDecimal("255187496"));
        Country egypt = new Country("Egypt", new BigDecimal("101168745"));
        Country ethiopia = new Country("Ethiopia", new BigDecimal("110168745"));
        Country madagascar = new Country("Madagascar", new BigDecimal("26969642"));

        Continent europe = new Continent("Europe");
        europe.addCountry(poland);
        europe.addCountry(spain);
        europe.addCountry(france);

        Continent asia = new Continent("Asia");
        asia.addCountry(japan);
        asia.addCountry(pakistan);
        asia.addCountry(indonesia);

        Continent africa = new Continent("Africa");
        africa.addCountry(egypt);
        africa.addCountry(ethiopia);
        africa.addCountry(madagascar);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);
        // When
        BigDecimal totalPeopleQuantity = world.getPeopleQuantity();
        // Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("977663005");
        Assert.assertEquals(expectedPeopleQuantity, totalPeopleQuantity);
    }
}
