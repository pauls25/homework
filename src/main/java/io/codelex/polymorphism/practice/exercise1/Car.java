package io.codelex.polymorphism.practice.exercise1;

interface Car {
    String getCarName();

    void speedUp();

    void slowDown();

    String showCurrentSpeed();

    default void startEngine() {
        System.out.println("Rrrrrrr.....");
    }
}
