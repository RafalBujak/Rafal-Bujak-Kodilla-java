package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TaskList {
    List<String> tasks;

    TaskList(TaskList tasks) {
        this.tasks = new ArrayList<>();
    }

    private List<String> task;

    public TaskList() {
        task = new ArrayList<String>();
    }

    public void addTask(String string) {
        task.add(string);
    }

    public String getTask(int i) {
        String entry = task.get(i);
        return entry;
    }
}
