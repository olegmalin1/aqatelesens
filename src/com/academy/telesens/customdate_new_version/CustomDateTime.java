package com.academy.telesens.customdate_new_version;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CustomDateTime extends CustomDate {
    private int hour;
    private int minute;
    private int second;
    private String inputDateTime;

    @Override
    public String getFormattedDate() {
        if (validateTime(hour, minute, second)) {
            LocalDateTime localDateTime = LocalDateTime.of(getYear(), getMonth(), getDay(), hour, minute, second);
            String formattedDate = localDateTime.format(DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE HH:mm:ss"));
            return formattedDate;
        } else {
            String errorMessage = "You entered incorrect time";
            return errorMessage;
        }
    }

    public static boolean validateTime(int hour, int minute, int second) {
        if (hour > 23 || hour < 0) {
            return false;
        }

        if (minute > 59 || minute < 0) {
            return false;
        }
        if (second > 59 || second < 0) {
            return false;
        }

        return true;
    }

//Constructors

    public CustomDateTime(String inputDate, String inputDateTime) {
        super(inputDate);
        this.inputDateTime = inputDateTime;
    }

    public CustomDateTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }

    public CustomDateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public CustomDateTime(String inputDateTime) {
        String strInputDateTimeArr[] = inputDateTime.split(" ");
        int intInputDateTime[] =new int[strInputDateTimeArr.length];
        for (int i=0; i < strInputDateTimeArr.length; i++) {
            intInputDateTime[i] = Integer.parseInt(strInputDateTimeArr[i]);
        }
            if (validateTime(intInputDateTime[3], intInputDateTime[4], intInputDateTime[5])) {
                this.setDay(intInputDateTime[0]);
                this.setMonth(intInputDateTime[1]);
                this.setYear(intInputDateTime[2]);
                this.hour = intInputDateTime[3];
                this.minute = intInputDateTime[4];
                this.second = intInputDateTime[5];
            } else {
                System.out.println("You are trying to set incorrect time");
            }
        }


//Setters & Getters

    public String getInputDateTime() {
        return inputDateTime;
    }

    public void setInputDateTime(String inputDateTime) {
        String strInputDateTimeArr[] = inputDateTime.split(" ");
        int intInputDateTime[] =new int[strInputDateTimeArr.length];
        for (int i=0; i < strInputDateTimeArr.length; i++) {
            intInputDateTime[i] = Integer.parseInt(strInputDateTimeArr[i]);
        }
            if (validateTime(intInputDateTime[3], intInputDateTime[4], intInputDateTime[5])) {
                this.setDay(intInputDateTime[0]);
                this.setMonth(intInputDateTime[1]);
                this.setYear(intInputDateTime[2]);
                this.hour = intInputDateTime[3];
                this.minute = intInputDateTime[4];
                this.second = intInputDateTime[5];
            } else {
                System.out.println("You are trying to set incorrect time");
            }
        }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
