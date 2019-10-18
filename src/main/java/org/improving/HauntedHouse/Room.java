package org.improving.HauntedHouse;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private String name;
    private List<Exit> exits = new ArrayList<>();
    private Monster monster;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
