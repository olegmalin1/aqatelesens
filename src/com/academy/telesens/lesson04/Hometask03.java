package com.academy.telesens.lesson04;

import java.util.Scanner;

//
// Напишите программу, которая:
//         - считывает строку
//         - считывает подстроку
//         - выводит исходные строку и подстроку и выводит кол-во вхождений строки в подстроку
public class Hometask03 {
    public static void main(String[] args) {
        System.out.println("Enter main string");
        Scanner scanner = new Scanner(System.in);
        String mainStr = scanner.nextLine();
        System.out.println("Enter sub string");
        String subStr = scanner.nextLine();

        System.out.println("Entered string is - " + mainStr);
        System.out.println("Entered sub string is - " + subStr);
        System.out.println("Number of entrance is - " + entranceCount(mainStr, subStr));

    }
    public static int entranceCount (String mainStr, String subStr) {
        int lastIndex = 0;
        int count =0;

        while (lastIndex != -1) {
            lastIndex = mainStr.indexOf(subStr, lastIndex);
            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }
        return count;
    }
}
