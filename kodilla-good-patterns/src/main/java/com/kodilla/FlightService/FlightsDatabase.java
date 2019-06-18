package com.kodilla.FlightService;

import java.util.ArrayList;
import java.util.List;

public class FlightsDatabase {
    private List<Flight> availableFlights = new ArrayList<>();

    public FlightsDatabase() {
        availableFlights.add(new Flight("Gdańsk", "Katowice"));
        availableFlights.add(new Flight("Gdańsk", "Kraków"));
        availableFlights.add(new Flight("Gdańsk", "Warszawa"));
        availableFlights.add(new Flight("Gdańsk", "Wrocław"));
        availableFlights.add(new Flight("Katowice", "Gdańsk"));
        availableFlights.add(new Flight("Katowice", "Kraków"));
        availableFlights.add(new Flight("Katowice", "Warszawa"));
        availableFlights.add(new Flight("Katowice", "Wrocław"));
        availableFlights.add(new Flight("Kraków", "Gdańsk"));
        availableFlights.add(new Flight("Kraków", "Katowice"));
        availableFlights.add(new Flight("Kraków", "Warszawa"));
        availableFlights.add(new Flight("Kraków", "Wrocław"));
        availableFlights.add(new Flight("Warszawa", "Gdańsk"));
        availableFlights.add(new Flight("Warszawa", "Katowice"));
        availableFlights.add(new Flight("Warszawa", "Kraków"));
        availableFlights.add(new Flight("Warszawa", "Wrocław"));
        availableFlights.add(new Flight("Wrocław", "Gdańsk"));
        availableFlights.add(new Flight("Wrocław", "Katowice"));
        availableFlights.add(new Flight("Wrocław", "Kraków"));
        availableFlights.add(new Flight("Wrocław", "Warszawa"));
    }

    public List<Flight> getAvailableFlights() {
        return availableFlights;
    }
}
