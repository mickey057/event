package com.event.blive.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Artist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String artistName;


    @OneToMany(mappedBy = "artistId", cascade = CascadeType.ALL)
    private List<Event> events;


    @ManyToOne
    @JoinColumn(name="genre_id")
    private Genre genreId;

    public Genre getGenreId() {
        return genreId;
    }

    public void setGenreId(Genre genreId) {
        this.genreId = genreId;
    }

    public Artist() {
    }

    public Artist(int id, String artistName) {
        this.id = id;
        this.artistName = artistName;
       // this.genreId = genreId;
    }

    public Artist(int id, String artistName, Genre genreId) {
        this.id = id;
        this.artistName = artistName;
        this.genreId = genreId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }


}
