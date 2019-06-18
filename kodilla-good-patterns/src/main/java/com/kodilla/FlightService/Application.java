package com.kodilla.FlightService;

public class Application {

    public static void main(String[] args){

        FlightSearchEngine engine = new FlightSearchEngine();

        System.out.println("Available flights from selected airport: " + engine.searchConnectionFrom("Kraków"));
        System.out.println("Available flights to selected airport: " + engine.searchConnectionTo("Gdańsk"));
        engine.searchConnectionThrough("Gdańsk", "Wrocław","Katowice");

    }
}
