package com.epam.training.student_matsvei_shablouski.fundamentals.main_task;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! " + "Please, input you're name!");
        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");

        //2
        System.out.println(new StringBuffer(userName).reverse());

        //3
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 6);
            if (randomNumber == 5) {
                System.out.println(randomNumber);
            }else System.out.print(randomNumber + " ");
        }

        //4
        System.out.println();
        System.out.println("Input several numbers!");
        int sumOfNumbers = 0;
        while (sumOfNumbers < 20) {
            sumOfNumbers += scanner.nextInt();
        }
        System.out.println(sumOfNumbers);

        //5
        System.out.println("Please input number of month!");
        switch (scanner.nextInt()) {
            case (1):
                System.out.println("January");
                break;

                case (2):
                    System.out.println("February");
                    break;

                    case (3):
                        System.out.println("March");
                        break;

                        case (4):
                            System.out.println("April");
                            break;

                            case (5):
                                System.out.println("May");
                                break;

                                case (6):
                                    System.out.println("June");
                                    break;

                                    case (7):
                                        System.out.println("July");
                                        break;

                                        case (8):
                                            System.out.println("August");
                                            break;

                                            case (9):
                                                System.out.println("September");
                                                break;

                                                case (10):
                                                    System.out.println("October");

                                                    break;
                                                    case (11):
                                                        System.out.println("November");
                                                        break;

                                                        case (12):
                                                            System.out.println("December");
                                                            break;

                                                            default:
                                                                System.out.println("Incorrect number!");
                                                                break;

        }
    }
}
