package com.kodilla.good.patterns.flightFinder;


import com.kodilla.good.patterns.FlightFinder.FlightList;
import com.kodilla.good.patterns.FlightFinder.FlightQuery;
import com.kodilla.good.patterns.FlightFinder.FlightQueryRetriever;
import com.kodilla.good.patterns.FlightFinder.FlightSearchService;
import org.junit.Assert;
import org.junit.Test;

public class FlightFinderTestSuit {

    @Test
    public void FlightFinderFromTest(){

        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();
        FlightSearchService searchServiceFrom = new FlightSearchService();
        FlightQuery queryDataFrom = getSearchData.retrieveQuery();
        //when

        String result = searchServiceFrom.searchFrom(queryDataFrom);

        // then

        Assert.assertEquals(result, searchService.searchFrom(queryData));

    }

    @Test
    public void FlightFinderToTest(){
        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();
        FlightSearchService searchServiceTo = new FlightSearchService();
        FlightQuery queryDataTo = getSearchData.retrieveQuery();
        //when

        String result = searchServiceTo.searchTo(queryDataTo);

        // then

        Assert.assertEquals(result, searchService.searchTo(queryData));
    }

    @Test
    public void FlightFinderViaTest(){
        // given
        FlightList flightList = new FlightList();
        flightList.createDataFlightList();

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();
        FlightSearchService searchService = new FlightSearchService();
        FlightSearchService searchServiceTo = new FlightSearchService();
        FlightQuery queryDataTo = getSearchData.retrieveQuery();
        //when

        String result = searchServiceTo.searchVia(queryDataTo);

        // then

        Assert.assertEquals(result, searchService.searchVia(queryData));
    }

}
