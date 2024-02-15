package com.epam.training.student_matsvei_shablouski.collections.optional_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task4_6 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("d:/Codewars/Poem.txt");
        Scanner scanner = new Scanner(file);

        String poem = scanner.nextLine().replaceAll("[,’]", "");

        List<String> listPoem = Arrays.asList(poem.split(" "));

        //1
        //Collections.sort(listPoem, Comparator.comparing(String :: length));
        //2
        //listPoem.sort(Comparator.comparing(String :: length));
        //3
        Collections.sort(listPoem, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println(listPoem);

    }
}
