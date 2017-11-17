package fr.univtln.pathFinderTeam.classes;

<<<<<<< HEAD

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String name;

=======
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public @Data class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @NotNull
    private String name;

    public Race() {
    }

    public Race(@NotNull String name) {
        this.name = name;
    }
>>>>>>> refs/heads/release-testBintrayDepoyment
}
