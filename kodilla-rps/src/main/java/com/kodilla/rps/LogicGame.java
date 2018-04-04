package com.kodilla.rps;

import java.util.Scanner;

public class LogicGame {

    private int stone;
    private int paper;
    private int rock;
    private String endOfGame;
    private String newGame;


    // using switch
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);
    int temp = sc.nextInt();
    switch(temp) {
        case 1 :
            System.out.println("case 1");
            break;
        case 2 :
            System.out.println("case 2");
            break;
        case 3 :
            System.out.println("case 3");
            break;
        case 4 :
            System.out.println("case 4");
            break;
        case 5 :
            System.out.println("case 5");
            break;
    }
}
