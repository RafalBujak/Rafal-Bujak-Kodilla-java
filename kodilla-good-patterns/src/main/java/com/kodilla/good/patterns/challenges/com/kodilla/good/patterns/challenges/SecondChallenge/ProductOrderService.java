package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.time.LocalDate;

public class ProductOrderService implements OrderService {

    public boolean order(User user, TypOfProducts productType, LocalDate localDate) {
        Products storage = new Products();
        if (storage.storageOfProducts().containsKey(productType.getType())) {
            System.out.println("Product type of "
                    + productType.getType()
                    + " has been ordered at "
                    + localDate.toString()
                    + " by " + user.getFirstName()
                    + " " + user.getLastName());
            return true;
        } else {
            System.out.println("Product is not available!");
            return false;
        }

    }
}
