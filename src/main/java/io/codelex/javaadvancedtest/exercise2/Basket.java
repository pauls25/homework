package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
    private int itemCount;
    private final int MAX_ITEM_COUNT = 10;
    private final int MIN_ITEM_COUNT = 0;
    private List<T> contents;

    public Basket() {
        this.contents = new ArrayList<>();
    }

    public Basket(List<T> contents) {
        this.contents = contents;
    }

    public void addToBasket(T item) throws BasketFullException {
        if (this.itemCount < MAX_ITEM_COUNT) {

            this.itemCount++;
            this.contents.add(item);
        } else {
            throw new BasketFullException();
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        this.contents.remove(item);
        if (this.itemCount > MIN_ITEM_COUNT) {

            this.contents.remove(item);
            this.itemCount--;
        } else {
            throw new BasketEmptyException();
        }
    }

    public List<T> getBasket() {
        return this.contents;
    }

}
