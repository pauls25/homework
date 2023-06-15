package io.codelex.oop.summary;

import java.math.BigDecimal;

public abstract class AbstractItem implements Item {
    private final String name;
    private final BigDecimal priceEUR;

    public AbstractItem(String name, BigDecimal price) {
        this.name = name;
        this.priceEUR = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public BigDecimal getItemPrice() {
        return this.priceEUR;
    }


    @Override
    public String fullInfo() {
        return null;
    }
}
