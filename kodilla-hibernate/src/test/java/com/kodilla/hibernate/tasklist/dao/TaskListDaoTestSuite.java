package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LIST_NAME = "Tasks in progress";

    @Test
    public void testFindByListName(){
        // Given
        TaskList taskList = new TaskList(LIST_NAME);
        taskListDao.save(taskList);

        // When
        List<TaskList> readLists = taskListDao.findByListName(LIST_NAME);
        String name = readLists.get(0).getListName();

        // Then
        Assert.assertEquals(LIST_NAME, name);

        // CleanUp
        int id = readLists.get(0).getId();
        taskListDao.deleteById(id);
    }
}
