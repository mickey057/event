package com.event.blive.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String venueName;
    private String location;
    private String type;
    private int capacity;

    @OneToMany(mappedBy = "venueId", cascade = CascadeType.ALL)
    private List<Event> events;

    public Venue() {
    }

    public Venue(int id, String venueName, String location, String type, int capacity) {
        this.id = id;
        this.venueName = venueName;
        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
