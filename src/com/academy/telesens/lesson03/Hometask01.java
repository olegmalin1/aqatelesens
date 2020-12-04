package com.academy.telesens.lesson03;

import java.util.Scanner;

public class Hometask01 {
//    В переменной n хранится натуральное число произвольной разрядности.
//    Создайте программу, вычисляющую и выводящую на экран кол-во цифр и сумму цифр числа n.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter int number");
        int number;
        int sumOfNumbers = 0;
        int quantityOfNumbers = 0;
        number = scanner.nextInt();
        System.out.println("Enterd number is " + number);

        for (number = number; number != 0; number /= 10) {
            sumOfNumbers += number % 10;
            quantityOfNumbers++;
        }
        System.out.println("Sum of number = " + sumOfNumbers);
        System.out.println("Quantity of numbers = " + quantityOfNumbers);
    }
}
