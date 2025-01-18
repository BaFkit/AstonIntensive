package ru.bafapi.step2.customArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        CustomArrayList<Integer> intList = new CustomArrayListIml<>();

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);

        intList.display();


        System.out.println(intList.get(0));
        System.out.println(intList.size());

        intList.add(8);

        intList.display();

        intList.replace(6, 7);

        intList.display();

        intList.add(8);
        intList.add(9);
        intList.add(10);
        intList.add(11);
        System.out.println(intList.size());

//        intList.display();

        intList.add(3, 77);
        intList.add(3, 77);
        intList.add(3, 77);
        intList.add(3, 77);
        intList.add(3, 77);
        intList.add(3, 77);

//        intList.display();

        intList.delete(3);
        intList.delete(3);
        intList.delete(3);
        intList.delete(3);
        intList.delete(3);
        intList.delete(3);

//        intList.display();

        for (Integer i : intList) {
            System.out.println(i);
        }

    }
}
