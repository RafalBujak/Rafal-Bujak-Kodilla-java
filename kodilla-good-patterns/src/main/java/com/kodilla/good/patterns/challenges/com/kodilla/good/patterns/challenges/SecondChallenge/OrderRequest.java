package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.time.LocalDate;

public class OrderRequest {
    private User user;
    private TypOfProducts productType;
    private LocalDate transactionDate;


    public OrderRequest(User user, TypOfProducts productType, LocalDate transactionDate) {
        this.user = user;
        this.productType = productType;
        this.transactionDate = transactionDate;
    }

    public User getUser() {
        return user;
    }

    public TypOfProducts getProductType() {
        return productType;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }
}
