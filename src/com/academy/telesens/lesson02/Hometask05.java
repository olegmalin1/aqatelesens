package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Hometask05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three-digit natural number");
        int inputNumber = scanner.nextInt();
        int firstDigit = inputNumber / 100;
        int secondDigit = (inputNumber / 10) % 10;
        int thirdDigit = inputNumber % 10;
        int sumOfDigits = firstDigit + secondDigit + thirdDigit;

        if (inputNumber < 100 || inputNumber > 999) {
            System.out.println("Entered number is not natural or three-digit. Restart program and try again");
        } else {
            System.out.println("Entered number is " + inputNumber);
            System.out.println("The sum of entered digits = " + sumOfDigits);
        }
    }
}
