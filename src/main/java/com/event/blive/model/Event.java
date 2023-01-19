package com.event.blive.model;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String concertName;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venueId;

    @ManyToOne
    @JoinColumn(name = "concert_group_id")
    private ConcertGroup concertGroup;

    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artistId;

    public Event() {}

    public Event(int id, String concertName, Date date) {
        this.id = id;
        this.concertName = concertName;
        this.date = date;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    }
