package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {
    Map<String, Boolean> listOfAirports = new HashMap<>();

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        listOfAirports.put("DRT", true);
        listOfAirports.put("KAT", true);
        listOfAirports.put("LON", false);

        if (listOfAirports.get(flight.getArrivalAirport())
                && listOfAirports.get(flight.getDepartureAirport()) == true) {
            return true;
        } else {
            throw new RouteNotFoundException();
        }
    }

    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();


        try {
            System.out.println("You can fly on this airport: "
                    + flightFinder.findFlight(new Flight("DRT", "KAT")));
        } catch (RouteNotFoundException e) {
            System.out.println("Route does not exist!");
        } finally {
            System.out.println("Find a new route!");
        }
    }
}
