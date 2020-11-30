package com.academy.telesens.lesson02;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numberOne = scanner.nextInt();
        System.out.println("Enter second number");
        int numberTwo = scanner.nextInt();
        System.out.println("Enter third number");
        int numberThree = scanner.nextInt();

        int[] allNumbers = new int[]{numberOne, numberTwo, numberThree};
        Arrays.sort(allNumbers);
        System.out.println(allNumbers[0] + " is min number");
        System.out.println(allNumbers[2] + " is max number");
        System.out.println(allNumbers[1] + " is middle number");
    }

}
