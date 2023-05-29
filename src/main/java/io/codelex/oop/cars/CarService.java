package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCarToCarList(Car car) {
        this.carList.add(car);
    }

    public void removeCarFromCarList(Car car) {
        this.carList.remove(car);
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<Car> getCarsWithV12() {
        List<Car> V12CarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getEngineType() == EngineType.V12) {
                V12CarList.add(car);
            }
        }
        return V12CarList;
    }

    public List<Car> getCarsAfter1990() {
        List<Car> CarsAfter1990List = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYearOfManufacture() <= 1990) {
                CarsAfter1990List.add(car);
            }
        }
        return CarsAfter1990List;
    }

    public Car getMostExpensiveCar() {
        Car currentMostExpensiveCar = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice().compareTo(currentMostExpensiveCar.getPrice()) > 0) {
                currentMostExpensiveCar = car;
            }
        }
        return currentMostExpensiveCar;
    }

    public Car getCheapestCar() {
        Car currentCheapestCar = carList.get(0);
        for (Car car : carList) {
            if (car.getPrice().compareTo(currentCheapestCar.getPrice()) < 0) {
                currentCheapestCar = car;
            }
        }
        return currentCheapestCar;
    }

    public List<Car> getCarsWithThreeOrMoreManufacturers() {
        List<Car> carsWithThreeOrMoreManufacturers = new ArrayList<>();
        for (Car car : carList) {
            if (car.getManufacturerList().size() >= 3) {
                carsWithThreeOrMoreManufacturers.add(car);
            }
        }
        return carsWithThreeOrMoreManufacturers;
    }

    public List<Car> sortByField(String field) {
        return carList;
    }

    public boolean isCarOnList(Car otherCar) {
        return carList.contains(otherCar);
    }

    public List<Car> carsManufacturedBy(Manufacturer manufacturer) {
        List<Car> manufacturedBy = new ArrayList<>();
        for (Car car : carList) {
            for (Manufacturer manuf : car.getManufacturerList()) {
                if (manuf.equals(manufacturer)) {
                    manufacturedBy.add(car);
                }
            }
        }
        return manufacturedBy;
    }
}
