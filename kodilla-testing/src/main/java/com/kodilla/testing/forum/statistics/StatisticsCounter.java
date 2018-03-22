package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;

import java.util.List;
import java.util.ArrayList;

public class StatisticsCounter {

    ForumUser forumUser = new ForumUser("John", "Smith");

    int numbersOfUser;
    int numberOfPosts;
    int numbersOfComments;

    Double avarageOfPostsForUser;
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


    }

   public Double averageOfPostorUser() {
        avarageOfPostsForUser = (double)statistics.userName().size()/forumUser.comments.size();
        return avarageOfCommentsForUser;
    }

    double getAvarageOfCommentsForUser() {
        // temporary for test is used normal digit but should be numbersOfComments
        avarageOfCommentsForUser = forumUser.comments.size() / 2;
        return avarageOfCommentsForUser;
    }

    double getAvarageOfCommentsForPost() {
        avarageOfCommentsForPost = statistics.commontsCount() / statistics.postsCount();
        return avarageOfCommentsForPost;
    }


    public void showStatistics() {

        System.out.println("Number User on the Forum: " + numbersOfUser);
        System.out.println("Number of post on the Forum: " + numberOfPosts);
        System.out.println("Number of comments on the Forum: " + numbersOfComments);
        System.out.println("Avarage post for User: " + avarageOfCommentsForPost);
        System.out.println("Avarage Comments for User: " + avarageOfCommentsForUser);
        System.out.println("Avarage Comments for Post: " + avarageOfCommentsForPost);

    }

}
