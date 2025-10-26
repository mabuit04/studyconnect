package de.studyconnect.backend.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import java.util.HashSet;
//import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private User user;
    

    @BeforeEach
    void setUp() {
        user = new User();
        
    }

    
    @Test
    void testUserCreation() {
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

    

}