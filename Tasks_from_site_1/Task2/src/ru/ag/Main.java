package ru.ag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a, b;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a = ");
        a = scanner.nextInt();
        System.out.print("Input b = ");
        b = scanner.nextInt();

        b = a + b;
        a = b - a;
        b = b - a;
        System.out.println("Result: a = " + a + " b = " + b);
    }
}
