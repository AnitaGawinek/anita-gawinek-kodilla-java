package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User john = new Millenials("John1980");
        User maria = new YGeneration("Maria1992");
        User patrick = new ZGeneration("Patrick1997");

        // When
        String johnShare = john.sharePost();
        System.out.println("John share post by: " + johnShare);
        String mariaShare = maria.sharePost();
        System.out.println("Maria share post by: " + mariaShare);
        String patrickShare = patrick.sharePost();
        System.out.println("Patrick share post by: " + patrickShare);

        // Then
        Assert.assertEquals("Facebook", johnShare);
        Assert.assertEquals("Twitter", mariaShare);
        Assert.assertEquals("Snapchat", patrickShare);
    }

    @Test
    public void testIndividualSharingStrategy(){
        // Given
        User maria = new YGeneration("Maria1992");

        // When
        String mariaShare = maria.sharePost();
        System.out.println("Maria share post by: " + mariaShare);
        maria.setPublisher(new FacebookPublisher());
        mariaShare = maria.sharePost();
        System.out.println("Maria now share post by: " + mariaShare);

        // Then
        Assert.assertEquals("Facebook", mariaShare);
    }
}
