package com.kodilla.good.patterns.FlightFinder;

public class Application {
    public static void main(String[] args) {

        FlightQueryRetriever getSearchData = new FlightQueryRetriever();
        FlightQuery queryData = getSearchData.retrieveQuery();

        FlightSearchService newSearch = new FlightSearchService();

        String respondFrom = newSearch.searchFrom(queryData);
        System.out.println(respondFrom + "\n");


        String respondTo = newSearch.searchTo(queryData);
        System.out.println(respondTo + "\n");


        String respondVia = newSearch.searchVia(queryData);
        System.out.println(respondVia);

    }
}
