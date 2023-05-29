package io.codelex.oop.persons;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Peterson", "EID123", 25, "Manager", LocalDate.parse("2021-01-01"));
        Customer customer1 = new Customer("Bob", "Hob", "CID123", 25, 5);

        System.out.println("Employee info: " + employee1.getInfo());
        System.out.println("Customer info: " + customer1.getInfo());
    }
}
