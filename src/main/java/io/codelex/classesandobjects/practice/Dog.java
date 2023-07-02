package io.codelex.classesandobjects.practice;

import java.util.Objects;

public class Dog {
    private String name;
    private String sex;
    private String mother;
    private String father;

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public Dog(String name, String sex, String mother, String father) {
        this.name = name;
        this.sex = sex;
        this.mother = mother;
        this.father = father;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String fathersName() {
        String fathersName = null;
        if (this.father != null) {
            fathersName = this.father;
        } else {
            fathersName = "Unknown";
        }
        return fathersName;
    }

    public String getMother() {
        return this.mother;
    }

    public boolean hasSameMotherAs(Dog otherDog) {
        if (this.mother == null && otherDog.getMother() == null) {
            return false;
        } else {
            return this.mother.equals(otherDog.getMother());
        }
    }
}
