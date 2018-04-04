package com.kodilla.rps;

import java.util.Scanner;

public class Menu {

    private int numberOfWins;

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
        System.out.println("|---------------------------------------|\n");
    }
}
