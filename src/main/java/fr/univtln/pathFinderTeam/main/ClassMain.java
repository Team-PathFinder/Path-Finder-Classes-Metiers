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
        LevelClass levelClass = new LevelClass();
        levelClass.setName("barbare");
        levelClass.setLevel(1);
        levelClass.setBBA(0);
        levelClass.setDescription("barbare 1");
        levelClass.setReflex(0);
        levelClass.setVigor(2);
        levelClass.setWill(0);


        LevelClass levelClass1 = new LevelClass();
        levelClass1.setName("barbare");
        levelClass1.setLevel(2);
        levelClass1.setBBA(2);
        levelClass1.setDescription("barbare 2");
        levelClass1.setReflex(0);
        levelClass1.setVigor(3);
        levelClass1.setWill(0);

        RPCharacter character1 = new RPCharacter();
        character1.setName("Grognar");
        character1.setAge(23);
        character1.setConstitution(14);
        character1.setCharisma(18);
        character1.setDexterity(12);
        character1.setHealthpoint(8);
        character1.setIntelligence(8);
        character1.setWisdom(8);
        character1.setStrength(10);
        character1.setGender("male");

        Race race = new Race();
        race.setName("dwarf");
        character1.setRace(race);




        List<LevelClass> levels = new ArrayList<>();
        character1.setLevels(levels);
        character1.addLevelClass(levelClass);

        character1.addLevelClass(levelClass1);

        System.out.println(character1.toString());
    }
}
