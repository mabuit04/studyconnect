package de.studyconnect.backend.entities;

import jakarta.persistence.*;
//import jakarta.validation.constraints.Email;
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//import lombok.Getter;
//import lombok.Setter;

//import java.util.HashSet;
//import java.util.Set;

@Entity
@Table(name = "users")
//@Getter
//@Setter
public class User extends BaseEntity {

    private String id;

    private String email;

    private String password_hash;
    private String name;
    private String created_at;
    private String last_login;


    
}
