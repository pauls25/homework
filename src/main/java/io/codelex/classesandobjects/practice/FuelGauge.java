package io.codelex.classesandobjects.practice;

public class FuelGauge {
    private double currentFuelInLiters;

    public FuelGauge(double currentFuelInLiters) {
        this.currentFuelInLiters = currentFuelInLiters;
    }

    public double getCurrentFuelInLiters() {
        return currentFuelInLiters;
    }

    public void printCurrentFuelInLiters() {
        System.out.println("Current fuel in liter: " + currentFuelInLiters);
    }

    public void fuelUpCar(double amount) {
        if (this.currentFuelInLiters <= 70 && (70 - this.currentFuelInLiters) >= amount) {
            this.currentFuelInLiters += amount;
        } else System.out.println("Fuel tank is full!");
    }

    public void decreaseFuelAmount(double amount) {
        this.currentFuelInLiters -= amount;
    }

}
