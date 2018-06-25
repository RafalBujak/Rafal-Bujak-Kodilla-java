package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaCourse implements Observable {
    private final List<Observer> students;
    private final List<String> tasks;
    private final String name;

    public KodillaCourse(String name) {
        students = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        students.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : students) {
            observer.update(this);
        }

    }

    @Override
    public void removeObserver(Observer observer) {
        students.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
