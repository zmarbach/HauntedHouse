package org.improving.HauntedHouse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "room")
public class Room {

    @Id
    private Long id;

    @JoinColumn(name = "Name")
    private String name;

    @OneToMany(mappedBy = "origin", fetch = FetchType.EAGER)
    private List<Exit> exits = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "MonsterId")
    private Monster monster;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Exit> getExits() {
        return exits;
    }

    public void setExits(List<Exit> exits) {
        this.exits = exits;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
