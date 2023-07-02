package io.codelex.polymorphism.practice.exercise1;

public class Nissan implements Car {
    private Integer currentSpeed = 0;
    private final String carName;

    public Nissan(String carName) {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 9;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 9;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }
}
