package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

public class Application {
    public static void main (String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();
        OrderingProcessor orderingProcessor = new OrderingProcessor(new ProductOrderService(), new ProductRepositoryService());
        orderingProcessor.process(orderRequest);
    }
}
