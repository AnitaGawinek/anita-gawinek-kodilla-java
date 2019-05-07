package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Random;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        boolean isAvailable = true;
        int results = new Random().nextInt(100);

        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("London(LTN)", isAvailable);
        flights.put("Katowice(KTW)", isAvailable);
        flights.put("Monachium(MUC)", isAvailable);
        flights.put("Berlin(TXL)", isAvailable);
        flights.put("Dublin(DUB)", isAvailable);

        if (!flights.keySet().contains(flight.getDepartureAirport()) || !flights.keySet().contains(flight.getArrivalAirport())) {
            isAvailable = false;
            results = 0;
            System.out.println(results + " results found." + isAvailable);
            throw new RouteNotFoundException();
        }
        if (flight.getDepartureAirport() == flight.getArrivalAirport()) {
            isAvailable = false;
            results = 0;
            System.out.println("Departure and arrival airports are the same.\n" + results + " results found." +isAvailable);
        } else {
            isAvailable = true;
            System.out.println(results + " results found." + isAvailable);
        }
        return isAvailable;
    }

    public static void main(String[] args){
        FlightSearch flightSearch = new FlightSearch();
        try {
            flightSearch.findFlight(new Flight("Katowice(KTW)", "Liverpool(LPL)"));
        } catch (RouteNotFoundException e) {
            System.out.println("Try to choose a different airport.\n(Error: RouteNotFoundException)\n");
        }
    }
}
