package fr.univtln.pathFinderTeam.classes;

import lombok.Data;

import javax.persistence.*;
import javax.validation.Validation;
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

    @NotNull
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


    public Boolean isValid(){
        return Validation.buildDefaultValidatorFactory()
                .getValidator()
                .validate(this)
                .size() == 0;
    }


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
}
