package com.kodilla.good.patterns.FlightFinder;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearchServiceFrom implements FlightSearchService {

    public String search(FlightQuery flightQuery) {
        ManageDataFlightList manageDataBase = new ManageDataFlightList();
        HashSet<FlightRoutes> routeSet = manageDataBase.currentDataFlightList;
        String result;
        result = routeSet.stream()
                .filter(f -> f.getDepartureAirport().equals(flightQuery.getFrom()))
                .map(FlightRoutes::toString)
                .collect(Collectors.joining("\n"));
        return result;

    }
}
