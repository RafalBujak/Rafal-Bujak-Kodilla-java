package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {

        //given
        User johnSmith = new Millenials("John Smith");
        User bradPitt = new YGeneration("Brad pitt");
        User billyKid = new ZGeneration("Billy Kid");
        //when
        String johnPublisher = johnSmith.sharePost();
        System.out.println(johnPublisher);
        String ediPublisher = bradPitt.sharePost();
        System.out.println(ediPublisher);
        String billyPublisher = billyKid.sharePost();
        System.out.println(billyPublisher);
        //then
        Assert.assertEquals("Facebook Publisher", johnPublisher);
        Assert.assertEquals("SnapChat Publisher", ediPublisher);
        Assert.assertEquals("Twitter Publisher", billyPublisher);

    }

    @Test
    public void testIndividualSharingStrategy() {

        //given
        User molly = new Millenials("Molly Olly");
        System.out.println("Molly: before changing publisher - ");
        System.out.println(molly.sharePost());
        //when
        molly.setSelection(new TwitterPublisher());
        String mollyPublisher = molly.sharePost();
        System.out.println("Molly: after changing publisher - ");
        System.out.println(mollyPublisher);
        //then
        Assert.assertEquals("Twitter Publisher", mollyPublisher);
    }
}
