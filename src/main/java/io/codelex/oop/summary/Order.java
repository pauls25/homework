package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<SellableItem> items;
    private final BigDecimal VAT;

    public Order() {
        this.items = new ArrayList<>();
        this.VAT = new BigDecimal("0.21");
    }

    public void addItem(SellableItem item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (((FoodItem) item).getBestBeforeDate().isBefore(LocalDate.now())) {
                throw new BadFoodException();
            }
        } else {
            items.add(item);
        }
    }


    public List<SellableItem> getItems() {
        return this.items;
    }

    public BigDecimal getVAT() {
        return VAT;
    }

    public BigDecimal getOrderTotal() {
        return calculateTotalItemPriceNoVAT().add(calculateOrderVAT());
    }

    private BigDecimal calculateTotalItemPriceNoVAT() {
        BigDecimal totalPrice = new BigDecimal("0.0");
        for (SellableItem item : items) {
            totalPrice = totalPrice.add(item.getItemPrice());
        }
        return totalPrice;
    }

    public Double getOrderItemSum() {
        return calculateTotalItemPriceNoVAT().doubleValue();
    }

    private BigDecimal calculateOrderVAT() {
        return calculateTotalItemPriceNoVAT().multiply(getVAT());
    }

    public Double getOrderVATSum() {
        return calculateOrderVAT().doubleValue();
    }
}
