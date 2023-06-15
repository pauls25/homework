package io.codelex.oop.summary;

import java.math.BigDecimal;

public class ItemPacking implements Service {
    private static final BigDecimal itemPacking = new BigDecimal(5);

    @Override
    public String fullInfo() {
        return String.format("Item packing, %.2f EUR", itemPacking);
    }

    @Override
    public BigDecimal getItemPrice() {
        return itemPacking;
    }
}
