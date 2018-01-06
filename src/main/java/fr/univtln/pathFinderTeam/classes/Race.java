package fr.univtln.pathFinderTeam.classes;



import javax.persistence.*;

@Entity
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
