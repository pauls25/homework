package io.codelex.classesandobjects.practice;

public class ProductTest {
    public static void main(String[] args) {

        Product product1 = new Product("Logitec mouse", 70.00, 14);
        Product product2 = new Product("iPhone 5s", 999.99, 3);
        Product product3 = new Product("Logitec mouse", 440.46, 1);

        product1.printProduct();
        product2.printProduct();
        product3.printProduct();
    }
}
