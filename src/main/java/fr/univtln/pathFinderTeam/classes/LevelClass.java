package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data class LevelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;
    private String description;
    private int BBA;
    private int reflex;
    private int vigor;
    private int will;
}
