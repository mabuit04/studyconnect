package de.studyconnect.backend.model;

//import java.time.LocalDateTime;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "groups")

@Getter
@Setter
public class Group extends BaseEntity{

    //private int id;
    private String name;
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
}

