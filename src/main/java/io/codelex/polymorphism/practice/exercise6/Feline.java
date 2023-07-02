package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;

public abstract class Feline extends Mammal {

    public Feline(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("0.#");
        return animalType + " [" +
                animalName + ", " +
                decimalFormat.format(animalWeight) + ", " +
                livingRegion + ", " +
                foodEaten + " ]";
    }
}
