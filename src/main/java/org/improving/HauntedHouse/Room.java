package org.improving.HauntedHouse;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "room")
public class Room {

    @Id
    private Long id;

    @Column(name = "Name")
    private String name;

    @OneToOne(mappedBy = "origin")
    private Exit exit;

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

    public Exit getExit() {
        return exit;
    }

    public void setExit(Exit exit) {
        this.exit = exit;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }
}
