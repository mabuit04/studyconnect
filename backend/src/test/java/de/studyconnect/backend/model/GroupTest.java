package de.studyconnect.backend.model;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import java.time.LocalDateTime;

public class GroupTest {
    

    private Group group;
    private User creator;
    

    @BeforeEach
    void setUp() {
        group = new Group();
        creator = new User();

        
    }

    
    @Test
    void testGroupCreation() {
        
        //LocalDateTime createDate = LocalDateTime.now().minusDays(180);
        //LocalDateTime updateDate = LocalDateTime.now();

        //group.setId(85);
        group.setName("ISB");
        group.setDescription("Supergruppe");
        group.setVisibility(true);
        group.setMaxMembers(25);
        group.setCreatedBy(creator);
        /*schon in BaseEntitiy
        group.setCreatedAt(createDate);
        group.setUpdatedAt(updateDate);
        */
        
        //assertEquals(85, group.getId());
        
        
        assertEquals("ISB", group.getName());
        assertEquals("Supergruppe", group.getDescription());
        assertTrue(group.getVisibility());
        assertEquals(25, group.getMaxMembers());
        assertEquals(creator, group.getCreatedBy());
        
        //assertEquals(createDate, group.getCreatedAt());
        //assertEquals(updateDate, group.getUpdatedAt());
        
    }

    

}
/*private int id;
    private String name;
    private String description;
    private Boolean visibility;
    private int maxMembers;
    private User createdBy;
    private String createdAt;
    private String updatedAt;
} */