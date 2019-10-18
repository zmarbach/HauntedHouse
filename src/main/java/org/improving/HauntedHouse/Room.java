package org.improving.HauntedHouse;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private int id;
    private String name;
    private List<Exit> exits = new ArrayList<>();
    private List<Monster> monsters = new ArrayList<>();
}
