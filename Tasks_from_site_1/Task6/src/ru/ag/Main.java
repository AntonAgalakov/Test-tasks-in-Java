package ru.ag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        int[] arrayOfFibonacci = new int[2];
        arrayOfFibonacci[1] = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        number = scanner.nextInt();

        System.out.print(arrayOfFibonacci[0] + " " + arrayOfFibonacci[1]);
        for (int i = 2; i < number; i++) {
            arrayOfFibonacci[i % 2] += arrayOfFibonacci[(i + 1) % 2];
            System.out.print(" " + arrayOfFibonacci[i % 2]);
        }
    }
}
