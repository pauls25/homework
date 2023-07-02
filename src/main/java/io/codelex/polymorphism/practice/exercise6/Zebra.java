package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zebra sounds!");
    }

    @Override
    void eatFood(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
            System.out.println(this);
        } else {
            System.out.println("Zebra only eats vegetables!");
        }
    }

    @Override
    public String toString() {
        return animalType + " [" +
                animalName + ", " +
                animalWeight + ", " +
                livingRegion + ", " +
                foodEaten + " ]";
    }
}
