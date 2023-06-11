package io.codelex.oop.summary;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {
    private final LocalDate bestBeforeDate;

    public FoodItem(String name, BigDecimal price, LocalDate bestBeforeDate) {
        super(name, price);
        this.bestBeforeDate = bestBeforeDate;
    }

    public LocalDate getBestBeforeDate() {
        return bestBeforeDate;
    }

    @Override
    public String fullInfo() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dateString = getBestBeforeDate().format(dateFormat);

        DecimalFormat decimalFormat = new DecimalFormat("##.00");

        return getName() + ", " + decimalFormat.format(getItemPrice()) + " EUR, best before: " + dateString;
    }


}
