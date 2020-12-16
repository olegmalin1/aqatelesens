package com.academy.telesens.lesson06.hometask;

public class CustomDateTime extends CustomDate {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    @Override
    public String getFormattedDate() {
        if ((CustomDate.validateDay(this.getDay(), this.getMonth(), this.getYear())) && (validateTime(this.hour, this.minute, this.second))) {
            return String.format("You entered: %02d.%02d.%d %02d:%02d:%02d", getDay(), getMonth(), getYear(), hour, minute, second);
        } return String.format("Entered date or time is incorrect: %02d.%02d.%d %02d:%02d:%02d", getDay(), getMonth(), getYear(), hour, minute, second);
    }

//*******
    //Constructors
    //*******

    public CustomDateTime() {
    }

    public CustomDateTime(int day, int month, int year, int hour, int minute, int second) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
        this.second = second;
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

    //*******
    //Getters & Setters
    //*******


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
