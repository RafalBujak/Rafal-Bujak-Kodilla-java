package com.kodilla.testing.forum.statistics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTestMock {

    @Test
    public void testStatistic() {

        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(10);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // Then

        assertEquals(0, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(0.0, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(0.0, statisticsCounter.getAvarageOfCommentsForUser(), 0);
    }

    private List<String> generateUserName(int quantity) {
        List<String> userName = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            userName.add("John smith" + i);
        }
        return userName;
    }

    @Test
    public void testFor1000Posts() {


        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(20);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(200);

        // Then

        assertEquals(50, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(0, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(10, statisticsCounter.getAvarageOfCommentsForUser(), 0);

    }

    @Test
    public void testForNumberOfCommentsLessThan0() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(20);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(0);

        // Then

        assertEquals(5, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(0, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(0, statisticsCounter.getAvarageOfCommentsForUser(), 0);

    }

    @Test
    public void testWhenNumbersOfCommentsLessThanNumbersOfPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(20);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(20);

        // Then

        assertEquals(5, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(0, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(1, statisticsCounter.getAvarageOfCommentsForUser(), 0);
    }

    @Test
    public void testWhenNumbersOfCommentsBiggerThanNumberOfPosts() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(20);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(250);

        // Then

        assertEquals(5, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(2, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(12, statisticsCounter.getAvarageOfCommentsForUser(), 0);

    }

    @Test
    public void testWhenNumbersOfUserIsZero() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(0);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(250);

        // Then

        assertEquals(0, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(2, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(0, statisticsCounter.getAvarageOfCommentsForUser(), 0);
    }

    @Test
    public void testWhenNumbersOfUserIs100() {
        // Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When

        List<String> userName = generateUserName(100);
        when(statisticsMock.userName()).thenReturn(userName);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(250);

        // Then

        assertEquals(1, statisticsCounter.averageOfPostPerUser(), 0);
        assertEquals(2, statisticsCounter.getAvarageOfCommentsForPost(), 0);
        assertEquals(2, statisticsCounter.getAvarageOfCommentsForUser(), 0);
    }

}
