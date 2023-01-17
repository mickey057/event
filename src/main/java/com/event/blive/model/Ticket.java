package com.event.blive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String serialNumber;
    private int concertId;
    private int ticketCategory;
    private String seat;
    private Date purchaseDate;

    public Ticket() {
    }

    public Ticket(int id, String serialNumber, int concertId, int ticketCategory, String seat, Date purchaseDate) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.concertId = concertId;
        this.ticketCategory = ticketCategory;
        this.seat = seat;
        this.purchaseDate = purchaseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getConcertId() {
        return concertId;
    }

    public void setConcertId(int concertId) {
        this.concertId = concertId;
    }

    public int getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(int ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}
