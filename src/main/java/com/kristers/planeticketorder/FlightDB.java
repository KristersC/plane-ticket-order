package com.kristers.planeticketorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="flight")
public class FlightDB {

    @Id
    @GeneratedValue
    private Long id;
    private String destination;
    private String time;
    private String eta;
    private String price;
    private String seats;
    private String description;

    public FlightDB() {
    }

    public FlightDB(Long id, String destination, String time, String eta, String price, String seats, String description) {
        super();
        this.id = id;
        this.destination = destination;
        this.time = time;
        this.eta = eta;
        this.price = price;
        this.seats = seats;
        this.description = description;
    }

    public String printValues(FlightDB flight){
        String printValues = "";
        printValues += flight.getId() + " ";
        printValues += flight.getDestination() + " ";
        printValues += flight.getPrice() + " ";
        printValues += flight.getTime() + " ";
        printValues += flight.getDescription() + " ";
        return printValues;
    }

    public String toString() {
        String printValues = "";
        printValues += this.getId() + " ";
        printValues += this.getDestination() + " ";
        printValues += this.getPrice() + " ";
        printValues += this.getTime() + " ";
        printValues += this.getDescription() + " ";
        return printValues;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
