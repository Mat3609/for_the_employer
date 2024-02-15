package com.epam.training.student_matsvei_shablouski.fundamentals.optional_task;


import java.util.*;

public class OptionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int[][] matrix = new int[x][y];
        List<Integer> lists = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = random.nextInt(-100, 100);
                lists.add(matrix[i][j]);
            }
        }

        Collections.sort(lists);
        System.out.println(lists);


        int sch = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = lists.get(sch);
                sch++;

            }
        }
        System.out.println(lists);

        System.out.println(Arrays.deepToString(matrix));



    }
}
