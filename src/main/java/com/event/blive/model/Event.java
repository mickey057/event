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
    private int artistId;
    private Date date;
    private int venueId;
    private int concert_group;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Venue> venues;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<ConcertGroup> concertGroups;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Artist> artists;

    public List<Venue> getVenues() {
        return venues;
    }

    public void setVenues(List<Venue> venues) {
        this.venues = venues;
    }

    public List<ConcertGroup> getConcertGroups() {
        return concertGroups;
    }

    public void setConcertGroups(List<ConcertGroup> concertGroups) {
        this.concertGroups = concertGroups;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Event() {}

    public Event(int id, String concertName, int artistId, Date date, int venueId, int concert_group) {
        this.id = id;
        this.concertName = concertName;
        this.artistId = artistId;
        this.date = date;
        this.venueId = venueId;
        this.concert_group = concert_group;
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

    public int getArtistId() {
        return artistId;
    }

    public void setArtistId(int artistId) {
        this.artistId = artistId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVenueId() {
        return venueId;
    }

    public void setVenueId(int venueId) {
        this.venueId = venueId;
    }

    public int getConcert_group() {
        return concert_group;
    }

    public void setConcert_group(int concert_group) {
        this.concert_group = concert_group;
    }
}
