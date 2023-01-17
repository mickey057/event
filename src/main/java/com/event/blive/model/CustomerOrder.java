package com.event.blive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Entity
public class CustomerOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int customerId;
    private Date orderTime;
    private String deliveryAddress;
    private String deliveryEmailAddress;
    private Date preferredDeliveryTime;
    private Date timePaid;
    private Date timeSent;
    private Long totalPrice;
    private Long discount;
    private Long finalPrice;

    public CustomerOrder() {}

    public CustomerOrder(int id, int customerId, Date orderTime, String deliveryAddress, String deliveryEmailAddress, Date preferredDeliveryTime, Date timePaid, Date timeSent, Long totalPrice, Long discount, Long finalPrice) {
        this.id = id;
        this.customerId = customerId;
        this.orderTime = orderTime;
        this.deliveryAddress = deliveryAddress;
        this.deliveryEmailAddress = deliveryEmailAddress;
        this.preferredDeliveryTime = preferredDeliveryTime;
        this.timePaid = timePaid;
        this.timeSent = timeSent;
        this.totalPrice = totalPrice;
        this.discount = discount;
        this.finalPrice = finalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryEmailAddress() {
        return deliveryEmailAddress;
    }

    public void setDeliveryEmailAddress(String deliveryEmailAddress) {
        this.deliveryEmailAddress = deliveryEmailAddress;
    }

    public Date getPreferredDeliveryTime() {
        return preferredDeliveryTime;
    }

    public void setPreferredDeliveryTime(Date preferredDeliveryTime) {
        this.preferredDeliveryTime = preferredDeliveryTime;
    }

    public Date getTimePaid() {
        return timePaid;
    }

    public void setTimePaid(Date timePaid) {
        this.timePaid = timePaid;
    }

    public Date getTimeSent() {
        return timeSent;
    }

    public void setTimeSent(Date timeSent) {
        this.timeSent = timeSent;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Long getDiscount() {
        return discount;
    }

    public void setDiscount(Long discount) {
        this.discount = discount;
    }

    public Long getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Long finalPrice) {
        this.finalPrice = finalPrice;
    }
}
