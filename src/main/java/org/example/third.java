package org.example;
import java.io.*;
import java.util.*;

public class third {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\1\\IdeaProjects\\Control_work_3\\src\\main\\java\\org\\example\\input3"));
        List<String> lines = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        br.close();

        Collections.sort(lines, Comparator.comparingInt(String::length));

        for (String s : lines) {
            System.out.println(s);
        }
    }
}
