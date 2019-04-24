package com.kodilla.stream.forumuser;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1, "Mick90", 'M', 1990, 3, 10,  12));
        forumUserList.add(new ForumUser(2, "Marry93", 'F', 1993, 5, 17,  0));
        forumUserList.add(new ForumUser(3, "Patrick89", 'M', 1989, 10, 7,  7));
        forumUserList.add(new ForumUser(4, "Kate91", 'F', 1991, 11, 19,  2));
        forumUserList.add(new ForumUser(5, "Jack99", 'M', 1999, 1, 4, 0));
        forumUserList.add(new ForumUser(6, "Dean98", 'M', 1998, 4, 12,  0));
        forumUserList.add(new ForumUser(7, "Henry80", 'M', 1980, 3, 5, 10));
        forumUserList.add(new ForumUser(8, "Alice87", 'F', 1987, 12, 7, 10));
        forumUserList.add(new ForumUser(9, "Norah88", 'F', 1988, 1, 15, 15));
        forumUserList.add(new ForumUser(10, "Olivier95", 'M', 1995, 7, 11, 6));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
