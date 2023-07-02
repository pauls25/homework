package io.codelex.polymorphism.practice.exercise1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Take a look at the cars in this package.
 * 1. Extract common behaviour to an interface called Car, and use it in the all classes.
 * Which methods will be extracted with an empty body, and which can be default?
 * 2. Create two more cars of your own choice.
 * 3. As you see there is a possibility to use some kind of boost in Lexus, extract it to a new interface and add that behaviour in one more car.
 * 3. Create one instance of an each car and add them to list.
 * 4. Iterate over the list 10 times, in the 3rd iteration use speed boost on the car if they have one.
 * 5. Print out the car name and speed of the fastest car
 */
public class DragRace {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Audi("audi"));
        cars.add(new Bmw("Bmw"));
        cars.add(new Lexus("Lexus"));
        cars.add(new Tesla("Tesla"));
        cars.add(new Nissan("Nissan"));
        cars.add(new Volvo("Volvo"));

        Car somecar = new Volvo("vova");

        for (int i = 0; i < 10; i++) {
            for (Car car : cars) {
                car.speedUp();
                if (i == 2) {
                    if (hasMethod(car)) {
                        invokeMethod(car);
                    }
                }
            }
        }
        findWinner(cars);
    }

    private static void findWinner(List<Car> cars) {
        Car fastestCar = new Volvo("placeholder car");
        int fastestSpeed = 0;

        for (Car car : cars) {
            int carSpeed = Integer.parseInt(car.showCurrentSpeed());
            if (carSpeed > fastestSpeed) {
                fastestSpeed = carSpeed;
                fastestCar = car;
            }
        }
        System.out.println("The fastest car was " + fastestCar.getCarName() + " with a speed of " + fastestSpeed);
    }

    private static boolean hasMethod(Object object) {
        Class<?> objectClass = object.getClass();

        Method[] methods = objectClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equals("useNitrousOxideEngine")) {
                return true;
            }
        }

        return false;
    }

    private static void invokeMethod(Object object) {
        Class<?> objectClass = object.getClass();

        try {
            Method method = objectClass.getMethod("useNitrousOxideEngine");

            method.invoke(object);
        } catch (NoSuchMethodException e) {
            System.out.println("Method not found: " + "useNitrousOxideEngine");
        } catch (IllegalAccessException | InvocationTargetException e) {
            System.out.println("Failed to invoke method: " + "useNitrousOxideEngine");
        }
    }
}
