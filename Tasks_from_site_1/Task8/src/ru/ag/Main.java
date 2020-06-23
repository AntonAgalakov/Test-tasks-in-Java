package ru.ag;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        String str = "All the rules make it better";
        char[] arrayOfLetters = str.toCharArray();
        HashMap<Character, Integer> letters = new HashMap<>();

        for (char letter : arrayOfLetters) {
            if (letter == ' ')
                continue;

            if (letters.containsKey(letter))
                letters.put(letter, letters.get(letter) + 1);
            else
                letters.put(letter, 1);
        }

        for (Map.Entry<Character, Integer> letter : letters.entrySet())
            if(letter.getValue() > 1)
                System.out.println(letter.getKey() + " " + letter.getValue());

    }
}
