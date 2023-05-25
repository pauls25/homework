package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.util.*;

public class DatePeriod {
    private LocalDate start;
    private LocalDate end;

    public DatePeriod(LocalDate start, LocalDate end) {
        this.start = start;
        this.end = end;
    }

    public DatePeriod intersection(DatePeriod otherDatePeriod) {
        DatePeriod returnPeriod;
        // check if other period starts after this period ends and vice versa
        if (otherDatePeriod.getStart().isAfter(this.getEnd())) {
            returnPeriod = null;
        } else {
            List<LocalDate> dates = new ArrayList<LocalDate>(Arrays.asList(
                    this.getStart(),
                    this.getEnd(),
                    otherDatePeriod.getStart(),
                    otherDatePeriod.getEnd()
            ));
            Collections.sort(dates);
            returnPeriod = new DatePeriod(dates.get(1), dates.get(2));
        }
        return returnPeriod;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getEnd() {
        return end;
    }
}
