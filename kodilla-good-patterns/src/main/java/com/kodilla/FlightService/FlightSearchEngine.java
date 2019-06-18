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

    public void searchConnectionThrough(String departureAirport, String changeAirport, String arrivalAirport) {
        List<Flight>foundConnectionsToA = searchConnectionFrom(departureAirport).stream()
                .filter(flight -> flight.getArrivalAirport().equals(changeAirport))
                .collect(Collectors.toList());

        List<Flight>foundConnectionsToB = searchConnectionTo(arrivalAirport).stream()
                .filter(flight -> flight.getDepartureAirport().equals(changeAirport))
                .collect(Collectors.toList());

        System.out.println("Available flights from \"" + departureAirport + "\" through \"" + changeAirport + "\" to \"" + arrivalAirport +" : " + foundConnectionsToA + foundConnectionsToB);
    }
}