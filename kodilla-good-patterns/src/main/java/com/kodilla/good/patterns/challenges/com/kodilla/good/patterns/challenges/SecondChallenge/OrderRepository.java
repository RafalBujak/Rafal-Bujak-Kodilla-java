package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.time.LocalDate;

public interface OrderRepository {
    boolean createOrder(User user, TypOfProducts productType, LocalDate localDate);
}
