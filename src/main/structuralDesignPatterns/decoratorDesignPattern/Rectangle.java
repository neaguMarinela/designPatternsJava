package main.structuralDesignPatterns.decoratorDesignPattern;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
