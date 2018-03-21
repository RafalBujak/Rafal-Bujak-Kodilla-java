package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestMock {
    ForumUser addPost = new ForumUser("Johne", "Smith");


    @Test
    public void testStatistic() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);

        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);


        //When

        List<String> userName = new ArrayList<>();
        userName.add("Johne smith");
        userName.add("susane smith");
        userName.add("andrew smith");
        userName.add("max smith");


        when(statisticsMock.userName()).thenReturn(userName);



        addPost.addPost("Smith", "First post");


        when(statisticsMock.postsCount()).thenReturn(addPost.posts.size());


        addPost.addComment(new ForumPost("nnn", "Smith"),
                "nnn", "Smith");

        when(statisticsMock.commontsCount()).thenReturn(addPost.comments.size());
        //when

        statisticsCounter.numbersOfUser = statisticsMock.userName().size();

        statisticsCounter.numberOfPosts = statisticsMock.postsCount();

        statisticsCounter.numbersOfComments = statisticsMock.commontsCount();



        // Then
        Assert.assertEquals(4, statisticsCounter.numbersOfUser);
        Assert.assertEquals(1, statisticsCounter.numberOfPosts);
        Assert.assertEquals(1, statisticsCounter.numbersOfComments);

    }

}
