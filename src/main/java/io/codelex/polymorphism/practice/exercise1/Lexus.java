package io.codelex.polymorphism.practice.exercise1;

public class Lexus implements Car, Boost {
    private Integer currentSpeed = 0;
    private final String carName;

    public Lexus(String carName) {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 8;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 8;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 30;
    }

}
