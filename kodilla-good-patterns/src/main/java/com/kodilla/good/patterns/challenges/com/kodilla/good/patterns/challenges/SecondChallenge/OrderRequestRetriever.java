package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.time.LocalDate;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {

        User user = new User("John", "Smith");

        TypOfProducts productType = new TypOfProducts("Shoes");

        LocalDate transactionDate = LocalDate.now();

        OrderRequest order = new OrderRequest(user, productType, transactionDate);
        return order;
    }
}
