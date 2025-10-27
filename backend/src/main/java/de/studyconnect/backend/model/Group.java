package de.studyconnect.backend.model;

import java.util.HashSet;
import java.util.Set;

//import java.time.LocalDateTime;

//dependency:<artifactId>spring-boot-starter-validation</artifactId>
import jakarta.validation.constraints.NotBlank;



import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "groups")

@Getter
@Setter
public class Group extends BaseEntity{

    //private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private Boolean visibility;
    private int maxMembers;
    
    //hier wird manytoOne benötigt, weil ja warum eigentlich?
    @ManyToOne(fetch = FetchType.LAZY)
    private User createdBy;
    /* unnötig weil schon in BaseEntitiy enthalten
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
     */
    
    
     /**
     * Members of this team
     */
    @ManyToMany
    @JoinTable(name = "group_members", joinColumns = @JoinColumn(name = "groupId"), inverseJoinColumns = @JoinColumn(name = "userId"))
    private Set<User> members = new HashSet<>();
}

