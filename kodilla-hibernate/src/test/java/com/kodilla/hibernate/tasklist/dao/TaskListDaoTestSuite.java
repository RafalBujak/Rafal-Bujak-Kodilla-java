package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "TEST";
    private static final String LISTNAME = "Only for testing";

    @Test
    public void testFindByListName() {

        //Given
        TaskList task = new TaskList(LISTNAME, DESCRIPTION);

        //When
        taskListDao.save(task);

        //Then
        int id = task.getId();
        TaskList readTask = taskListDao.findOne(id);
        Assert.assertEquals(id, readTask.getId());

        //CleanUp
        taskListDao.delete(id);
    }

}
