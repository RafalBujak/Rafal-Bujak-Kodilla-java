package com.kodilla.spring.portfolio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Bean
    @Scope("prototype")
    public TaskList createToDoList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList createInProgressList() {
        return new TaskList();
    }

    @Bean
    @Scope("prototype")
    public TaskList createDoneList() {
        return new TaskList();
    }

    @Bean
    public Board createBoard() {
        return new Board(createToDoList(), createInProgressList(), createDoneList());
    }

    @Bean
    public Board initializationOfBoard() {
        Board board = new Board(createToDoList(), createInProgressList(), createDoneList());
        board.getToDoList().addTask("Go to store");
        board.getInProgressList().addTask("Do new task from the course");
        board.getDoneList().addTask("Change water in Aquarium");
        return board;
    }
}
