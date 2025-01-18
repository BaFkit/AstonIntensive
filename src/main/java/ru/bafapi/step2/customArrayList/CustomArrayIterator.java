package ru.bafapi.step2.customArrayList;

import java.util.Iterator;

public class CustomArrayIterator<T> implements Iterator<T> {
    private int index = 0;
    private T[] values;

    CustomArrayIterator(T[] values) {
        this.values = values;
    }

    @Override
    public boolean hasNext() {
        return index < values.length;
    }

    @Override
    public T next() {
        return values [index++];
    }
}
