package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userId;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numbersOfPosts;

    ForumUser(final int userId, final String userName, final int yearOfBirth,
              final int monthOfBirth, final int dayOfBirth,
              final int numbersOfPosts, final char sex){
        this.userId = userId;
        this.userName = userName;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numbersOfPosts = numbersOfPosts;
        this.sex = sex;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumbersOfPosts() {
        return numbersOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", numbersOfPosts=" + numbersOfPosts +
                '}';
    }
}
