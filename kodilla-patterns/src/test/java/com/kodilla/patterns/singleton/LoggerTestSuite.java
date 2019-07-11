package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    public void testGetLastLog(){
        // Given
        String firstLog = "First operation";
        String secondLog = "Second operation";
        String lastLog = "Third operation";

        // When
        logger.getInstance().log(firstLog);
        logger.getInstance().log(secondLog);
        logger.getInstance().log(lastLog);
        String result = logger.getInstance().getLastLog();

        // Then
        Assert.assertEquals("Third operation", result);
    }
}
