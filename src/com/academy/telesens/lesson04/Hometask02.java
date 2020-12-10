package com.academy.telesens.lesson04;

import java.util.Scanner;
//
//Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые заканчиваются буквами 'ED'
public class Hometask02 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println("You entered - " + str1);
        System.out.println("The list of words which are ended with 'ED': " + stringOfWords1(str1));
        System.out.println("The number of words that are ended with 'ED' is " + numberOfWords1(str1));
    }
    public static String stringOfWords1(String str1) {
        String[] massStr = str1.split(" ");
        String strOfWords = "";
        for (int i = 0; i < massStr.length; i++) {
            if (massStr[i].endsWith("ED")) {
                strOfWords += massStr[i] + " ";
            }
        }
        return strOfWords;
    }
    public static int numberOfWords1(String str1) {
        String[] massStr = str1.split(" ");
        int numberOfWords =0;
        for (int i = 0; i < massStr.length; i++) {
            if (massStr[i].endsWith("ED")) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }
}
