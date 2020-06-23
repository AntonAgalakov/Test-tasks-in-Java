package ru.ag;

public class Main {

    public static void main(String[] args) {
        String str = "Rotor";
        char[] letters = str.toLowerCase().toCharArray();
        boolean isPalindrome = true;

        int count = 0;
        while (count < letters.length / 2) {
            if (letters[count] == letters[letters.length - count - 1]) {
                count++;
            } else {
                isPalindrome = false;
                break;
            }

        }

        if (isPalindrome)
            System.out.println("This word is a palindrome.");
        else
            System.out.println("This word is't a palindrome.");

    }
}
