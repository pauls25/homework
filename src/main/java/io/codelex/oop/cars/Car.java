package io.codelex.oop.cars;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Car {
    private String name;
    private String model;
    private BigDecimal price;
    private int yearOfManufacture;
    private EngineType engineType;
    private List<Manufacturer> manufacturerList;

    public Car(String name, String model, BigDecimal price, int yearOfManufacture, EngineType engineType, List<Manufacturer> manufacturerList) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearOfManufacture;
        this.engineType = engineType;
        this.manufacturerList = manufacturerList;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public EngineType getEngineType() {
        return this.engineType;
    }

    public List<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }

    public void addManufacturer(Manufacturer manufacturer) {
        this.manufacturerList.add(manufacturer);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getYearOfManufacture() == car.getYearOfManufacture() && Objects.equals(getName(), car.getName()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getPrice(), car.getPrice()) && getEngineType() == car.getEngineType() && Objects.equals(getManufacturerList(), car.getManufacturerList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getModel(), getPrice(), getYearOfManufacture(), getEngineType(), getManufacturerList());
    }

    @Override
    public String toString() {
        return "'" + name + " model: " + model + "'";
    }
}