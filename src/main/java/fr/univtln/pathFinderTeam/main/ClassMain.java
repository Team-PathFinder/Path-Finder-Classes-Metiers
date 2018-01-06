package fr.univtln.pathFinderTeam.main;


import fr.univtln.pathFinderTeam.classes.LevelClass;
import fr.univtln.pathFinderTeam.classes.RPCharacter;
import fr.univtln.pathFinderTeam.classes.Race;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stephane on 11/11/17.
 */
public class ClassMain {

    public static void main(String[] args) {
        LevelClass levelClass = new LevelClass.Builder()
                .setName("barbare")
                .setLevel(1)
                .setBBA(0)
                .setDescription("barbare 1")
                .setReflex(0)
                .setVigor(2)
                .setWill(0)
                .build();



        LevelClass levelClass1 = new LevelClass.Builder()
                .setName("barbare")
                .setLevel(2)
                .setBBA(2)
                .setDescription("barbare 2")
                .setReflex(0)
                .setVigor(3)
                .setWill(0)
                .build();


        Race race = new Race();
        race.setName("dwarf");

        RPCharacter character1 = new RPCharacter.Builder()
                .setName("Grognar")
                .setAge(23)
                .setCharisma(18)
                .setDexterity(12)
                .sethitpoint(8)
                .setIntelligence(8)
                .setWisdom(9)
                .setStrength(10)
                .setGender("male")
                .build();

        character1.setRace(race);

        List<LevelClass> levels = new ArrayList<>();
        character1.setLevels(levels);
        character1.addLevelClass(levelClass);

        character1.addLevelClass(levelClass1);


        System.out.println(character1.toString());



    }
}
