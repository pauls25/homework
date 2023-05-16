package io.codelex.classesandobjects.practice;

public class Exercise9 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);
        swapPoints(p1, p2);

        System.out.println("(" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("(" + p2.getX() + ", " + p2.getY() + ")");
    }

    public static void swapPoints(Point p1, Point p2) {
        // used snake_case because it seemed more readable than cammelCase when adding indexes to variable names.
        int p1_x = p1.getX();
        int p1_y = p1.getY();

        int p2_x = p2.getX();
        int p2_y = p2.getY();

        p1.setX(p2_x);
        p1.setY(p2_y);

        p2.setX(p1_x);
        p2.setY(p1_y);
    }
}
