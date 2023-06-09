package io.codelex.polymorphism.practice.exercise5;

import java.math.BigDecimal;

public class Poster extends Advert {
    private int numberOfCopies;
    private BigDecimal costPerCopy;

    private double height;
    private double width;


    public Poster(int fee, int numberOfCopies, BigDecimal costPerCopy, double height, double width) {
        super(fee);
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
        this.height = height;
        this.width = width;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public BigDecimal getCostPerCopy() {
        return costPerCopy;
    }

    public void setCostPerCopy(BigDecimal costPerCopy) {
        this.costPerCopy = costPerCopy;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
