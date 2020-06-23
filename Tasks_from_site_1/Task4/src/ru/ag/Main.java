package ru.ag;

public class Main {

    public static void main(String[] args) {
	    int number = 2 + (int) (Math.random() * 100); // I take a random number
        boolean prime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime)
            System.out.println("Number " + number + " is prime");
        else
            System.out.println("Number " + number + " is't prime");
    }
}
