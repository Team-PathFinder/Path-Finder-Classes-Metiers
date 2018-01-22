package fr.univtln.pathFinderTeam.classes;

import fr.univtln.pathFinderTeam.classes.utilites.Properties;

import javax.persistence.*;

@Entity
@NamedQueries(
    {
        @NamedQuery(name = Properties.FIND_SPECIAL_BY_NAME, query = "select s from Special s where s.name=:pName")
    }
)
public class Special {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    public Special() {
    }

    public Special(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
