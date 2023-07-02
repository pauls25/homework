package io.codelex.oop.shapes;

public class Exercise9 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 4, 3);
        Triangle triangle = new Triangle(3, 3, 5);
        Hexagon hexagon = new Hexagon(6, 3.0);

        System.out.printf("The area of a rectangle is: %.2f\n", rectangle.getArea());
        System.out.printf("The perimeter of a rectangle is: %.2f\n", rectangle.getPerimeter());

        System.out.printf("The area of a triangle is: %.2f\n", triangle.getArea());
        System.out.printf("The perimeter of a triangle is: %.2f\n", triangle.getPerimeter());

        System.out.printf("The area of a triangle is: %.2f\n", hexagon.getArea());
        System.out.printf("The perimeter of a triangle is: %.2f\n", hexagon.getPerimeter());
    }
}
