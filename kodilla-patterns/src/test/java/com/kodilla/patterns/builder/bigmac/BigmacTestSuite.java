package com.kodilla.patterns.builder.bigmac;

import com.kodilla.patterns.builder.pizza.Pizza;
import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame")
                .ingredient("lettuce")
                .burgers(1)
                .ingredient("lettuce")
                .sauce("Spicy")
                .burgers(1)
                .sauce("Spicy")
                .ingredient("Onion")
                .ingredient("Beckon")
                .ingredient("chili")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(5, howManyIngredients);
    }
}
