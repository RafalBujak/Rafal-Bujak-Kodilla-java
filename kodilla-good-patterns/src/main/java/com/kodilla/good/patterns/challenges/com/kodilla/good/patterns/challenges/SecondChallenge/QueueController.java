package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

import java.util.ArrayDeque;

public class QueueController {
    OrderRequestRetriever retriver = new OrderRequestRetriever();
    ArrayDeque<OrderRequest> gueue = new ArrayDeque<>();

    public void addToQueue() {
        gueue.offer(retriver.retrieve());
        System.out.println("Order has been added to queue!");
    }

    // is not using on this moment
    /*
    public void removeFromQueue() {
        OrderRequest temporaryOrder;
        temporaryOrder = gueue.poll();
    }
    */
}
