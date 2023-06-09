package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Squeak!");
    }

    @Override
    void eatFood(Food food) {
        if (food instanceof Vegetable) {
            foodEaten += food.quantity;
            System.out.println(this);
        } else {
            System.out.println(this.getAnimalType() + " only eats vegetables!");
        }
    }

}
