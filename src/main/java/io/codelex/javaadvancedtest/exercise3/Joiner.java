package io.codelex.javaadvancedtest.exercise3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        List<String> stringElements = Stream.of(elements)
                .map(Object::toString)
                .collect(Collectors.toList());
        return String.join(separator, stringElements);
    }
}
