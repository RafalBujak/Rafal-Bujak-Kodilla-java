package com.kodilla.good.patterns.flightFinder;


import com.kodilla.good.patterns.FlightFinder.FlightList;
import com.kodilla.good.patterns.FlightFinder.FlightQuery;
import com.kodilla.good.patterns.FlightFinder.FlightQueryRetriever;
import com.kodilla.good.patterns.FlightFinder.FlightSearchService;
import org.junit.Assert;
import org.junit.Test;

public class FlightFinderTestSuit {

    @Test
    public void flightFinderFromTest(){

        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();
        //when

        String result = "FlightRoutes{departureAirport='WRC', arrivalAirport='KRK', flightNumber='WK1395'}\n" +
                "FlightRoutes{departureAirport='WRC', arrivalAirport='WAW', flightNumber='WW1254'}\n" +
                "FlightRoutes{departureAirport='WRC', arrivalAirport='POZ', flightNumber='WP1212'}";

        // then

        Assert.assertEquals(result, searchService.searchFrom(queryData));

    }

    @Test
    public void flightFinderToTest(){
        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();

        //when

        String result = "FlightRoutes{departureAirport='WRC', arrivalAirport='KRK', flightNumber='WK1395'}\n" +
                "FlightRoutes{departureAirport='POZ', arrivalAirport='KRK', flightNumber='PK1245'}";

        // then

        Assert.assertEquals(result, searchService.searchTo(queryData));
    }

    @Test
    public void flightFinderViaTest(){
        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();

        //when

        String result = "FlightRoutes{departureAirport='POZ', arrivalAirport='KRK', flightNumber='PK1245'}\n" +
                "FlightRoutes{departureAirport='WRC', arrivalAirport='POZ', flightNumber='WP1212'}";

        // then

        Assert.assertEquals(result, searchService.searchVia(queryData));
    }

}
