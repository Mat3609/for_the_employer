package com.epam.training.student_matsvei_shablouski.collections.optional_task;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String reversStr = "";
        int reversNumber = 0;
        Stack<Integer> stack = new Stack<>();

        while (number > 0) {
            stack.push(number % 10);
            number /= 10;

            reversStr += stack.peek();
        }

        System.out.println(reversNumber = Integer.parseInt(reversStr));
    }
}
