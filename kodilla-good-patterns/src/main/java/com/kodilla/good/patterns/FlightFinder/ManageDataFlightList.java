package com.kodilla.good.patterns.FlightFinder;

import java.util.HashSet;

public class ManageDataFlightList {
    public FlightRoutes addRoute(String from, String to, String no) {
        FlightRoutes newRoute = null;
        FlightRoutes route = new FlightRoutes(from, to, no);
        newRoute = route;
        return newRoute;
    }

    FlightList data = FlightList.getInstance();
    HashSet<FlightRoutes> currentDataFlightList = data.createDataFlightList();

    public HashSet addEntry(FlightRoutes flightRoutes) {
        currentDataFlightList.add(flightRoutes);
        return currentDataFlightList;
    }

}
