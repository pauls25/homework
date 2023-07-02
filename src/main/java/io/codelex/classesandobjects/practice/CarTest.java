package io.codelex.classesandobjects.practice;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car(2000);

        car.fillUp(2158, 30);
        System.out.println(car.calculateConsumption());

        car.fillUp(2150, 60);
        System.out.println(car.calculateConsumption());
    }

}
