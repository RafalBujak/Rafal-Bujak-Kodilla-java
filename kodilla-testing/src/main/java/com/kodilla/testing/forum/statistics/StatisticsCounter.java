package com.kodilla.testing.forum.statistics;

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

  public StatisticsCounter(Statistics statistics){
      this.statistics = statistics;
  }


    void calculateAdvStatistics(Statistics statistics) {
        List<String> resultStatistics = new ArrayList<>();

        List<String> userName = new ArrayList<>();




    }
    void showStatistics(){

    }

}
