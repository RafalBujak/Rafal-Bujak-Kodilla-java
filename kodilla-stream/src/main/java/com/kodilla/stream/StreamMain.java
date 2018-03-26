package com.kodilla.stream;

import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;
import com.kodilla.stream.book.Book;

import java.nio.charset.Charset;
import java.time.LocalDate;
import java.util.List;


import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

    LocalDate dateOfBirthLimit = LocalDate.of(1997,10,19);

     Forum theForumList = new Forum();

     Map<String, ForumUser> theResultMapOfFprumUser = theForumList.getUserList().stream()
             .filter(forumUser -> forumUser.getSex()) == 'M')
             .filter(forumUser -> forumUser.getDateOfBirth().isBefore(dateOfBirthLimit))
             .filter(forumUser -> forumUser.getNumbersOfPosts() > 1)
             .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser))

        System.out.println("# elements: " + theResultMapOfFprumUser.size());
        theResultMapOfFprumUser.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
