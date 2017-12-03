package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.Validation;
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
    private int hitpoint;

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

    public RPCharacter(Builder builder) {
        this.race = builder.race;
        this.levels = builder.levels;
        this.name = builder.name;
        this.gender = builder.gender;
        this.age = builder.age;
        this.hitpoint = builder.hitpoint;
        this.strength = builder.strength;
        this.dexterity = builder.dexterity;
        this.constitution = builder.constitution;
        this.intelligence = builder.intelligence;
        this.wisdom = builder.wisdom;
        this.charisma = builder.charisma;
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

    public void addStrenght(){
        this.strength += 1;
    }

    public void subStrenght(){
        this.strength -= 1;
    }

    public void addDexterity(){
        this.dexterity += 1;
    }

    public void subDexterity(){
        this.dexterity -= 1;
    }

    public void addConstitution(){
        this.constitution += 1;
    }

    public void subConstitution(){
        this.constitution -= 1;
    }

    public void addIntelligence(){
        this.intelligence += 1;
    }

    public void subIntelligence(){
        this.intelligence -= 1;
    }

    public void addWisdom(){
        this.wisdom += 1;
    }

    public void subWisdom(){
        this.wisdom -= 1;
    }

    public void addSCharisma(){
        this.charisma += 1;
    }

    public void subCharisma(){
        this.charisma -= 1;
    }

    public void addHitpoint(int n){
        this.hitpoint += n;
    }

    public void subHitpoint(int n){
        this.hitpoint -= n;
    }

    public Boolean isValid(){
        return Validation.buildDefaultValidatorFactory()
                .getValidator()
                .validate(this)
                .size() == 0;
    }


    @Override
    public String toString() {
        return "Character : \n" +
                "Id :" + Id + '\n' +
                "Race : " + race + '\n' +
                "List of levels : " + levels + '\n' +
                "Name : " + name + '\n' +
                "Gender : " + gender + '\n' +
                "Age : " + age + '\n' +
                "Hitpoint : " + hitpoint + '\n' +
                "Strength : " + strength + '\n' +
                "Dexterity : " + dexterity + '\n' +
                "Constitution : " + constitution + '\n' +
                "Intelligence : " + intelligence + '\n' +
                "Wisdom : " + wisdom + '\n' +
                "Charisma : " + charisma +
                '\n';
    }

    public static class Builder{

        private int Id;

        private Race race;

        private List<LevelClass> levels;

        private String name;

        private String gender;

        private int age;

        private int hitpoint;

        private int strength;

        private int dexterity;

        private int constitution;

        private int intelligence;

        private int wisdom;

        private int charisma;

        public RPCharacter build(){
            return new RPCharacter(this);
        }

        public Builder setId(int id) {
            this.Id = id;
            return this;
        }

        public Builder setRace(Race race) {
            this.race = race;
            return this;
        }

        public Builder setLevels(List<LevelClass> levels) {
            this.levels = levels;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder sethitpoint(int hitpoint) {
            this.hitpoint = hitpoint;
            return this;
        }

        public Builder setStrength(int strength) {
            this.strength = strength;
            return this;
        }

        public Builder setDexterity(int dexterity) {
            this.dexterity = dexterity;
            return this;
        }

        public Builder setConstitution(int constitution) {
            this.constitution = constitution;
            return this;
        }

        public Builder setIntelligence(int intelligence) {
            this.intelligence = intelligence;
            return this;
        }

        public Builder setWisdom(int wisdom) {
            this.wisdom = wisdom;
            return this;
        }

        public Builder setCharisma(int charisma) {
            this.charisma = charisma;
            return this;
        }
    }
}



