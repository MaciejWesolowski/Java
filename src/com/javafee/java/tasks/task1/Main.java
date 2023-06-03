package com.javafee.java.tasks.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        task1(number);
        task2(number);
    }

    public static void task1(int n) {
        System.out.println("------ task 1 ------");
        for(int row = 0; row < n; row++) { // for rows, i = 0, 1, ..., n row
            for(int column = 0; column < n; column++) // for columns, j = 0, 1, ..., n column
                System.out.print("*");
            System.out.println();
        }
    }

    public static void task2(int n) {
        System.out.println("------ task 2cls" +
                " ------");
        for (int row = 0, noOfStars = 1; row < n; row++, noOfStars++) {
            for(int star = 0; star < noOfStars; star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
