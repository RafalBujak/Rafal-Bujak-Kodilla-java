package com.kodilla.good.patterns.FlightFinder;

import java.util.Objects;

public final class FlightRoutes {
    private final String departureAirport;
    private final String arrivalAirport;
    private final String flightNumber;

    public FlightRoutes(final String departureAirport, final String arrivalAirport, final String flightNumber) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.flightNumber = flightNumber;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof FlightRoutes)) return false;
        FlightRoutes that = (FlightRoutes) obj;
        return Objects.equals(getDepartureAirport(), that.getDepartureAirport()) &&
                Objects.equals(getArrivalAirport(), that.getArrivalAirport()) &&
                Objects.equals(getFlightNumber(), that.getFlightNumber());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDepartureAirport(), getArrivalAirport(), getFlightNumber());
    }

    @Override
    public String toString() {
        return "FlightRoutes{" +
                "departureAirport='" + departureAirport + '\'' +
                ", arrivalAirport='" + arrivalAirport + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}
