package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theListForumUser= new ArrayList<>();
//final int userId, final String userName, final LocalDate dateOfBirth,
//              final int numbersOfPosts, final char sex
    public Forum() {
        theListForumUser.add(new ForumUser(1,"JSmith",
                1982, 03, 15,
                1, 'M'));
        theListForumUser.add(new ForumUser(2,"RBuj",
                1985, 04, 14,
                10, 'M'));
        theListForumUser.add(new ForumUser(3,"mouse",
                1995, 9, 30,
                15, 'F'));
        theListForumUser.add(new ForumUser(4,"dengerCat",
                1975, 12, 8,
                0, 'F'));
        theListForumUser.add(new ForumUser(5,"newUser",
                1989, 11, 21,
                21, 'M'));
        theListForumUser.add(new ForumUser(6,"pitbull",
                2000, 2, 18,
                18, 'M'));
        theListForumUser.add(new ForumUser(7,"JSmith2",
                1989, 8, 4,
                13, 'M'));
    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theListForumUser);
    }


}
