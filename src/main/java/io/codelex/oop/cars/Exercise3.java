package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        Manufacturer manufA = new Manufacturer("Company A", 1950, "Japan");
        Manufacturer manufB = new Manufacturer("Company B", 1930, "Germany");
        Manufacturer manufC = new Manufacturer("Company C", 1995, "USA");

        Car car1 = new Car("Car A", "Model abc", BigDecimal.valueOf(1000), 1960, EngineType.V12, Arrays.asList(manufA, manufB, manufC));
        Car car2 = new Car("Car A", "Model abc", BigDecimal.valueOf(1000), 1960, EngineType.V12, Arrays.asList(manufA, manufB, manufC));
        Car car3 = new Car("Car B", "model 3", BigDecimal.valueOf(2000), 2000, EngineType.V8, Arrays.asList(manufA));
        Car car4 = new Car("Car C", "model 4", BigDecimal.valueOf(3000), 2000, EngineType.V8, Arrays.asList(manufC));
        Car car5 = new Car("Car D", "model 4", BigDecimal.valueOf(3500), 2000, EngineType.V8, Arrays.asList(manufC));

        List<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3));
        CarService carService = new CarService(carList);

        carService.addCarToCarList(car4);
        carService.removeCarFromCarList(car4);

        System.out.println("Car list: " + carService.getCarList());
        System.out.println("Cars with v12 : " + carService.getCarsWithV12());
        System.out.println("Cars made after 1990 : " + carService.getCarsAfter1990());
        System.out.println("Most expensive car : " + carService.getMostExpensiveCar());
        System.out.println("Least expensive car : " + carService.getCheapestCar());
        System.out.println("Cars with at least three manufacturers: " + carService.getCarsWithThreeOrMoreManufacturers());
        System.out.println("Cars sorted by price ascending : " + carService.sortByPrice("ascending"));
        System.out.println("Cars sorted by price descending : " + carService.sortByPrice("descending"));
        System.out.println("Cars made by Company C: " + carService.carsManufacturedBy(manufC));
        System.out.println("Is car 'Car A' on the list? : " + carService.isCarOnList(car1));
        System.out.println("Is car 'Car D' on the list? : " + carService.isCarOnList(car5));
        System.out.println("Here are cars made by " + manufC.getName() + ": " + carService.carsManufacturedBy(manufC));
        System.out.println("Here are cars made by " + manufA.getName() + " by the year 1990 :" + carService.manufacturedByYear(manufA, 1990, "<="));
    }
}
