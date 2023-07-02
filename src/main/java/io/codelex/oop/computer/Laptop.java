package io.codelex.oop.computer;

import java.util.Objects;

public class Laptop extends Computer {
    private String battery;

    public Laptop(String processor, String ram, String graphicsCard, String company, String model, String battery) {
        super(processor, ram, graphicsCard, company, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Objects.equals(getBattery(), laptop.getBattery());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getBattery());
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + super.getProcessor() + '\'' +
                ", ram='" + super.getRam() + '\'' +
                ", graphicsCard='" + super.getGraphicsCard() + '\'' +
                ", company='" + super.getCompany() + '\'' +
                ", model='" + super.getModel() + '\'' +
                ", battery='" + this.getBattery() + '\'' +
                '}';
    }
}
