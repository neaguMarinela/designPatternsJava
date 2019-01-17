package main.structuralDesignPatterns.facadeDesignPattern;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
