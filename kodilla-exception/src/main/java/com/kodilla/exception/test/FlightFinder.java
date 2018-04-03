package com.kodilla.exception.test;

import java.util.*;

public class FlightFinder {
    Map<String,Boolean> listOfAirports = new HashMap<>();

    public void findFlight(Flight flight) throws RouteNotFoundException {

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

    public void airport(Flight flight) {
        for (Map.Entry<String, Boolean> entry : listOfAirports.entrySet()) {
            if(entry.getKey() == flight.getArrivalAirport())
            System.out.println("Airport: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }
    }


    public static void main (String[] args) {
        FlightFinder flightFinder = new FlightFinder();


        try {
            flightFinder.findFlight(new Flight("DRT", "LON"));
            flightFinder.airport(new Flight("DRT", "LON"));
        } catch (RouteNotFoundException e) {
            System.out.println("Route does not exist!");
            flightFinder.airport(new Flight("DRT", "LON"));
        } finally {
            System.out.println("Find a new route!");
        }
    }
}
