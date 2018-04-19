package com.kodilla.patterns.strategy.social;

public class YGeneration extends User {
    YGeneration(String userName) {
        super(userName);
        this.socialPublisher = new SnapchatPublisher();
    }
}
