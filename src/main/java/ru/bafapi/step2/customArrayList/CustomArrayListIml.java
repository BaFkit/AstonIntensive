package ru.bafapi.step2.customArrayList;

import java.util.Arrays;
import java.util.Iterator;

public class CustomArrayListIml<T> implements CustomArrayList<T>{

    private T[] array;
    private int size;
    private final int DEFAULT_CAPACITY = 10;
    private int capacity;


    public CustomArrayListIml(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity <= 0");
        }
        this.capacity = capacity;
        array = (T[]) new Object[capacity];
    }

    public CustomArrayListIml() {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        capacity = DEFAULT_CAPACITY;
    }

    @Override
    public void add(T t) {
        if (capacity == size) {
            resize();
        }
        array[size++] = t;
    }

    @Override
    public void add(int index, T t) {
        indexCheck(index);
        if (capacity == size()) {
            resize();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = t;
        size++;
    }

    @Override
    public void delete(int index) {
        indexCheck(index);
        Object item = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    @Override
    public T get(int index) {
        indexCheck(index);
        return array[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void replace(int index, T t) {
        indexCheck(index);
        array[index] = t;
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomArrayIterator<>(array);
    }

    @Override
    public void display() {
        System.out.println(Arrays.toString(array));
    }

    private void resize() {
        capacity = (capacity*3)/2+1;
        Object[] newArray = new Object[capacity];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = (T[]) newArray;
    }

    private void indexCheck(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Incorrect index");
        }
    }
}
