package com.kristers.planeticketorder;

import java.util.ArrayList;

public class Flight {
    String destination;
    String time;
    String eta;
    String price;
    String seats;
    String description;

    public Flight(String destination, String time, String eta, String price, String seats, String description) {
        this.destination = destination;
        this.time = time;
        this.eta = eta;
        this.price = price;
        this.seats = seats;
        this.description = description;
    }

    public Flight() {

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getEta() {
        return eta;
    }

    public void setEta(String eta) {
        this.eta = eta;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
