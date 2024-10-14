package org.example;
import java.io.*;
import java.util.*;

public class Second {
    public static void main(String[] args) {
        List<Integer> C1 = new ArrayList<>();
        List<Integer> C2 = new ArrayList<>();

        try {

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\1\\IdeaProjects\\Control_work_3\\src\\main\\java\\org\\example\\input2"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] numbers = line.split("\\s+");
                for (String numStr : numbers) {
                    int number = Integer.parseInt(numStr);
                    if (number < 0) {
                        break;
                    }
                    C1.add(number);
                }
                while ((line = reader.readLine()) != null) {
                    numbers = line.split("\\s+");
                    for (String numStr : numbers) {
                        int number = Integer.parseInt(numStr);
                        if (number < 0) {
                            break;
                        }

                        C2.add(number);
                    }
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            return;
        }

        Collections.sort(C1);
        Collections.sort(C2);

        List<Integer> mergedList = new ArrayList<>(C1);
        mergedList.addAll(C2);
        Collections.sort(mergedList);

        System.out.print("Объединенный отсортированный список: ");
        for (int num : mergedList) {
            System.out.print(num + " ");
        }
    }
}
