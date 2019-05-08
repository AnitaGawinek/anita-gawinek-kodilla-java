package com.kodilla.exception.test;
import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flights = new HashMap<>();
        flights.put("London(LTN)", true);
        flights.put("Katowice(KTW)", false);
        flights.put("Monachium(MUC)", false);
        flights.put("Berlin(TXL)", true);
        flights.put("Dublin(DUB)", true);
        for (Map.Entry<String, Boolean> entry : flights.entrySet()) {
            String k = entry.getKey();
            Boolean v = entry.getValue();
            if (k.equals(flight.getArrivalAirport())) {
                System.out.println(v);
                return v;
            }
        }
        throw new RouteNotFoundException();
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