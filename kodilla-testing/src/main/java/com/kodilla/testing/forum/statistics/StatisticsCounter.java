package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumUser;

public class StatisticsCounter {

    Statistics statistics;

    public StatisticsCounter(Statistics statistics) {
        this.statistics = statistics;
    }

   public int averageOfPostPerUser() {
        if(statistics.userName().size() == 0){
            return 0;
        }
        return  statistics.postsCount()/statistics.userName().size();

    }

   public double getAvarageOfCommentsForUser() {
       if (statistics.userName().size() == 0){
           return 0;
       }
        return statistics.commentsCount() / statistics.userName().size();
    }

    public double getAvarageOfCommentsForPost() {
        if(statistics.postsCount() == 0){
            return 0;
        }
        return statistics.commentsCount() / statistics.postsCount();
    }


    public void showStatistics() {

        System.out.println("Number User on the Forum: " + statistics.userName().size());
        System.out.println("Number of post on the Forum: " + statistics.postsCount());
        System.out.println("Number of comments on the Forum: " + statistics.commentsCount());
        System.out.println("Avarage post for User: " + averageOfPostPerUser());
        System.out.println("Avarage Comments for User: " + getAvarageOfCommentsForUser());
        System.out.println("Avarage Comments for Post: " + getAvarageOfCommentsForPost());

    }

}
