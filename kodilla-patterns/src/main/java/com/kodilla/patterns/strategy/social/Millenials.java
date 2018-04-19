package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    Millenials(String userName) {
        super(userName);
        this.socialPublisher = new FacebookPublisher();
    }
}
