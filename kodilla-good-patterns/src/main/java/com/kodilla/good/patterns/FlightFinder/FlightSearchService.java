package com.kodilla.good.patterns.FlightFinder;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearchService implements FlightSearch {

    public String searchFrom(FlightQuery flightQuery) {
        ManageDataFlightList manageDataBase = new ManageDataFlightList();
        HashSet<FlightRoutes> routeSet = manageDataBase.currentDataFlightList;
        String result;
        result = routeSet.stream()
                .filter(f -> f.getDepartureAirport().equals(flightQuery.getFrom()))
                .map(FlightRoutes::toString)
                .collect(Collectors.joining("\n"));
        return result;

    }

    public String searchTo(FlightQuery flightQuery) {
        ManageDataFlightList manageDataBase = new ManageDataFlightList();
        HashSet<FlightRoutes> routeSet = manageDataBase.currentDataFlightList;
        String result;
        result = routeSet.stream()
                .filter(f -> f.getArrivalAirport().equals(flightQuery.getTo()))
                .map(FlightRoutes::toString)
                .collect(Collectors.joining("\n"));
        return result;

    }

    public String searchVia(FlightQuery flightQuery) {
        ManageDataFlightList manageDataBase = new ManageDataFlightList();
        HashSet<FlightRoutes> routeSet = manageDataBase.currentDataFlightList;
        FlightQueryRetriever newQuery = new FlightQueryRetriever();
        FlightQuery currentQuery = newQuery.retrieveQuery();
        String result;
        result = routeSet.stream()
                .filter(f -> (f.getArrivalAirport().equals(currentQuery.getVia())
                        && f.getDepartureAirport().equals(currentQuery.getFrom()))
                        || (f.getArrivalAirport().equals(currentQuery.getTo())
                        && f.getDepartureAirport().equals(currentQuery.getVia())))
                .map(FlightRoutes::toString)
                .collect(Collectors.joining("\n"));
        return result;
    }
}
