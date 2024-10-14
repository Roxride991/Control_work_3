package org.example;

import java.io.*;
import java.util.*;

public class first {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int X = 0;

        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\1\\IdeaProjects\\Control_work_3\\src\\main\\java\\org\\example\\input1"));

            String[] input = reader.readLine().split("\\s+");
            for (String s : input) {
                list.add(Integer.parseInt(s));
            }

            String xLine = reader.readLine();
            if (xLine != null && !xLine.isEmpty()) {
                X = Integer.parseInt(xLine);
            } else {
                System.out.println("Ошибка: значение X не найдено в файле.");
                return;
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла.");
            return;
        }


        int i = 0;
        int j = list.size() - 1;

        while (i <= j) {
            if (list.get(i) <= X) {
                i++;
            }
            else if (list.get(j) > X) {
                j--;
            }
            else {
                Collections.swap(list, i, j);
                i++;
                j--;
            }
        }

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
