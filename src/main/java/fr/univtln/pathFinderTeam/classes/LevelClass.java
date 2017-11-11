package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
public @Data class LevelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToMany
    private Collection<Special> specials;

    private String name;
    private String description;
    private int BBA;
    private int reflex;
    private int vigor;
    private int will;
    private int level;
}
