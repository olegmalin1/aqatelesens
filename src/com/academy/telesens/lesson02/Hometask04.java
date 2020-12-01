package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Hometask04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two-digit natural number");
        int inputNumber = scanner.nextInt();
        int firstDigit = inputNumber / 10;
        int secondDigit = inputNumber % 10;
        int sumOfDigits = firstDigit + secondDigit;

        if (inputNumber < 10 || inputNumber > 99) {
            System.out.println("Entered number is not natural or two-digit. Restart program and try again");
        } else {
            System.out.println("Entered number is " + inputNumber);
            System.out.println("The sum of entered digits = " + sumOfDigits);
        }
    }
}
