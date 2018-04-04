package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.util.HashMap;
import java.util.Map;

public class Products {
    Map<String, Integer> availableProducts = new HashMap<>();

    public Map<String, Integer> storageOfProducts() {
        availableProducts.put("Shoes", 25);
        availableProducts.put("Socks", 18);
        availableProducts.put("Trousers", 28);
        availableProducts.put("Toothbrush", 8);
        availableProducts.put("Movies", 12);

        return availableProducts;
    }
}
