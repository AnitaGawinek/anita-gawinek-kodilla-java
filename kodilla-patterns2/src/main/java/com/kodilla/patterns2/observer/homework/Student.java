package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final List<Observer> observers;
    private final List<String> homeworks;
    private final String name;
    private final String courseName;

    public Student(String name, String courseName) {
        observers = new ArrayList<>();
        homeworks = new ArrayList<>();
        this.name = name;
        this.courseName = courseName;
    }

    public void addHomework(String gitHubLink) {
        homeworks.add(gitHubLink);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public String getName() {
        return name;
    }

    public String getCourseName() {
        return courseName;
    }
}
