package com.kodilla.patterns.strategy.social;

public class ZGeneration extends User {
    ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}
