package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testShoppingTask(){
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPING);
        shoppingTask.executeTask();
        // Then
        Assert.assertEquals("Buy", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testPaintingTask(){
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING);
        // Then
        Assert.assertEquals("Paint", paintingTask.getTaskName());
        Assert.assertFalse(paintingTask.isTaskExecuted());
    }

    @Test
    public void testDrivingTask(){
        // Given
        TaskFactory factory = new TaskFactory();
        // When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING);
        // Then
        Assert.assertEquals("Drive", drivingTask.getTaskName());
        Assert.assertFalse(drivingTask.isTaskExecuted());
    }
}
