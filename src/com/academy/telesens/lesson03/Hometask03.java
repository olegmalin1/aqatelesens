package com.academy.telesens.lesson03;


import java.util.Scanner;

//	Нарисовать квадрат заданного размера. Пример для размера 4:
public class Hometask03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of figure");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size)
                    System.out.print("*");
                else if (j == 1 || j == size)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
