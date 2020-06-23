package ru.ag;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	String str = "java c++ python ruby java javascript";
	String[] words = str.split(" ");
        HashMap<String, Integer> hashMapWords = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            if (hashMapWords.containsKey(words[i])) {
                 hashMapWords.put(words[i], hashMapWords.get(words[i]) + 1);
            } else {
                hashMapWords.put(words[i], 1);
            }
        }

        System.out.println(hashMapWords);
    }
}
