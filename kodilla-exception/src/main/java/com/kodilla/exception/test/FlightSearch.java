package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Random;

public class FlightSearch {

    public void findFlight(Flight flight) throws RouteNotFoundException {
        boolean isAvailable;
        if (flight.getDepartureAirport() == flight.getArrivalAirport()) {
            isAvailable = false;
            System.out.println("Departure and arrival airports are the same.");
            throw new RouteNotFoundException();
        } else {
            isAvailable = true;
        }
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("London(LTN)", isAvailable);
        flights.put("Katowice(KTW)", isAvailable);
        flights.put("Monachium(MUC)", isAvailable);
        flights.put("Berlin(TXL)", isAvailable);
        flights.put("Dublin(DUB)", isAvailable);
        if (!flights.keySet().contains(flight.getDepartureAirport()) || !flights.keySet().contains(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();
        Random rnd = new Random();
        int results = rnd.nextInt(100);
        try {
            flightSearch.findFlight(new Flight("Katowice(KTW)", "Liverpool(LPL)"));
        } catch (RouteNotFoundException e) {
            System.out.println("Try to choose a different airport.\n(Error: RouteNotFoundException)");
            results = 0;
        } finally {
            System.out.println(results + " results found.");
        }
    }
}
