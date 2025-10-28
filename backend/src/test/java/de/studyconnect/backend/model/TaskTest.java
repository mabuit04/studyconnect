package de.studyconnect.backend.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

    public class TaskTest {
    Logger logger
        = Logger.getLogger(
                TaskTest.class.getName());

    @Test
    void testTaskCreation() {
        logger.info("testTaskCreation running");

        Task task = new Task();
        User user = new User();
        Group group = new Group();

        task.setTitle("Test Aufgabe");
        task.setDescription("Schwere Aufgabe");
        task.setStatus(TaskStatus.TODO);
        task.setAssignee(user);
        task.setGroup(group);

        assertEquals("Test Aufgabe", task.getTitle());
        assertEquals("Schwere Aufgabe", task.getDescription());
        assertEquals(TaskStatus.TODO, task.getStatus());
        assertEquals(user, task.getAssignee());
        assertEquals(group, task.getGroup());
        logger.info("testTaskCreation finished");

    }

    //Task Priority Management Test
    @Test
    void testTaskPriority() {

        logger.info("testTaskPriority running");

        //erstellen eines neuen Test Task
        Task task = new Task();

        //setzen der Task Priority
        task.setPriority(TaskPriority.HIGH);
        //abfragen ob Task priority wirklich auf high gesetzt wurde
        assertEquals(TaskPriority.HIGH, task.getPriority());

        logger.info("testTaskPriority finished");
    }
}
