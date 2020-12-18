package com.academy.telesens.customdate_new_version;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class CustomDate {
    private int day;
    private int month;
    private int year;
    private String inputDate;


    public String getFormattedDate() {
        LocalDate localDate = LocalDate.of(year, month, day);
        String formattedDate = localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE"));
        return formattedDate;
    }

        public String dayOfWeek (int day, int month, int year) {
        if (validateDate(day, month, year)) {
            LocalDate localDate = LocalDate.of(year, month, day);
            String dayOfWeek = localDate.format(DateTimeFormatter.ofPattern("EEEE"));
            String formattedDayOfWeek = "Day of week for entered date is: " + dayOfWeek;
            return formattedDayOfWeek;
        } else {
            String errorMessage = "You entered incorrect date";
            return errorMessage;
        }
    }

    static boolean validateDate(int day, int month, int year) {
        if ((month <0) || (month >12)){
            return false;
        }
        if (day > 31) {
            return false;
        }
        if ((((month == 4) || (month == 6) || (month == 9) || (month == 11)) && (day > 30))){
            return false;
        }
        if ((month == 2) && (day > 29)) {
            return false;
        }
        if ((month == 2) && (day > 28) && (year % 4 !=0)){
            return false;
        } else if ((year % 100 == 0) && (year % 400 != 0)) {
            return false;
        }
        return true;
    }

    //Constructors

    public CustomDate() {
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public CustomDate(int day, int month, int year) {
        if (validateDate(day, month, year)) {
            this.day = day;
            this.month = month;
            this.year = year;
        } else {
            System.out.println("You are trying to set incorrect date");
        }
    }
    // Parse input string to array of integers
    public CustomDate(String inputDate) {
        String strInputDateArr[] = inputDate.split(" ");
        int intInputDate[] =new int[strInputDateArr.length];
        for (int i=0; i < strInputDateArr.length; i++){
            intInputDate[i] = Integer.parseInt(strInputDateArr[i]);
        }
        if (validateDate(intInputDate[0],intInputDate[1],intInputDate[2])) {
            this.day = intInputDate[0];
            this.month = intInputDate[1];
            this.year = intInputDate[2];
        } else {
            System.out.println("You are trying to set incorrect date");
        }
    }
    //Setters & Getters

    public String getInputDate() {
        return inputDate;
    }
    // Parse input string to array of integers
    public void setInputDate(String inputDate) {
        String strInputDateArr[] = inputDate.split(" ");
        int intInputDate[] =new int[strInputDateArr.length];
        for (int i=0; i < strInputDateArr.length; i++){
            intInputDate[i] = Integer.parseInt(strInputDateArr[i]);
        }
        if (validateDate(intInputDate[0],intInputDate[1],intInputDate[2])) {
            this.day = intInputDate[0];
            this.month = intInputDate[1];
            this.year = intInputDate[2];
            this.inputDate = inputDate;
        } else {
            System.out.println("You are trying to set incorrect date");

        }
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (validateDate(day, this.month, this.year)) {
            this.day = day;
        } else {
            System.out.println("You are trying to set incorrect day of month");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (validateDate(this.day, month, this.year)) {
            this.month = month;
        } else {
            System.out.println("You are trying to set incorrect month");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "CustomDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                ", inputDate='" + inputDate + '\'' +
                '}';
    }
}
