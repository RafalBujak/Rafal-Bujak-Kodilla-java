package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {
    // First element of the map is an indenifier of weather station
    // second element of themap is a temperature in Celsius degriis

    HashMap<Integer, Double> getTemperatures();
}
