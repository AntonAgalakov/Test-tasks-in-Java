package ru.ag;

public class Main {

    public static void main(String[] args) {
        String str = "Hello World!";
        char[] temp = str.toCharArray();

        for (int i = temp.length - 1; i >= 0; i--)
            System.out.print(temp[i]);
    }
}
