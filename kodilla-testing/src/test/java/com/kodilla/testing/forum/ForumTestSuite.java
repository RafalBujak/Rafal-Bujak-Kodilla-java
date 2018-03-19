package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimplerUser;
import org.junit.*;


public class ForumTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }

    @After

    public void after(){
        System.out.println("Test Case: end");
    }

    @BeforeClass
    public static void beforClass(){
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Test Suite: end");
    }

    @Test

    public void testCaseUserName(){
        //Given
        SimplerUser simpleUser = new SimplerUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getUserName();
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealName(){
        //Given
        SimplerUser simpleUser = new SimplerUser("theForumUser", "John Smith");
        //When
        String result = simpleUser.getRealName();
        System.out.println("Testing " + result);
        //Then
        Assert.assertEquals("John Smith", result);

    }
}
