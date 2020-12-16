package com.academy.telesens.lesson06.hometask;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        System.out.println(customDate.getFormattedDate());
        System.out.println(CustomDate.validateDay(31, 5, 2007));

        CustomDateTime customDateTime = new CustomDateTime(12, 12, 1998, 22, 35, 26);
        System.out.println(customDateTime.getFormattedDate());
    }
}
