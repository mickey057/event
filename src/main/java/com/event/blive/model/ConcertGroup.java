package com.event.blive.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "concert_group")
public class ConcertGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @OneToMany(mappedBy = "concertGroup", cascade = CascadeType.ALL)
    private List<Event> events;


    public ConcertGroup() {}

    public ConcertGroup(int id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
