package de.studyconnect.backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;






class UserTest {

    private User user;
    //für relationship testing
    private Group group;
    

    @BeforeEach
    void setUp() {
        user = new User();
        group = new Group();
    }

    
    @Test
    void testUserCreation() {
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
    }

    @Test
    void testUserGroupRelationship() {
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
    }

/*was fehlt: - Test validation constraints
- Test relationships between entities -> Beziehung zw. User und Task
- Test helper methods and business logic. -> ?
Ensure that entity specific tests are available as well, e.g.,:
- Status transitions -> ?
- assignment logic -> ?
- Due data validation -> ?
- Priority management -> ?
*/
    

}