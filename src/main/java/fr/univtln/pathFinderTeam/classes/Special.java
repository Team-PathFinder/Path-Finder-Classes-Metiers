package fr.univtln.pathFinderTeam.classes;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public @Data class Special {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    public Special() {
    }

    public Special(@NotNull String name, @NotNull String description) {
        this.name = name;
        this.description = description;
    }
}
