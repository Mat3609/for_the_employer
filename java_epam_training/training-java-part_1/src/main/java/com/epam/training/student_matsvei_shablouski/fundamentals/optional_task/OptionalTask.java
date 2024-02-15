package com.epam.training.student_matsvei_shablouski.fundamentals.optional_task;

import java.util.*;

public class OptionalTask {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (list.size() != 10) {
            list.add(scanner.nextInt());
        }

        list.sort(Comparator.comparing(integer -> integer));
        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));
        System.out.println(list);


        //3
        int sumNumbers = 0;
        for (int number : list) {
            sumNumbers += number;
        }
        sumNumbers = sumNumbers / list.size();

        int finalSumNumbers = sumNumbers;

        list.stream().filter(integer -> integer < finalSumNumbers).forEach(System.out :: println);

    }
}
