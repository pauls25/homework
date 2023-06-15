package io.codelex.oop.summary;

import java.util.function.Supplier;

public class LazyBox<T> {
    private final Supplier<T> initializer;
    private T lazyObjectInstance;

    public LazyBox(Supplier<T> initializer) {
        this.initializer = initializer;
    }

    public T get() {
        if (lazyObjectInstance == null) {
            this.lazyObjectInstance = initializer.get();
        }
        return lazyObjectInstance;
    }
}
