package com.kodilla.FlightService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightSearchEngine {
    private FlightsDatabase flightsDatabase = new FlightsDatabase();

    public List<Flight> searchConnectionFrom(String departureAirport) {
        List<Flight> foundConnectionsFrom = flightsDatabase.getAvailableFlights().stream()
                .filter(flight -> flight.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        return foundConnectionsFrom;
    }

    public List<Flight> searchConnectionTo(String arrivalAirport) {
        List<Flight> foundConnectionsTo = flightsDatabase.getAvailableFlights().stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        return foundConnectionsTo;
    }

    public List<Flight> searchConnectionThrough(String departureAirport, String changeAirport, String arrivalAirport) {
        List<Flight>foundConnectionsThrough = searchConnectionFrom(departureAirport).stream()
                .filter(searchConnectionTo(arrivalAirport)::contains)
                .collect(Collectors.toList());

        System.out.println("Available flights to \"" + arrivalAirport + "\" through \"" + changeAirport + "\" : " + foundConnectionsThrough);
        return foundConnectionsThrough;
    }
}