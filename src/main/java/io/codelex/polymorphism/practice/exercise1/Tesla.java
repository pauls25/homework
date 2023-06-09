package io.codelex.polymorphism.practice.exercise1;

public class Tesla implements Car {
    private Integer currentSpeed = 0;
    private final String carName;

    public Tesla(String carName) {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void speedUp() {
        currentSpeed += 20;
    }

    @Override
    public void slowDown() {
        currentSpeed -= 20;
    }

    @Override
    public String showCurrentSpeed() {
        return currentSpeed.toString();
    }

    @Override
    public void startEngine() {
        System.out.println("-- silence ---");
    }
}
