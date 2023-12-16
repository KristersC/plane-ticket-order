package com.kristers.planeticketorder;

import com.kristers.planeticketorder.services.FlightService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightDBServiceUnitTest {

    @Autowired
    private FlightService flightService;

    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<FlightDB> flight = flightService.list();

        Assert.assertEquals(flight.size(), 4);
    }

}
