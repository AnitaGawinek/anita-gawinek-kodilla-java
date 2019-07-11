package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd(){
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        board.getToDoList().addTask("Pay the bill");
        board.getInProgressList().addTask("Resolve the exercise");
        board.getDoneList().addTask("Go to the doctor");

        // When
        String result1 = board.getToDoList().getTasks().get(0);
        System.out.println(result1);
        String result2 = board.getInProgressList().getTasks().get(0);
        System.out.println(result2);
        String result3 = board.getDoneList().getTasks().get(0);
        System.out.println(result3);

        // Then
        Assert.assertEquals("Pay the bill", result1);
        Assert.assertEquals("Resolve the exercise", result2);
        Assert.assertEquals("Go to the doctor", result3);
    }
}
