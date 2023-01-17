package com.event.blive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ConcertRole {

    @Id
    private int id;
    private int eventId;
    private int artist_Id;
    private int roleId;

    public ConcertRole() {}

    public ConcertRole(int eventId, int artist_Id, int roleId) {
        this.eventId = eventId;
        this.artist_Id = artist_Id;
        this.roleId = roleId;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getArtist_Id() {
        return artist_Id;
    }

    public void setArtist_Id(int artist_Id) {
        this.artist_Id = artist_Id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }
}
