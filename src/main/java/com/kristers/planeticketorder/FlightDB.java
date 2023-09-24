package com.kristers.planeticketorder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="countries")
public class FlightDB {

    @Id
    @GeneratedValue
    private Long id;
    private String country;


}
