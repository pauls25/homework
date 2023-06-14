package io.codelex.javaadvancedtest.exercise2;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BasketTest {

    @Test
    public void testCreateMushroomBasket() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        try {
            mushroomBasket.addToBasket(new Mushroom());
        } catch (BasketFullException e) {
            System.out.println("Basket already fool");
        }

        Assert.assertTrue(mushroomBasket.getBasket().get(0) instanceof Mushroom);
    }

    @Test
    public void testCreateAppleBasket() {
        Basket<Apple> appleBasket = new Basket<>();
        try {
            appleBasket.addToBasket(new Apple());
        } catch (BasketFullException e) {
            System.out.println("Basket already fool");
        }

        Assert.assertTrue(appleBasket.getBasket().get(0) instanceof Apple);
    }

    @Test
    public void testBasketThrowsBasketFullException() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        String expectedExceptionMessage = "The basket can contain only 10 items! Basket is full!";
        Throwable exception = Assertions.assertThrows(BasketFullException.class, () -> {
            for (int i = 0; i < 10; i++) {
                mushroomBasket.addToBasket(new Mushroom());
            }
            mushroomBasket.addToBasket(new Mushroom());
        });
        Assertions.assertEquals(expectedExceptionMessage, exception.getMessage());
    }

    @Test
    public void testBasketThrowsBasketEmptyException() {
        Basket<Mushroom> mushroomBasket = new Basket<>();
        String expectedExceptionMessage = "Basket is already empty!";
        Throwable exception = Assertions.assertThrows(BasketEmptyException.class, () -> {
            mushroomBasket.removeFromBasket(new Mushroom());
        });
        Assertions.assertEquals(expectedExceptionMessage, exception.getMessage());
    }
}
