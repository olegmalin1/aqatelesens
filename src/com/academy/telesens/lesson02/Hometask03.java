package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Hometask03 {
    public static void main(String[] args) {

        int divisionResult, remainder, numberOne, numberTwo;

        //Ask to enter numbers via console

        if (args.length == 0) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first natural number");
        numberOne = scanner.nextInt();
        System.out.println("Enter second natural number");
        numberTwo = scanner.nextInt();
        divisionResult = numberOne/numberTwo;
        remainder = numberOne%numberTwo;

        if (numberOne < 1 || numberTwo < 1) {  //Check that entered numbers are natural
            System.out.println("Entered number is not a natural number. Restart program and try again.");
        } else {
            System.out.println("First number is " + numberOne);
            System.out.println("Second number is " + numberTwo);
            System.out.println("First number / second number = " + divisionResult);
            System.out.println("Remainder is " + remainder);
        }
        } else {        //Get numbers from arguments
            numberOne = Integer.parseInt(args[0]);
            numberTwo = Integer.parseInt(args[1]);
            divisionResult = numberOne/numberTwo;
            remainder = numberOne%numberTwo;

            System.out.println("First number is " + numberOne);
            System.out.println("Second number is " + numberTwo);
            System.out.println("First number / second number = " + divisionResult);
            System.out.println("Remainder is " + remainder);

        }
    }
}
