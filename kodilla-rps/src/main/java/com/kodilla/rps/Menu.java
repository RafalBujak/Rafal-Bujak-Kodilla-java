package com.kodilla.rps;

import java.util.Scanner;

public class Menu {

    private int numberOfWins = 0;

    private LogicGame logicGame = new LogicGame();

    public void showWelcomeGame() {
        System.out.println("|---------------------------------------|");
        System.out.println("|Welcome to the rock-paper-scissors game|");
        System.out.println("|---------------------------------------|\n");
        System.out.println("Enter your name\n");
        Scanner inputName = new Scanner(System.in);
        Player player = new Player(inputName.next(), inputName.next());
        System.out.println("Welcome in new Game " + player.getName() + " " + player.getSurname());
        System.out.println("To how many wins would you like to play?");
        numberOfWins = inputName.nextInt();
        System.out.println("|---------------------------------------|\n");
    }

    public void showMenu() {
        System.out.println("Choose one of the options below");
        System.out.println("|---------------------------------------|\n");
        System.out.println(" key - 1 = Stone.\n key - 2 = Paper.\n key - 3 = Shears.\n " +
                "key - x = Game Over \n key - n = New Game");
        System.out.println("|---------------------------------------|\n\n");

    }

    public void startGame() {
        showWelcomeGame();
        System.out.println("The game is set to " + numberOfWins + " winnings\n.");
        logicGame.setScoreComp(0);
        logicGame.setScorePlayer(0);
        while (logicGame.getScorePlayer() < numberOfWins && logicGame.getScoreComp() < numberOfWins) {
            showMenu();
            boolean shouldContinue = logicGame.logicOfGame();
            if (!shouldContinue) {
                break;
            }
        }
    }

    public void menuOnTheEnd() {

        String forEndingGameChoice;
        if (logicGame.getScorePlayer() > logicGame.getScoreComp()) {
            System.out.println("\n|====================|");
            System.out.println("| .::    VICTORY   ::. |\n| The final result  " + "Computer" + logicGame.getScoreComp() + ":" + logicGame.getScorePlayer() + "Player" + " |");
            System.out.println("|======================|");
        } else if (logicGame.getScoreComp() > logicGame.getScorePlayer()) {
            System.out.println("\n|====================|");
            System.out.println("| .::    DEFEAT    ::. |\n| The final result  " + "Computer" + logicGame.getScoreComp() + ":" + logicGame.getScorePlayer() + "Player" + " |");
            System.out.println("|======================|");
        } else {
            System.out.println("\n|====================|");
            System.out.println("| .::  DEAD-HEAT  ::.  |\n| The final result  " + "Computer" + logicGame.getScoreComp() + ":" + logicGame.getScorePlayer() + "Player" + " |");
            System.out.println("|======================|\n");
        }
        System.out.println("Choose one of the options below\n");
        System.out.println("|---------------------------------------|\n");
        System.out.println("key - x = Game Over \n key - n = New Game");
        System.out.println("|---------------------------------------|\n\n");
        Scanner choiceNewStarting = new Scanner(System.in);
        forEndingGameChoice = choiceNewStarting.nextLine();
        if (forEndingGameChoice.equals("x") || forEndingGameChoice.equals("X")) {
            System.exit(0);
        }
        if (forEndingGameChoice.equals("n") || forEndingGameChoice.equals("N")) {
            startGame();
            menuOnTheEnd();
        }
    }
}
