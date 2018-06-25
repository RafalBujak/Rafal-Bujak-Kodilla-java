package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String userName;
    private int updateCount;

    public Mentor(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(KodillaCourse kourse) {
        System.out.println(userName + ": You have a new tasks for review from student name " + kourse.getName() + "\n" +
                " total: " + kourse.getTasks().size());
        updateCount++;
    }

    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
