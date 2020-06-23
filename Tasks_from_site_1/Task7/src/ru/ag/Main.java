package ru.ag;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> matrix = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            matrix.add(i);
        }

        System.out.println("For");
        for (int i = 0; i < 10; i++)
            System.out.print(matrix.get(i) + " ");

        System.out.println("\nWhile");
        Iterator iterator = matrix.iterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        System.out.println("\nImproved for");
        for(Object item : matrix)
            System.out.print(item + " ");
    }
}
