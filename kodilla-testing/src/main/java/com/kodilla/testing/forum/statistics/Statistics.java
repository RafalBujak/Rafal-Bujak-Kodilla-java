package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> userName(); //List of user names
    int postsCount();        // Total quantity of forum posts
    int commontsCount()      // total quantity of forum comments
}


