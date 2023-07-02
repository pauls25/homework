package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Cat extends Feline {
    String breed;

    public Cat(String animalName, String animalType, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    void eatFood(Food food) {
        this.foodEaten += food.quantity;
        System.out.println(this);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        return animalType + " [" +
                animalName + ", " +
                breed + ", " +
                decimalFormat.format(animalWeight) + ", " +
                livingRegion + ", " +
                foodEaten + " ]";
    }
}
