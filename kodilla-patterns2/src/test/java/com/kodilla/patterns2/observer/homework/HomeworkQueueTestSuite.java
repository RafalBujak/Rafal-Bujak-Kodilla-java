package com.kodilla.patterns2.observer.homework;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class HomeworkQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given

        KodillaCourse student1 = new KodillaCourse("Johan Smith");
        KodillaCourse student2 = new KodillaCourse("Danny van Kuil");

        Mentor mentor = new Mentor("Edward Snowden");

        student1.registerObserver(mentor);
        student2.registerObserver(mentor);


        // when
        student1.addTask("I send you new Task for checking");
        student1.addTask("only for check");
        student2.addTask("it was done but i dont know if is OK or not");

        //Then
        assertEquals(3, mentor.getUpdateCount());

    }
}
