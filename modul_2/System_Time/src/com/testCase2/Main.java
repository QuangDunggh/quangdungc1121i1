package com.testCase2;

import java.util.Scanner;

public class Main {

    public static final String NOTHISDAY = "Không có ngày này";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the day: ");
        int day = Integer.parseInt(input.nextLine());
        System.out.print("Enter the month: ");
        int month = Integer.parseInt(input.nextLine());
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(input.nextLine());
        NextDayCalculatorTest date = new NextDayCalculatorTest(day, month, year);
        System.out.println("Now day: " + date);
        NextDayCalculatorTest nextDay = nextDay(date);
        System.out.println("Next day: " + nextDay);

    }

    public static NextDayCalculatorTest nextDay(NextDayCalculatorTest date) {
        NextDayCalculatorTest newDate = new NextDayCalculatorTest();
        int month = date.getMonth();
        int year = date.getYear();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (date.getDate() < 31) {
                    setDayWithoutMonth(date, newDate, month, year);
                } else if (date.getDate() == 31) {
                    setYear(newDate, month, year);
                } else {
                    System.out.println(NOTHISDAY);
                    return null;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (date.getDate() < 30) {
                    setDayWithoutMonth(date, newDate, month, year);
                } else if (date.getDate() == 30) {
                    setDayWithMonth(newDate, month, year);
                } else {
                    System.out.println(NOTHISDAY);
                    return null;
                }
                break;
            case 2:
                if (isLeapYear2(year)) {
                    if (date.getDate() < 29) {
                        setDayWithoutMonth(date, newDate, month, year);
                    } else if (date.getDate() == 29) {
                        setDayWithMonth(newDate, month, year);
                    } else {
                        System.out.println(NOTHISDAY);
                    }
                } else if (isLeapYear1(year)) {
                    if (date.getDate() < 29) {
                        setDayWithoutMonth(date, newDate, month, year);
                    } else if (date.getDate() == 29) {
                        setDayWithMonth(newDate, month, year);
                    } else {
                        System.out.println(NOTHISDAY);
                        return null;
                    }
                } else {
                    if (date.getDate() < 28) {
                        setDayWithoutMonth(date, newDate, month, year);
                    } else if (date.getDate() == 28) {
                        setDayWithMonth(newDate, month, year);
                    } else {
                        System.out.println(NOTHISDAY);
                        return null;
                    }
                    break;
                }
        }
        return newDate;
    }

    private static boolean isLeapYear2(int year) {
        return year % 400 == 0 && year > 0;
    }

    private static boolean isLeapYear1(int year) {
        return year % 100 != 0 && year > 0 && year % 4 == 0;
    }

    private static void setYear(NextDayCalculatorTest newDate, int month, int year) {
        newDate.setDate(1);
        if (month < 12) {
            newDate.setMonth(month + 1);
            newDate.setYear(year);
        } else if (month == 12) {
            newDate.setMonth(1);
            newDate.setYear(year + 1);
        }
    }

    private static void setDayWithMonth(NextDayCalculatorTest newDate, int month, int year) {
        newDate.setDate(1);
        newDate.setMonth(month + 1);
        newDate.setYear(year);
    }

    private static void setDayWithoutMonth(NextDayCalculatorTest date, NextDayCalculatorTest newDate, int month, int year) {
        newDate.setDate(date.getDate() + 1);
        newDate.setMonth(month);
        newDate.setYear(year);
    }
}
