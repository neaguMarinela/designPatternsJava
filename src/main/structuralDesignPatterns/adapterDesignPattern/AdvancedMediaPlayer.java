package main.structuralDesignPatterns.adapterDesignPattern;

public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
