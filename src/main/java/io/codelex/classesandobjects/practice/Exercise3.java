package io.codelex.classesandobjects.practice;

public class Exercise3 {
    public static void main(String[] args) {

        FuelGauge gauge = new FuelGauge(0);
        Odometer odometer = new Odometer(100);

        gauge.fuelUpCar(10);

        while (gauge.getCurrentFuelInLiters() > 0) {
            odometer.increaseCurrentMileage(gauge);
            gauge.printCurrentFuelInLiters();
            odometer.printCurrentMileage();
        }
    }
}
