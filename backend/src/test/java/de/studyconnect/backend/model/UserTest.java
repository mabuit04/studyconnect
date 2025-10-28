package de.studyconnect.backend.model;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;



class UserTest {
    
    Logger logger
        = Logger.getLogger(
                UserTest.class.getName());



    @Test
    void testUserCreation() {
        logger.info("testUserCreation running");

        //test user in der test funktion erstellen um störungen unter tests auszuschließen
        User user = new User();

        //Test object creation with valid data
        user.setName("John");
        user.setEmail("john.doe@example.com");
        user.setPassword("password123!");
        //user.setId(10);
        //Wie wird jetzt eigentlich die ID getestet? Die wird ja von BaseEntitiy
        //übernommen...

        assertEquals("John", user.getName());
        
        assertEquals("john.doe@example.com", user.getEmail());
        assertEquals("password123!", user.getPassword());
        //assertEquals(10, user.getId());
        logger.info("testUserCreation finished");

    }

    @Test
    void testUserGroupRelationship() {
        logger.info("testUserGroupRelationship running");

        //erstellen der Testobjekte innerhalb des Tests um gegen andere Tests abzusichern
        User user = new User();
        Group group = new Group();

        //neues Hashset mit Gruppen erzeugen
        Set<Group> groups = new HashSet<>();
        //die group dort hinzufügen
        groups.add(group);
        //den Benutzer zu der Gruppe hinzufügen
        user.setGroups(groups);

        //Abprüfen wieviele Benutzer Teil der Gruppe sind
        assertEquals(1, user.getGroups().size());
        //Abprüfen, ob DER Benutzer Teil der Gruppe ist
        assertTrue(user.getGroups().contains(group));
        logger.info("testUserGroupRelationship finished");

    }

    //Test von Entity Beziehungen -> zwischen User und Task
    @Test
    void testUserTaskRelationship() {
        logger.info("testUserTaskRelationship running");  

        //erstellen der Testobjekte
        User user = new User();
        Task task = new Task();

        task.setTitle("Neue Aufgabe");

        //Aufgabe dem Test User zuweisen
        user.getTasks().add(task);
        task.setAssignee(user);

        //Testabfrage ob user die Aufgabe sehen kann
        assertEquals(1, user.getTasks().size());
        assertTrue(user.getTasks().contains(task));
        logger.info("testUserTaskRelationship finished");

    }


/*was fehlt: - Test validation constraints
- Test helper methods and business logic. -> ?
Ensure that entity specific tests are available as well, e.g.,:
- Status transitions -> ?
- assignment logic -> ?
- Due data validation -> ?
- Priority management -> ?
*/
    

}