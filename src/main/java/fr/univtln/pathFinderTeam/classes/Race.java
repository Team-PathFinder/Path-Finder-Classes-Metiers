package fr.univtln.pathFinderTeam.classes;



import fr.univtln.pathFinderTeam.classes.utilites.Properties;

import javax.persistence.*;

@Entity
@NamedQueries(
    {
        @NamedQuery(name = Properties.FIND_RACE_BY_NAME, query = "select r from Race rp where r.name=:pName")
    }
)
public class Race {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    @Column(nullable = false)
    private String name;

    public Race() {
    }

    public Race(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n   Id : " + Id +
                "\n   Name : " + name;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
