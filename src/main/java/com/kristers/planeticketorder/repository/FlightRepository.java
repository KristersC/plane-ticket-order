package com.kristers.planeticketorder.repository;

import com.kristers.planeticketorder.FlightDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightDB, Long> {
}
