package com.kristers.planeticketorder.repository;

import com.kristers.planeticketorder.FlightDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<FlightDB, Long> {
}
