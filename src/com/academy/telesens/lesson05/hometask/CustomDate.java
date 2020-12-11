package com.academy.telesens.lesson05.hometask;

public class CustomDate {

    private int day;
    private int month;
    private int year;

    public String getFormattedDate(int day, int month, int year) {
        String formattedDate = day + "." + month + "." + year;
        return formattedDate;
    }

    public CustomDate() {
    }

    static boolean validateDay(int day, int month, int year) {
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

    public CustomDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
