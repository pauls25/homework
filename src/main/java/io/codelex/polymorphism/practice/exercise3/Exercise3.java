package io.codelex.polymorphism.practice.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "Hook", "Brick Street 3", 112, 3.6);
        Employee employee = new Employee("John", "Builder", "Main Street 1", 1, "Junior programmer");

        student.display();
        employee.display();
    }
}
