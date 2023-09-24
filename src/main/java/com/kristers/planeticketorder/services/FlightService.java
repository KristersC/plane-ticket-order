package com.kristers.planeticketorder.services;

import com.kristers.planeticketorder.FlightDB;
import com.kristers.planeticketorder.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<FlightDB> list(){
        return flightRepository.findAll();
    }


}
