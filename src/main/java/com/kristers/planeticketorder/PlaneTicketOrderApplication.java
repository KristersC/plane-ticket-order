package com.kristers.planeticketorder;

import com.kristers.planeticketorder.rest.RestController;
import com.kristers.planeticketorder.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PlaneTicketOrderApplication {



	public static ArrayList<Flight> flights = new ArrayList<Flight>();

	//public static ArrayList<Flight> flights = new ArrayList<Flight>();
	public static void main(String[] args) {
		SpringApplication.run(PlaneTicketOrderApplication.class, args);
		flights.add(new Flight("Berlin", "17:00", "3 hours", "42 EUR", "100", "Capital of Germany"));
		flights.add(new Flight("Mexico", "03:00", "20 hours", "269 EUR", "200", "Capital of Mexico"));
		flights.add(new Flight("Madrid", "06:00", "5 hours", "75 EUR", "50", "Capital of Spain"));
		flights.add(new Flight("Amsterdam", "07:00", "4 hours", "54 EUR", "87", "Capital of Amsterdam"));
	}

}
