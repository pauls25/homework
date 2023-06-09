package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.time.Duration;

public abstract class Animal {
    String animalName;
    String animalType;
    Double animalWeight;
    Integer foodEaten;

    public Animal(String animalName, String animalType, Double animalWeight) {
        this.animalName = animalName;
        this.animalType = animalType;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    abstract void makeSound();

    abstract void eatFood(Food food);

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        return animalType + " [" +
                animalName + ", " +
                decimalFormat.format(animalWeight) + ", " +
                foodEaten + " ]";
    }

    public String getAnimalType() {
        return animalType;
    }
}
