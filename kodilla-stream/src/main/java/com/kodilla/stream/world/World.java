package com.kodilla.stream.world;


import java.math.BigDecimal;
import java.util.*;

public final class World {
    private final Set<Continent> continents = new HashSet<>();

    public void addContinent(Continent continent) {
        continents.add(continent);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        return continents.equals(world.continents);
    }

    @Override
    public int hashCode() {
        return continents.hashCode();
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(people -> people.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
