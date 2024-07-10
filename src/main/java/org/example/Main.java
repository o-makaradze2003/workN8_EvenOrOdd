package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(makeLIstFromWord("adfzd"));
    }

    public static List<String> makeLIstFromWord(String word) {
        if (word.length() % 2 != 0) {
            word += "_";
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i += 2) {
            list.add(word.substring(i, i + 2));
        }
        return list;
    }
}