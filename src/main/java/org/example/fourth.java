package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class fourth {

    public static void main(String[] args) {
        String filename = "C:\\Users\\1\\IdeaProjects\\Control_work_3\\src\\main\\java\\org\\example\\input4";
        Set<String> uniqueWords = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    uniqueWords.add(word.toLowerCase());
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        }

        System.out.println("Различные слова");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}
