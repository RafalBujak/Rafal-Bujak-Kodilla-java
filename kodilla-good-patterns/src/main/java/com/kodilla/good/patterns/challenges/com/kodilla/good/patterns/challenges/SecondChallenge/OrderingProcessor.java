package com.kodilla.good.patterns.challenges.com.kodilla.good.patterns.challenges.SecondChallenge;

public class OrderingProcessor {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderingProcessor(final OrderService orderService,
                             final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());

        if (isOrdered) {
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProductType(), orderRequest.getTransactionDate());
            QueueController theQueue = new QueueController();
            theQueue.addToQueue();
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }

}
