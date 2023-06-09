package io.codelex.polymorphism.practice.exercise2;

public class MakeSounds {
    public static void main(String[] arg) {
        Firework firework = new Firework();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();

        firework.playSound();
        parrot.playSound();
        radio.playSound();
    }
}
