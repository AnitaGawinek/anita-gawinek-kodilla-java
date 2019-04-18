package com.kodilla.testing.forum.statistics;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {
    @Test
    public void testCalculateAdvStatisticsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        usersNamesList.add("Susan");
        usersNamesList.add("Jack");
        usersNamesList.add("Peter");
        usersNamesList.add("Alice");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        assertEquals(5.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(10.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(20.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(2.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(4.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(2.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWith0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(1.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(0.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(0.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWith1000Posts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        usersNamesList.add("Susan");
        usersNamesList.add("Jack");
        usersNamesList.add("Peter");
        usersNamesList.add("Alice");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(5.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(1000.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(1000.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(200.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(200.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(1.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWith0Comments(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(1.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(1.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(0.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(1.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMorePostsThanComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        usersNamesList.add("Susan");
        usersNamesList.add("Jack");
        usersNamesList.add("Peter");
        usersNamesList.add("Alice");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(800);
        when(statisticsMock.commentsCount()).thenReturn(400);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(5.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(800.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(400.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(160.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(80.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(0.5, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        usersNamesList.add("Mike");
        usersNamesList.add("Susan");
        usersNamesList.add("Jack");
        usersNamesList.add("Peter");
        usersNamesList.add("Alice");
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(1);
        when(statisticsMock.commentsCount()).thenReturn(5);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(5.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(1.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(5.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(0.2, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(1.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(5.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWith0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(0.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(0.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(0.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(0.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
    @Test
    public void testCalculateAdvStatisticsWith100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersNamesList = new ArrayList<>();
        while(usersNamesList.size() <100){
            usersNamesList.add("Forum User");
        }
        when(statisticsMock.usersNames()).thenReturn(usersNamesList);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(150);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        // When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        // Then
        assertEquals(100.0, statisticsCounter.getNumberOfUsers(), 0.001);
        assertEquals(50.0, statisticsCounter.getNumberOfPosts(), 0.001);
        assertEquals(150.0, statisticsCounter.getNumberOfComments(), 0.001);
        assertEquals(0.5, statisticsCounter.getAvgPostsPerUser(), 0.001);
        assertEquals(1.5, statisticsCounter.getAvgCommentsPerUser(), 0.001);
        assertEquals(3.0, statisticsCounter.getAvgCommentsPerPost(), 0.001);
        statisticsCounter.showStatistics();
    }
}
