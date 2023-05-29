package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {

        Manufacturer manufA = new Manufacturer("Company A", 1950, "Japan");
        Manufacturer manufB = new Manufacturer("Company B", 1930, "Germany");
        Manufacturer manufC = new Manufacturer("Company C", 1995, "USA");

        Car car1 = new Car("Car A", "Model abc", BigDecimal.valueOf(1000), 2000, EngineType.V12, Arrays.asList(manufA, manufB, manufC));
        Car car2 = new Car("Car A", "Model abc", BigDecimal.valueOf(1000), 2000, EngineType.V12, Arrays.asList(manufA, manufB, manufC));

        Car car3 = new Car("Car B", "model", BigDecimal.valueOf(2000), 2000, EngineType.V8, Arrays.asList(manufA));
        Car car4 = new Car("Car C", "model", BigDecimal.valueOf(3000), 2000, EngineType.V8, Arrays.asList(manufA));

        CarService carService = new CarService(Arrays.asList(car1, car2, car3));

//        carService.addCarToCarList(car4);
//        carService.removeCarFromCarList(car4);

        System.out.println("Car list: " + carService.getCarList());
        System.out.println("Cars with v12 : " + carService.getCarsWithV12());
        System.out.println("Cars made after 1990 : " + carService.getCarsAfter1990());
        System.out.println("Most expensive car : " + carService.getMostExpensiveCar());
        System.out.println("Least expensive car : " + carService.getCheapestCar());
        System.out.println("Cars with at least three manufacturers: " + carService.getCarsWithThreeOrMoreManufacturers());
        System.out.println("Cars made by Company C: " + carService.carsManufacturedBy(manufC));
    }
}
