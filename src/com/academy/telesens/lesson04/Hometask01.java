package com.academy.telesens.lesson04;

import java.util.Scanner;
//
//1) Напишите программу, которая:
//        - считывает строку
//        - выводит исходную строку
//        - выводит количество и список слов, которые начинаются на букву 'd'
public class Hometask01 {
    public static void main(String[] args) {
        System.out.println("Enter string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("You entered - " + str);
        System.out.println("The list of words which are started from 'd': " + stringOfWords(str));
        System.out.println("The number of words that are started from 'd' is " + numberOfWords(str));
    }
    public static String stringOfWords(String str) {
    String[] massStr = str.split(" ");
    String strOfWords = "";
    for (int i = 0; i < massStr.length; i++) {
        if (massStr[i].startsWith("d")) {
            strOfWords += massStr[i] + " ";
        }
    }
    return strOfWords;
    }
    public static int numberOfWords(String str) {
        String[] massStr = str.split(" ");
        int numberOfWords =0;
        for (int i = 0; i < massStr.length; i++) {
            if (massStr[i].startsWith("d")) {
                numberOfWords++;
            }
        }
        return numberOfWords;
    }
}
