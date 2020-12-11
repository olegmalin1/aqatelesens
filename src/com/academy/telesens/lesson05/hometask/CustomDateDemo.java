package com.academy.telesens.lesson05.hometask;

public class CustomDateDemo {
    public static void main(String[] args) {
        CustomDate  customDate = new CustomDate();
        System.out.println(customDate.getFormattedDate(01, 12, 1991));
        System.out.println(CustomDate.validateDay(31, 5, 2007));
    }
}
