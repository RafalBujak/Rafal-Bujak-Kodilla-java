package com.kodilla.good.patterns.FlightFinder;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightSearchServiceTo implements FlightSearchService {

    public String search(FlightQuery flightQuery) {
        ManageDataFlightList manageDataBase = new ManageDataFlightList();
        HashSet<FlightRoutes> routeSet = manageDataBase.currentDataFlightList;
        String result;
        result = routeSet.stream()
                .filter(f -> f.getArrivalAirport().equals(flightQuery.getTo()))
                .map(FlightRoutes::toString)
                .collect(Collectors.joining("\n"));
        return result;

    }
}
