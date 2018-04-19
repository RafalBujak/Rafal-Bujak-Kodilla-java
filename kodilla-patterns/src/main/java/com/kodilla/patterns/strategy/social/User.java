package com.kodilla.patterns.strategy.social;

public class User {
    private String userName;
    protected SocialPublisher socialPublisher;

    User (String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

    public String selectionSocialPortal() {
        return socialPublisher.share();
    }

    public void setSelection(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
