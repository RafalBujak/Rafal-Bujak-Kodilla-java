package com.kodilla.rps;

public class Player {
    private String firstName;
    private String surname;

    public Player(String firstName,String surname ) {
        this.firstName = firstName;
        this.surname = surname;
    }

    public String getName() {
        return firstName;
    }
    public String getSurname() {
        return surname;
    }

}
