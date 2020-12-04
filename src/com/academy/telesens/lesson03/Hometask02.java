package com.academy.telesens.lesson03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hometask02 {

//    Проинициализировать одномерный массив произвольными целыми числами
//    Вывести массив в виде , например:
//		[3, 4, 9, 10, 34, 239, 8, 0, -3, 19, 17]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int arraySize = scanner.nextInt();
        Random random = new Random();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100 + 100) - 100;
        }
        System.out.println(Arrays.toString(array) + " - Fill array using for");

        int i = 0;
        while (i < array.length) {
            array[i] = random.nextInt(100 + 100) - 100; //random numbers in range from -100 to +100
            i++;
        }
        System.out.println(Arrays.toString(array) + " - Fill array using while");
    }
}
