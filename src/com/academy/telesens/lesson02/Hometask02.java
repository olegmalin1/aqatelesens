package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Hometask02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight on the Earth");
        int earthWeight = scanner.nextInt();
        double moonWeight = earthWeight / 100d * 17d;
        System.out.println("Your weight on the Earth is " + earthWeight);
        System.out.println("Your weight on the Moon is " + moonWeight);
    }
}
