package io.codelex.oop.cars;

import java.util.Objects;

public class Manufacturer {
    private String name;
    private int yearOfEstablishment;
    private String country;

    public Manufacturer(String name, int yearOfEstablishment, String country) {
        this.name = name;
        this.yearOfEstablishment = yearOfEstablishment;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfEstablishment() {
        return yearOfEstablishment;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return getYearOfEstablishment() == that.getYearOfEstablishment() && Objects.equals(getName(), that.getName()) && Objects.equals(getCountry(), that.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYearOfEstablishment(), getCountry());
    }
}
