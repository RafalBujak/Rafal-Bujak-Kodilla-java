package com.kodilla.rps;

import java.util.Scanner;
import java.util.Random;

public class LogicGame {

    private int scorePlayer = 0;
    private int scoreComp = 0;

    public boolean logicOfGame() {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        Random random = new Random();
        int comp = random.nextInt(3 - 1) + 1;
        String rock = "1";
        String stone = "3";
        String paper = "2";
        if (userInput.equals(rock) && comp == 3) {
            System.out.println("the computer has chosen Scissors. you win!!");
            scorePlayer++;
        } else if (userInput.equals(rock) && comp == 2) {
            System.out.println("the computer has chosen Paper. you lost!!");
            scoreComp++;
        } else if (userInput.equals(paper) && comp == 1) {
            System.out.println("the computer has chosen Stone. you win!!");
            scorePlayer++;
        } else if (userInput.equals(paper) && comp == 3) {
            System.out.println("the computer has chosen Scissors. you lost!!");
            scoreComp++;
        } else if (userInput.equals(stone) && comp == 1) {
            System.out.println("the computer has chosen Stone. you lost!!");
            scoreComp++;
        } else if (userInput.equals(stone) && comp == 2) {
            System.out.println("the computer has chosen paper. you win!!");
            scorePlayer++;
        } else if (userInput.equals("x")) {
            System.out.println("Are you sure you want to end the game? press key T for yes  or N for No");
            choice();
        } else if (userInput.equals("n")) {
            System.out.println("Are you sure you want to end your current game? y - yes n - no");
            choice();
        } else {
            System.out.println("the computer chose the same. DEAD-HEAT!!");
        }
        System.out.println("\n||:Current Status Winnings:||\n    Computer: " + scoreComp +
                "    Player: " + scorePlayer);

        return true;
    }

    public int getScorePlayer() {
        return scorePlayer;
    }

    public int getScoreComp() {
        return scoreComp;
    }

    public void setScorePlayer(int scorePlayer) {
        this.scorePlayer = scorePlayer;
    }

    public void setScoreComp(int scoreComp) {
        this.scoreComp = scoreComp;
    }

    public boolean choice() {
        Menu menu = new Menu();
        Scanner sc = new Scanner(System.in);
        String choiceYesOrNot;
        choiceYesOrNot = sc.next();
        if (choiceYesOrNot.equals("y") || choiceYesOrNot.equals("Y")) {
            menu.showWelcomeGame();
        } else if (choiceYesOrNot.equals("N") || choiceYesOrNot.equals("n")) {// do nothing
        } else {
            System.exit(0);
        }
        return true;
    }
}

