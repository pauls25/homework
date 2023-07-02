package io.codelex.oop.computer;

public class Exercise8 {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("i5", "4 gb", "-", "Dell", "X1", "5000 mAh");
        Laptop l2 = new Laptop("i5", "4 gb", "-", "Dell", "X1", "5000 mAh");

        Laptop l3 = new Laptop("i7", "8 gb", "Nvidia GTX1060", "Asus", "Gaming 2", "4400 mAh");

        System.out.println("Does computer 1 equal computer 2? " + l1.equals(l2));
        System.out.println("Does computer 1 equal computer 2? " + l3.equals(l2));

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
    }
}
