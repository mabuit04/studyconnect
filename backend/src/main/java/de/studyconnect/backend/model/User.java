package de.studyconnect.backend.model;

import java.util.HashSet;

import jakarta.persistence.*;

//dependency:<artifactId>spring-boot-starter-validation</artifactId>
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

//import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")

@Getter
@Setter
public class User extends BaseEntity {
    //The annotated element must not be {@code null} and must contain at least one
    //non-whitespace character. Accepts {@code CharSequence}.
    @NotBlank
    /*The string has to be a well-formed email address. Exact semantics of what makes up a valid
    * email address are left to Jakarta Validation providers. Accepts {@code CharSequence}.
    * <p>
    * {@code null} elements are considered valid. */
    @Email
    private String email;

    @NotBlank
    @Size(min = 8, max = 32)
    private String password;
    
    @NotBlank
    private String name;

    //private int id;
    
    //ManytoMany ist so eine Datenbankannotation, eine Gruppe
    //hat viele Member und ein User kann in mehreren Gruppen Mitglied sein
    @ManyToMany(mappedBy = "members")
    private Set<Group> groups = new HashSet<>();
}