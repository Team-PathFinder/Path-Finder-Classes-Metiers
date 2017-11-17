package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

@Entity
public @Data class LevelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToMany
    private Collection<Special> specials;

    @NotNull
    private String name;

    private String description;

    @NotNull
    private int BBA;

    @NotNull
    private int reflex;

    @NotNull
    private int vigor;

    @NotNull
    private int will;

    @Size(min = 1,max = 20)
    private int level;

    public LevelClass() {}

    public LevelClass(Collection<Special> specials, @NotNull String name, String description, @NotNull int BBA, @NotNull int reflex, @NotNull int vigor, @NotNull int will, @Size(min = 1, max = 20) int level) {
        this.specials = specials;
        this.name = name;
        this.description = description;
        this.BBA = BBA;
        this.reflex = reflex;
        this.vigor = vigor;
        this.will = will;
        this.level = level;
    }
}
