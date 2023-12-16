package com.kristers.planeticketorder.rest;

import com.kristers.planeticketorder.Flight;
import com.kristers.planeticketorder.FlightDB;
import com.kristers.planeticketorder.PlaneTicketOrderApplication;
import com.kristers.planeticketorder.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

import static com.kristers.planeticketorder.PlaneTicketOrderApplication.flights;

@Controller
public class RestController {

    //ArrayList<Flight> flights = new ArrayList<Flight>();
    @Autowired
    private FlightService flightService;

    @GetMapping("/")
    String test(Model model){
        //ArrayList<Flight> flights = new ArrayList<Flight>();
        //flights.add(new Flight("Riga", "17:00", "2 hours", "20"));
        //model.addAttribute(flights);
        model.addAttribute("flights", flights);
        List<FlightDB> flight = flightService.list();
        System.out.println(flight.get(2).toString());
        return "main";
    }

    @GetMapping("/addflight")
    String goToAddFlight(Model model){
        model.addAttribute("flight", new Flight());
        return "addflight";
    }

    @PostMapping("/addflight")
    String addFlight(@ModelAttribute Flight flight){
        flights.add(flight);
        return "redirect:/";
    }

    @GetMapping("/login")
    String login(Model model){
        return "login";
    }

    @PostMapping("/login")
    String loginAfter(@ModelAttribute Model model){
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(Model model, HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/";
    }

    @GetMapping("/ticketinfo")
    public String ticketinfo(Model model, @RequestParam int ID){
        model.addAttribute("flight", flights.get(ID));
        return "ticketinfo";
    }
/*
    @GetMapping("/error")
    public String error(Model model){
        return "error";
    }
*/
    @GetMapping("/buyticket")
    public String buyticket(Model model){
        return "buyticket";
    }

}
