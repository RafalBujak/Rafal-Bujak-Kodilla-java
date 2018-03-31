package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        Map<String,Boolean> listOfAirports = new HashMap<>();
        listOfAirports.put("DRT", true);
        listOfAirports.put("KAT", true);
        listOfAirports.put("LON", false);

        if(listOfAirports.get(flight.getArrivalAirport())
                && listOfAirports.get(flight.getDepartureAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport()+
                    " to " + flight.getArrivalAirport() + " has been found!");
        }
        else {
            throw new RouteNotFoundException();
        }
    }
    public static void main (String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        try {
            flightFinder.findFlight(new Flight("DRT", "LON"));
        } catch (RouteNotFoundException e) {
            System.out.println("Route does not exist!");
        } finally {
            System.out.println("Find a new route!");
        }
    }
}
