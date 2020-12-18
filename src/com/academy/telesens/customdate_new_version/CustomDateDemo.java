package com.academy.telesens.customdate_new_version;

import java.text.ParseException;
import java.util.Scanner;

public class CustomDateDemo {
    public static void main(String[] args) throws ParseException {

//        //Verify getFormattedDate & validate methods
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter date in format dd mm yyyy");
//        CustomDate customDate = new CustomDate(scanner.nextLine());
//        System.out.println(customDate.getFormattedDate());
//
//        //Verify dayOfWeek method
//        CustomDate customDate1 = new CustomDate();
//        System.out.println(customDate1.dayOfWeek(29, 2, 2000));
//
//        //Verify DateTime get formatted date
//        CustomDateTime customDateTime = new CustomDateTime(11, 12, 1212, 5, 55, 55);
//        System.out.println(customDateTime.getFormattedDate());
//
        //Verify getFormattedDateTime from String
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date and time in format dd mm yyyy hh mm ss");
        CustomDateTime customDateTime = new CustomDateTime(scanner.nextLine());
        System.out.println(customDateTime.getFormattedDate());
    }
}
