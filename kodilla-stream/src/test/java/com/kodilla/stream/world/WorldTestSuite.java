package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testWorldPeopleQuantity() {

        //Given
        Country poland = new Country("Poland", new BigDecimal("40000000"));
        Country germany = new Country("Germany", new BigDecimal("80000000"));
        Country UK = new Country("UK", new BigDecimal("60000000"));
        Country USA = new Country("USA", new BigDecimal("90000000"));
        Country mexico = new Country("Mexico", new BigDecimal("75000000"));
        Country russia = new Country("Russia", new BigDecimal("125000000"));
        Country china = new Country("China", new BigDecimal("140000000"));
        Country egypt = new Country("Egypt", new BigDecimal("56000000"));
        Country canada = new Country("Canada", new BigDecimal("48000000"));


        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();

        //When
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(UK);
        northAmerica.addCountry(USA);
        northAmerica.addCountry(mexico);
        asia.addCountry(russia);
        asia.addCountry(china);
        africa.addCountry(egypt);
        africa.addCountry(canada);

        World World = new World();
        World.addContinent(europe);
        World.addContinent(asia);
        World.addContinent(northAmerica);
        World.addContinent(africa);

        BigDecimal calculatedTotalPeople = World.getPeopleQuantity();


        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("714000000");
        Assert.assertEquals(expectedTotalPeople, calculatedTotalPeople);

    }
}
