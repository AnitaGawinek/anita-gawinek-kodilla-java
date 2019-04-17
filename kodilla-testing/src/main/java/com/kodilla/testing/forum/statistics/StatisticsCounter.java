package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    private double numberOfUsers;
    private double numberOfPosts;
    private double numberOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        numberOfUsers = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        avgPostsPerUser = getAvgPostsPerUser();
        avgCommentsPerUser = getAvgCommentsPerUser();
        avgCommentsPerPost = getAvgCommentsPerPost();
    }
    public double getNumberOfUsers() {
        return numberOfUsers;
    }
    public double getNumberOfPosts() {
        return numberOfPosts;
    }
    public double getNumberOfComments() {
        return numberOfComments;
    }
    public double getAvgPostsPerUser() {
        if ((numberOfPosts == 0) || (numberOfUsers == 0)) {
            return 0;
        } else {
            avgPostsPerUser = numberOfPosts / numberOfUsers;
            return avgPostsPerUser;
        }
    }
    public double getAvgCommentsPerUser() {
        if (numberOfComments == 0 || numberOfUsers == 0){
            return 0;
        } else {
            avgCommentsPerUser = numberOfComments / numberOfUsers;
            return avgCommentsPerUser;
        }
    }
    public double getAvgCommentsPerPost() {
        if (numberOfComments == 0 || numberOfPosts == 0){
            return 0;
        } else {
            avgCommentsPerPost = numberOfComments / numberOfPosts;
            return avgCommentsPerPost;
        }
    }
    public void showStatistics(){
        System.out.println("Numbers of users: " + numberOfUsers
                + "\n Numbers of posts: " + numberOfPosts
                + "\n Numbers of comments: " + numberOfComments
                + "\n Average posts per user: " + avgPostsPerUser
                + "\n Average comments per user: " + avgCommentsPerUser
                + "\n Average comments per post: " + avgCommentsPerPost);
    }
}
