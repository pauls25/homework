package io.codelex.javaadvancedtest.exercise5;

import java.util.List;
import java.util.function.Predicate;

public class PercentageCalculator {
    public static <T> double partOf(List<T> list, Predicate<T> condition) {
        long matchingCount = list.stream()
                .filter(condition)
                .count();

        return (double) matchingCount / list.size();
    }
}
