package com.academy.telesens.lesson02;

import java.util.Scanner;

public class Classwork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age: ");
         if (scanner.hasNextInt()) {
             int age = scanner.nextInt();

             if (age > 0 && age < 19) {
                 System.out.println("несовершеннолетний");
             } else if (age > 18 && age < 90) {
                 System.out.println("взрослый");
             } else if (age >= 90) {
                 System.out.println("долгожитель");
             } else {
                 System.out.println("unknown");
             }
         }
    }
}
