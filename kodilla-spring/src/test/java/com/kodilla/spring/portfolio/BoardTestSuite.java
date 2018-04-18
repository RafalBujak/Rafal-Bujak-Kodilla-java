package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = (Board) context.getBean("iniOfBoard");
        //When
        String toDoTask = board.getToDoList().getTask(0);
        String inProgressTask = board.getInProgressList().getTask(0);
        String doneTask = board.getDoneList().getTask(0);
        //Then
        Assert.assertEquals("Go to store", toDoTask);
        Assert.assertEquals("Do new task from the course", inProgressTask);
        Assert.assertEquals("Change water in Aquarium", doneTask);
    }
}
