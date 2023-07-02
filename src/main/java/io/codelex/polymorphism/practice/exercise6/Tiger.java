package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public class Tiger extends Feline {

    public Tiger(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar!");
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Meat) {
            foodEaten += food.quantity;
            System.out.println(this);
        } else {
            System.out.println(this.getAnimalType() + " only eats Meat!");
        }
    }

}
