package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String userName;

    ForumUser() {
        this.userName = "John Smith";
    }

}
