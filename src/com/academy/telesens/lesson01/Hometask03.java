package com.academy.telesens.lesson01;

import java.util.Scanner;

public class Hometask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows please");

        if (scanner.hasNextInt()) {
            int rows = scanner.nextInt();
            for (int a = 0; a < rows; a++) {
                for (int b = 0; b <= a; b++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("It's not a number. Restart programm and try again");
        }
        scanner.close();
    }
}
