package main.behavioralDesignPatterns.visitorDesignPattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}