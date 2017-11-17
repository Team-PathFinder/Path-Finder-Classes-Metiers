package fr.univtln.pathFinderTeam.classes;

<<<<<<< HEAD

=======
>>>>>>> refs/heads/release-testBintrayDepoyment
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
}
