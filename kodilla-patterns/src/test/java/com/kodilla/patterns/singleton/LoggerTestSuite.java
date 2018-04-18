package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testOfLogMethod() {

        //given
        Logger.getInstance().log("new log");
        //When
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("new log", result);
    }
}
