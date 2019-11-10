package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        // Given
        Student markCollins = new Student("Mark Collins", "Java Developer");
        Student ivoneEscobar = new Student("Ivone Escobar", "Web Developer");
        Student jessiePinkman = new Student("Jessie Pinkman", "Java Developer");
        Mentor johnSmith = new Mentor("John Smith");
        Mentor jackFreeman = new Mentor("Jack Freeman");
        markCollins.registerObserver(johnSmith);
        ivoneEscobar.registerObserver(johnSmith);
        jessiePinkman.registerObserver(jackFreeman);
        // When
        markCollins.addHomework("www.github.com/markCollins/exercise2_4");
        markCollins.addHomework("www.github.com/markCollins/exercise2_5");
        ivoneEscobar.addHomework("www.github.com/ivoneEscobar/exercise22_1");
        jessiePinkman.addHomework("www.github.com/jessiePinkman/exercise14_2");
        jessiePinkman.addHomework("www.github.com/jessiePinkman/exercise14_3");
        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, jackFreeman.getUpdateCount());
    }
}
