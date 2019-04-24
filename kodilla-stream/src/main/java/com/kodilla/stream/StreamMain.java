package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> forumUserMap = forum.getUserList().stream()
                .filter(StreamMain::isValidUser)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        forumUserMap.entrySet()
                .forEach(e -> System.out.println(e.getValue()));
    }

    private static boolean isValidUser(ForumUser forumUser) {
        return forumUser.getSex() == 'M' &&
                Period.between(forumUser.getBirthDate(), LocalDate.now()).getYears() > 20 &&
                forumUser.getNumberOfPosts() > 1;
    }
}