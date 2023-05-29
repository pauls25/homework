package io.codelex.oop.computer;

public class Exercise7 {
    public static void main(String[] args) {
        Computer c1 = new Computer("i5", "4 gb", "-", "Dell", "X1");
        Computer c2 = new Computer("i5", "4 gb", "-", "Dell", "X1");

        Computer c3 = new Computer("i7", "8 gb", "Nvidia GTX1060", "Asus", "Extreme 2");

        System.out.println("Does computer 1 equal computer 2? " + c1.equals(c2));
        System.out.println("Does computer 3 equal computer 2? " + c3.equals(c2));

    }
}
