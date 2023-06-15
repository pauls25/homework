package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class HouseholdItem extends AbstractItem {
    private final String color;

    public HouseholdItem(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String fullInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        return getName() + ", " + decimalFormat.format(getItemPrice()) + " EUR, color: " + getColor();
    }

}
