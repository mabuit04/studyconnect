package de.studyconnect.backend.model;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import java.time.LocalDateTime;

public class GroupTest {

    Logger logger
        = Logger.getLogger(
                GroupTest.class.getName());
    
    
    @Test
    void testGroupCreation() {
        logger.info("testGroupCreation running");
        //erstellen der Testobjekte innerhalb des Tests um gegen andere Tests abzusichern
        Group group = new Group();
        User creator = new User();
        
        LocalDateTime createDate = LocalDateTime.now().minusDays(180);
        LocalDateTime updateDate = LocalDateTime.now();

        //group.setId(85);
        group.setName("ISB");
        group.setDescription("Supergruppe");
        group.setVisibility(true);
        group.setMaxMembers(25);
        group.setCreatedBy(creator);
        //schon in BaseEntitiy enthalten:
        group.setCreatedAt(createDate);
        group.setUpdatedAt(updateDate);
        //
        
        //assertEquals(85, group.getId());
        
        
        assertEquals("ISB", group.getName());
        assertEquals("Supergruppe", group.getDescription());
        assertTrue(group.getVisibility());
        assertEquals(25, group.getMaxMembers());
        assertEquals(creator, group.getCreatedBy());
        
        assertEquals(createDate, group.getCreatedAt());
        assertEquals(updateDate, group.getUpdatedAt());
        
    }

    @Test
    void testTeamMembersRelationship() {
        logger.info("testMembersRelationship running");

        //erstellen der Testobjekte innerhalb des Tests um gegen andere Tests abzusichern
        Group group = new Group();
        User member = new User();

        //neues Hashset namens members erzeugen mit lauter Usern drin
        Set<User> members = new HashSet<>();
        //den aktuellen User hinzufügen
        members.add(member);
        //der Gruppe die members hinzufügen
        group.setMembers(members);

        //Abprüfen, ob Gruppengröße == 1
        assertEquals(1, group.getMembers().size());
        //Abprüfen, ob die Gruppe das member enthält
        assertTrue(group.getMembers().contains(member));
    }

}
