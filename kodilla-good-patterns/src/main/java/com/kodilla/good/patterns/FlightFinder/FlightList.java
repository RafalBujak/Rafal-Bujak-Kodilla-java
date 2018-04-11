package com.kodilla.good.patterns.FlightFinder;

import java.util.HashSet;

public class FlightList {
    private static FlightList list;

    public FlightList() {
    }

    public static FlightList getInstance() {
        if (list == null) {
            list = new FlightList();
        }
        return list;
    }

    public HashSet createDataFlightList() {
        HashSet<FlightRoutes> flightRoutesDataBase = new HashSet<>();
        flightRoutesDataBase.add(new FlightRoutes("KRK", "WAW", "KW1258"));
        flightRoutesDataBase.add(new FlightRoutes("WRC", "WAW", "WW1254"));
        flightRoutesDataBase.add(new FlightRoutes("KRK", "WRC", "KW1239"));
        flightRoutesDataBase.add(new FlightRoutes("WRC", "POZ", "WP1212"));
        flightRoutesDataBase.add(new FlightRoutes("POZ", "KRK", "PK1245"));
        flightRoutesDataBase.add(new FlightRoutes("WRC", "KRK", "WK1395"));
        return flightRoutesDataBase;
    }
}
