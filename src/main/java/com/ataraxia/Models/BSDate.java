package com.ataraxia.Models;

public class BSDate {
    private final int year;
    private final int month;
    private final int day;

    public BSDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return year + "-" + String.format("%02d", month) + "-" + String.format("%02d", day);
    }
}