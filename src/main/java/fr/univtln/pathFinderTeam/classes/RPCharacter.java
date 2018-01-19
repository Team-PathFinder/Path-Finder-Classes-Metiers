package fr.univtln.pathFinderTeam.classes;


import javax.persistence.*;
import javax.validation.constraints.Min;

import java.util.List;

@Entity
@NamedQueries(
        {
                @NamedQuery(name = "findByName", query = "select rp from RPCharacter rp where rp.name=:pName")
        }
)
public class RPCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToOne(cascade=CascadeType.PERSIST)
    private Race race;

    @ManyToMany(cascade=CascadeType.PERSIST)
    @Column(nullable = false)
    private List<LevelClass> levels;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false) @Min(1)
    private int age;

    @Column(nullable = false) @Min(-10)
    private int hitpoint;

    @Column(nullable = false) @Min(0)
    private int strength;

    @Column(nullable = false) @Min(0)
    private int dexterity;

    @Column(nullable = false) @Min(0)
    private int constitution;

    @Column(nullable = false) @Min(0)
    private int intelligence;

    @Column(nullable = false) @Min(0)
    private int wisdom;

    @Column(nullable = false) @Min(0)
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
                    i++;
                }
            }
        }
    }

    /*public Boolean isValid(){
        return Validation.buildDefaultValidatorFactory()
                .getValidator()
                .validate(this)
                .size() == 0;
    }*/


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

    public int getId() {
        return Id;
    }

    public Race getRace() {
        return race;
    }

    public List<LevelClass> getLevels() {
        return levels;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void setLevels(List<LevelClass> levels) {
        this.levels = levels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }
}



