package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
    static int inputLineCount = 0;
    static Animal currentAnimal = null;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            String input = userInput.nextLine();

            if (input.equalsIgnoreCase("end")) {
                printAnimals(animals);

                break;
            } else {
                List<String> inputValues = Arrays.asList(input.split(" "));

                if (inputLineCount % 2 == 0) {
                    currentAnimal = createAnimal(inputValues);
                    currentAnimal.makeSound();
                    animals.add(currentAnimal);
                } else {
                    Food food = createFood(inputValues);
                    currentAnimal.eatFood(food);
                }

                inputLineCount++;
            }
        }
    }


    public static Animal createAnimal(List<String> inputValues) {
        String animalType = inputValues.get(0).toLowerCase();
        List<String> animalParameters = inputValues.subList(1, inputValues.size());

        Animal animal = null;
        switch (animalType) {
            case "cat" -> {
                animal = new Cat(
                        animalParameters.get(0),
                        animalType,
                        Double.parseDouble(animalParameters.get(1)),
                        animalParameters.get(2),
                        animalParameters.get(3)
                );
            }
            case "zebra" -> {
                animal = new Zebra(
                        animalParameters.get(0),
                        animalType,
                        Double.parseDouble(animalParameters.get(1)),
                        animalParameters.get(2)
                );
            }
            case "mouse" -> {
                animal = new Mouse(
                        animalParameters.get(0),
                        animalType,
                        Double.parseDouble(animalParameters.get(1)),
                        animalParameters.get(2)
                );
            }
            case "tiger" -> {
                animal = new Tiger(
                        animalParameters.get(0),
                        animalType,
                        Double.parseDouble(animalParameters.get(1)),
                        animalParameters.get(2)
                );
            }
            default -> System.out.println(animalType + "is the wrong animal type!");
        }
        return animal;
    }

    public static Food createFood(List<String> inputValues) {
        String foodType = inputValues.get(0).toLowerCase();
        Integer foodAmount = Integer.parseInt(inputValues.get(1));
        Food currentFood = null;
        switch (foodType) {
            case "vegetable" -> {
                currentFood = new Vegetable(foodAmount);
            }
            case "meat" -> {
                currentFood = new Meat(foodAmount);
            }
        }
        return currentFood;
    }

    public static void printAnimals(List<Animal> animals) {
        String line = String.join(
                ", ",
                animals.stream()
                        .map(Animal::toString)
                        .toArray(CharSequence[]::new)
        );
        System.out.println(line);
    }

}
