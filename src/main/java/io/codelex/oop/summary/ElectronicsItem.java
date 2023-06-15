package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class ElectronicsItem extends AbstractItem {
    private final Double powerWatts;

    public ElectronicsItem(String name, BigDecimal price, Double powerWatts) {
        super(name, price);
        this.powerWatts = powerWatts;
    }

    public Double getPowerWatts() {
        return powerWatts;
    }

    @Override
    public String fullInfo() {
        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        return getName() + ", " + decimalFormat.format(getItemPrice()) + " EUR, power: " + String.format("%.2fW", getPowerWatts());
    }

}
