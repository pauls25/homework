package io.codelex.typesandvariables.practice;

public class VariablesAndNames {
    public static void main(String[] args) {
        int cars;
        int drivers;
        int passengers;
        int carsNotDriven;
        int carsDriven;
        int seatsInACar; //used to be double
        double carpoolCapacity;
        double averagePassengersPerCar;

        cars = 100;
        seatsInACar = 4;
        drivers = 30;
        passengers = 90;
        carsNotDriven = cars - drivers; // free cars
        carsDriven = drivers; // cars driven at the moment
        carpoolCapacity = carsDriven * seatsInACar;
        averagePassengersPerCar = (double) passengers / carsDriven;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + carsNotDriven + " empty cars today.");
        System.out.println("We can transport " + String.format("%.2f", carpoolCapacity) +  " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + String.format("%.2f", averagePassengersPerCar) + " in each car.");
    }
}