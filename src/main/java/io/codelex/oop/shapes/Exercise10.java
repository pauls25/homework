package io.codelex.oop.shapes;

public class Exercise10 {
    public static void main(String[] args) {
        Cube cube = new Cube(3, 3);
        Cone cone = new Cone(3, 4);

        System.out.printf("The area of a cube is: %.2f\n", cube.getArea());
        System.out.printf("The volume of a cube is: %.2f\n", cube.calculateVolume());

        System.out.printf("The area of a cone is: %.2f\n", cone.getArea());
        System.out.printf("The perimeter of a cone is: %.2f\n", cone.getPerimeter());
    }
}
