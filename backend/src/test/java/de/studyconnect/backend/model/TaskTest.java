package de.studyconnect.backend.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    void testTaskCreation() {
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
    }

}
