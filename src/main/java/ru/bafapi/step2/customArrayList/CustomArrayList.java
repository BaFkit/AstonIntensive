package ru.bafapi.step2.customArrayList;

public interface CustomArrayList<T> extends Iterable<T>{

    void add(T t);
    void add(int index, T t);
    T get(int index);
    void delete(int index);
    int size();
    void replace(int index, T t);
    void display();

}
