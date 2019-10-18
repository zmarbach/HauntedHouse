package org.improving.HauntedHouse;

public class Exit {
    private Long id;
    private String name;
    private Room origin;
    private Room destination;

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

    public Room getOrigin() {
        return origin;
    }

    public void setOrigin(Room origin) {
        this.origin = origin;
    }

    public Room getDestination() {
        return destination;
    }

    public void setDestination(Room destination) {
        this.destination = destination;
    }
}
