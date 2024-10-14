package org.example;

import java.io.*;
import java.util.*;

public class sixth {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\1\\IdeaProjects\\Control_work_3\\src\\main\\java\\org\\example\\input6";

        Map<String, Integer> wordCount = new HashMap<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {

                String[] words = line.split("S");

                for (String word : words) {
                    word = word.toLowerCase();
                    word = word.replaceAll("[^a-zA-Zа-яА-ЯёЁ]", "");
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            reader.close();

            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
            sortedWords.sort(Map.Entry.comparingByValue());

            System.out.println("Частота встречаемости в порядке убывания:");
            for (Map.Entry<String, Integer> entry : sortedWords.reversed()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}


