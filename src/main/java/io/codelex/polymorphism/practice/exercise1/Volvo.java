package io.codelex.polymorphism.practice.exercise1;

public class Volvo implements Car, Boost {
    private Integer currentSpeed = 0;
    private final String carName;

    public Volvo(String carName) {
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

    @Override
    public void useNitrousOxideEngine() {
        currentSpeed = currentSpeed + 36;
    }
}
