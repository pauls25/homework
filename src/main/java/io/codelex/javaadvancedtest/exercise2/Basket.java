package io.codelex.javaadvancedtest.exercise2;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {
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
        if (getBasket().size() < MAX_ITEM_COUNT) {

            this.contents.add(item);
        } else {
            throw new BasketFullException();
        }
    }

    public void removeFromBasket(T item) throws BasketEmptyException {
        this.contents.remove(item);
        if (getBasket().size() > MIN_ITEM_COUNT) {

            this.contents.remove(item);
        } else {
            throw new BasketEmptyException();
        }
    }

    public List<T> getBasket() {
        return this.contents;
    }
    
}
