package io.codelex.oop.persons;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee extends Person {
    private String position;
    private final LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    public int getWorkExperience() {
        return (int) ChronoUnit.YEARS.between(this.getStartedWorking(), LocalDate.now());
    }

    @Override
    public String getInfo() {
        return String.format("%s %s (%d years)\n", this.getPosition(), this.getFullName(), this.getWorkExperience());
    }

    public LocalDate getStartedWorking() {
        return this.startedWorking;
    }

    public String getPosition() {
        return position;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName();
    }
}
