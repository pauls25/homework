package io.codelex.polymorphism.practice.exercise1;

public class Bmw implements Car {
    private Integer currentSpeed = 0;
    private final String carName;

    public Bmw(String carName) {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return this.carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 12;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 12;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

}
