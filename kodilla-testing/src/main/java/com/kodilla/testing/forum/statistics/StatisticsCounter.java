package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;

import java.util.List;
import java.util.ArrayList;

public class StatisticsCounter {


    int numbersOfUser;
    int numberOfPosts;
    int numbersOfComments;

    double avarageOfPostsForUser;
    double avarageOfCommentsForUser;
    double avarageOfCommentsForPost;


    Statistics statistics;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }


    void calculateAdvStatistics(Statistics statistics) {

        //List<String> userName = new ArrayList<>();

        numbersOfUser = statistics.userName().size();

        numberOfPosts = statistics.postsCount();

        numbersOfComments = statistics.commontsCount();

        avarageOfPostsForUser = numbersOfUser / numberOfPosts;

        avarageOfCommentsForUser = statistics.userName().indexOf(statistics) / numbersOfComments;

        avarageOfCommentsForPost = statistics.commontsCount() / statistics.postsCount();

    }

    public void showStatistics() {

        System.out.println("Number User on the Forum: " + numbersOfUser);
        System.out.println("Number of post on the Forum: "+ numberOfPosts);
        System.out.println("Number of comments on the Forum: " + numbersOfComments);
        System.out.println("Avarage post for User: " + avarageOfCommentsForPost);
        System.out.println("Avarage Comments for User: " + avarageOfCommentsForUser);
        System.out.println("Avarage Comments for Post: " + avarageOfCommentsForPost);

    }

}
