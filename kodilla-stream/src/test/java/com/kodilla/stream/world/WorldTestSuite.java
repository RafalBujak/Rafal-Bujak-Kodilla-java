package com.kodilla.stream.world;

import org.junit.*;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testWorldPeopleQuantity() {

        //Given
        Country Poland = new Country("Poland", new BigDecimal("40000000"));
        Country Germany = new Country("Germany", new BigDecimal("80000000"));
        Country UK = new Country("UK", new BigDecimal("60000000"));
        Country USA = new Country("USA", new BigDecimal("90000000"));
        Country Mexico = new Country("Mexico", new BigDecimal("75000000"));
        Country Russia = new Country("Russia", new BigDecimal("125000000"));
        Country China = new Country("China", new BigDecimal("140000000"));
        Country Egypt = new Country("Egypt", new BigDecimal("56000000"));
        Country Canada = new Country("Canada", new BigDecimal("48000000"));


        Continent Europe = new Continent();
        Continent NorthAmerica = new Continent();
        Continent Asia = new Continent();
        Continent Africa = new Continent();

        //When
        Europe.addCountry(Poland);
        Europe.addCountry(Germany);
        Europe.addCountry(UK);
        NorthAmerica.addCountry(USA);
        NorthAmerica.addCountry(Mexico);
        Asia.addCountry(Russia);
        Asia.addCountry(China);
        Africa.addCountry(Egypt);
        Africa.addCountry(Canada);

        World World = new World();
        World.addContinent(Europe);
        World.addContinent(Asia);
        World.addContinent(NorthAmerica);
        World.addContinent(Africa);

        BigDecimal calculatedTotalPeople = World.getPeopleQuantity();


        //Then
        BigDecimal expectedTotalPeople = new BigDecimal("714000000");
        Assert.assertEquals(expectedTotalPeople, calculatedTotalPeople);

    }
}
