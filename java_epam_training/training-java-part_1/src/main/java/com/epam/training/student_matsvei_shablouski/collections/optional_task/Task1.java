package com.epam.training.student_matsvei_shablouski.collections.optional_task;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File readFile = new File("d:/Codewars/Names.txt");
        File writeFile = new File("d:/Codewars/ReversString.txt");

        PrintWriter printWriter = new PrintWriter(writeFile);
        Scanner scanner = new Scanner(readFile);

        String str = scanner.nextLine();
        List<String> list = Arrays.asList(str.split(" "));


        ListIterator<String> iterator = list.listIterator(list.size());
        while (iterator.hasPrevious()) {
           String word = iterator.previous();
           word += " ";
            printWriter.print(word);
        }

        printWriter.close();
        scanner.close();
    }
}
