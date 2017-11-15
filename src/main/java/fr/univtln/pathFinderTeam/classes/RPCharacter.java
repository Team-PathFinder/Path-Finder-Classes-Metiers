package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public @Data class RPCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne
    private Race race;

    @ManyToMany
    @NotNull
    private List<LevelClass> levels;

    @NotNull
    private String name;

    @NotNull
    private String gender;

    @NotNull @Min(1)
    private int age;

    @NotNull @Min(-10)
    private int healthpoint;

    @NotNull @Min(0)
    private int strength;

    @NotNull @Min(0)
    private int dexterity;

    @NotNull @Min(0)
    private int constitution;

    @NotNull @Min(0)
    private int intelligence;

    @NotNull @Min(0)
    private int wisdom;

    @NotNull @Min(0)
    private int charisma;

    public RPCharacter() {
    }

    public RPCharacter(Race race, @NotNull List<LevelClass> levels, @NotNull String name, @NotNull String gender,
                       @NotNull @Min(1) int age, @NotNull @Min(-10) int healthpoint, @NotNull @Min(0) int strength,
                       @NotNull @Min(0) int dexterity, @NotNull @Min(0) int constitution, @NotNull @Min(0)
                               int intelligence, @NotNull @Min(0) int wisdom, @NotNull @Min(0) int charisma) {
        this.race = race;
        this.levels = levels;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.healthpoint = healthpoint;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.charisma = charisma;
    }

    public void addLevelClass(LevelClass levelClass){
        int i = 0;
        boolean find = false;
        if(levelClass.getLevel() == 1){
            this.levels.add(levelClass);
        }
        else{

            while(find == false && i < levels.size()){
                if(levelClass.getName() == levels.get(i).getName() && levelClass.getLevel() -1 == levels.get(i).getLevel()){
                    this.levels.add(levelClass);
                    find = true;
                }
            }
        }
    }

}

