package fr.univtln.pathFinderTeam.classes;


import javax.persistence.*;
import java.util.Collection;

@Entity
public class LevelClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @ManyToMany
    private Collection<Special> specials;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(nullable = false)
    private int BBA;

    @Column(nullable = false)
    private int reflex;

    @Column(nullable = false)
    private int vigor;

    @Column(nullable = false)
    private int will;

    @Column(nullable = false)
    private int level;

    public LevelClass() {}

    public LevelClass(Builder builder) {
        this.specials = builder.specials;
        this.name = builder.name;
        this.description = builder.description;
        this.BBA = builder.BBA;
        this.reflex = builder.reflex;
        this.vigor = builder.vigor;
        this.will = builder.will;
        this.level = builder.level;
    }


    /*public Boolean isValid(){
        return Validation.buildDefaultValidatorFactory()
                .getValidator()
                .validate(this)
                .size() == 0;
    }*/


    @Override
    public String toString() {
        return '\n' +"    Name : "+ name + '\n' +
                "       Id : " + Id + '\n' +
                "       Specials : " + specials + '\n' +
                "       Description : " + description + '\n' +
                "       BBA : " + BBA + '\n' +
                "       Reflex : " + reflex + '\n' +
                "       Vigor : " + vigor + '\n' +
                "       Will : " + will + '\n' +
                "       Level : " + level + '\n';
    }

    public static class Builder{

        private int Id;

        private Collection<Special> specials;

        private String name;

        private String description;

        private int BBA;

        private int reflex;

        private int vigor;

        private int will;

        private int level;

        public LevelClass build(){
            return new LevelClass(this);
        }

        public Builder setId(int id) {
            this.Id = id;
            return this;
        }

        public Builder setSpecials(Collection<Special> specials) {
            this.specials = specials;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setBBA(int BBA) {
            this.BBA = BBA;
            return this;
        }

        public Builder setReflex(int reflex) {
            this.reflex = reflex;
            return this;
        }

        public Builder setVigor(int vigor) {
            this.vigor = vigor;
            return this;
        }

        public Builder setWill(int will) {
            this.will = will;
            return this;
        }

        public Builder setLevel(int level) {
            this.level = level;
            return this;
        }
    }

    public int getId() {
        return Id;
    }

    public Collection<Special> getSpecials() {
        return specials;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getBBA() {
        return BBA;
    }

    public int getReflex() {
        return reflex;
    }

    public int getVigor() {
        return vigor;
    }

    public int getWill() {
        return will;
    }

    public int getLevel() {
        return level;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setSpecials(Collection<Special> specials) {
        this.specials = specials;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBBA(int BBA) {
        this.BBA = BBA;
    }

    public void setReflex(int reflex) {
        this.reflex = reflex;
    }

    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    public void setWill(int will) {
        this.will = will;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
