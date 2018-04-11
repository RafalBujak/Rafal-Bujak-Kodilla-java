package com.kodilla.good.patterns.FlightFinder;

public interface FlightSearch {
    String searchTo(FlightQuery flightQuery);
    String searchFrom(FlightQuery flightQuery);
    String searchVia(FlightQuery flightQuery);
}
