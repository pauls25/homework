package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class Exercise3 {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);
        if (overlap == null) {
            System.out.println("Periods don't have an overlap!");
        } else {
            System.out.println("Overlap period starts at " +
                    overlap.getStart() +
                    " and ends at " +
                    overlap.getEnd() + ".");
        }
//overlap variable should have start date 10.01.2022 and end date 15.01.2022
    }

}
