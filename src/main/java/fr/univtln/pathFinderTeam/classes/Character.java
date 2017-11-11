package classes;

import fr.univtln.pathFinderTeam.classes.LevelClass;
import fr.univtln.pathFinderTeam.classes.Race;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
public @Data class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne
    private Race race;

    @ManyToMany
    private Collection<LevelClass> levels;

    private String name;
    private String gender;
    private int age;
    private int healthpoint;
    private int strenght;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;

}

