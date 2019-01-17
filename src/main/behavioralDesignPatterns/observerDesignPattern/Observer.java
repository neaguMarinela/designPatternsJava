package main.behavioralDesignPatterns.observerDesignPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
