package com.event.blive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OrderTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int customerorderId;
    private int ticketId;

    public OrderTicket() {
    }

    public OrderTicket(int id, int customerorderId, int ticketId) {
        this.id = id;
        this.customerorderId = customerorderId;
        this.ticketId = ticketId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerorderId() {
        return customerorderId;
    }

    public void setCustomerorderId(int customerorderId) {
        this.customerorderId = customerorderId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }
}
