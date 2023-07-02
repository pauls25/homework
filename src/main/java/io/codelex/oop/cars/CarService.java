package io.codelex.oop.cars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService(List<Car> carList) {
        this.carList = carList;
    }

    public void addCarToCarList(Car car) {
        this.getCarList().add(car);
    }

    public void removeCarFromCarList(Car car) {
        this.getCarList().remove(car);
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

    /**
     * @compareMethod - write as a String <,>, <=,> =, =,! =
     */
    public List<Car> manufacturedByYear(Manufacturer manufacturer, int year, String compareMethod) {

        List<Car> carsMadeByManufacture = new ArrayList<>(this.carsManufacturedBy(manufacturer));
        List<Car> resultingList = new ArrayList<>();

        for (Car car : carsMadeByManufacture) {

            switch (compareMethod) {
                case "<":
                    if (car.getYearOfManufacture() < year) {
                        resultingList.add(car);
                    }
                    break;
                case ">":
                    if (car.getYearOfManufacture() > year) {
                        resultingList.add(car);
                    }
                    break;
                case "<=":
                    if (car.getYearOfManufacture() <= year) {
                        resultingList.add(car);
                    }
                    break;
                case ">=":
                    if (car.getYearOfManufacture() >= year) {
                        resultingList.add(car);
                    }
                    break;
                case "=":
                    if (car.getYearOfManufacture() == year) {
                        resultingList.add(car);
                    }
                    break;
                case "!=":
                    if (car.getYearOfManufacture() != year) {
                        resultingList.add(car);
                    }
                    break;
            }
        }
        return resultingList;
    }

    /**
     * @param ordering - can be either "ascending" or "descending"
     * @return
     */
    public List<Car> sortByPrice(String ordering) {
        List<Car> list = this.getCarList();
        if (ordering.equals("ascending")) {
            list.sort(Comparator.comparing(Car::getName));
        } else if (ordering.equals("descending")) {
            list.sort(Comparator.comparing(Car::getPrice).reversed());
        }
        return list;
    }
}
