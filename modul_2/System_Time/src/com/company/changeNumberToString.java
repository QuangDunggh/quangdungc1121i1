//package com.company;
//
//import java.util.Scanner;
//
//public class changeNumberToString {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int number = scanner.nextInt();
//        String result = " ";
//        String tens = " ";
//        String ones = " ";
//        String huns = " ";
//        if (number <= 10 && number > 0) {
//            switch (number) {
//                case 1:
//                    result = "one";
//                    break;
//                case 2:
//                    result = "two";
//                    break;
//                case 3:
//                    result = "three";
//                    break;
//                case 4:
//                    result = "four";
//                    break;
//                case 5:
//                    result = "five";
//                    break;
//                case 6:
//                    result = "six";
//                    break;
//                case 7:
//                    result = "seven";
//                    break;
//                case 8:
//                    result = "eight";
//                    break;
//                case 9:
//                    result = "nine";
//                    break;
//                case 10:
//                    result = "ten";
//                    break;
//            }
//            System.out.println(result);
//        } else if (number > 10 && number < 20) {
//            switch (number) {
//                case 11:
//                    result = "eleven";
//                    break;
//                case 12:
//                    result = "twelfth";
//                    break;
//                case 13:
//                    result = "thirteen";
//                    break;
//                case 14:
//                    result = "fourteen";
//                    break;
//                case 15:
//                    result = "fifteen";
//                    break;
//                case 16:
//                    result = "sixteen";
//                    break;
//                case 17:
//                    result = "seventeen";
//                    break;
//                case 18:
//                    result = "eighteen";
//                    break;
//                case 19:
//                    result = "nineteen";
//                    break;
//            }
//        System.out.println(result);
//        }
//        if (number >= 20 && number < 100) {
//            switch (number / 10) {
//                case 2:
//                    tens = "twenty";
//                    break;
//                case 3:
//                    tens = "thirty";
//                    break;
//                case 4:
//                    tens = "forty";
//                    break;
//                case 5:
//                    tens = "fifty";
//                    break;
//                case 6:
//                    tens = "sixty";
//                    break;
//                case 7:
//                    tens = "seventy";
//                    break;
//                case 8:
//                    tens = "eighty";
//                    break;
//                case 9:
//                    tens = "ninety";
//                    break;
//
//            }
//            switch (number % 10) {
//                case 1:
//                    ones = "one";
//                    break;
//                case 2:
//                    ones = "two";
//                    break;
//                case 3:
//                    ones = "three";
//                    break;
//                case 4:
//                    ones = "four";
//                    break;
//                case 5:
//                    ones = "five";
//                    break;
//                case 6:
//                    ones = "six";
//                    break;
//                case 7:
//                    ones = "seven";
//                    break;
//                case 8:
//                    ones = "eight";
//                    break;
//                case 9:
//                    ones = "nine";
//                    break;
//            }
//            result = tens + " " + ones;
//            System.out.println("The number is: " + result);
//        } else if (number >= 100 && number < 1000) {
//            switch ((number % 100) / 10 ) {
//                case 2:
//                    tens = "twenty";
//                    break;
//                case 3:
//                    tens = "thirty";
//                    break;
//                case 4:
//                    tens = "forty";
//                    break;
//                case 5:
//                    tens = "fifty";
//                    break;
//                case 6:
//                    tens = "sixty";
//                    break;
//                case 7:
//                    tens = "seventy";
//                    break;
//                case 8:
//                    tens = "eighty";
//                    break;
//                case 9:
//                    tens = "ninety";
//                    break;
//
//            }
//            switch (number % 10) {
//                case 1:
//                    ones = "one";
//                    break;
//                case 2:
//                    ones = "two";
//                    break;
//                case 3:
//                    ones = "three";
//                    break;
//                case 4:
//                    ones = "four";
//                    break;
//                case 5:
//                    ones = "five";
//                    break;
//                case 6:
//                    ones = "six";
//                    break;
//                case 7:
//                    ones = "seven";
//                    break;
//                case 8:
//                    ones = "eight";
//                    break;
//                case 9:
//                    ones = "nine";
//                    break;
//            }
//        } switch (number / 100) {
//            case 1:
//                huns = "one hundred";
//                break;
//            case 2:
//                huns = "two hundred";
//                break;
//            case 3:
//                huns = "three hundred";
//                break;
//            case 4:
//                huns = "four hundred";
//                break;
//            case 5:
//                huns = "five hundred";
//                break;
//            case 6:
//                huns = "six hundred";
//                break;
//            case 7:
//                huns = "seven hundred";
//                break;
//            case 8:
//                huns = "eight hundred";
//                break;
//            case 9:
//                huns = "nine hundred";
//                break;
//        }
//        result = huns + " and " + tens + " "  + ones;
//        System.out.println("The number is: " + result);
//        }
//
//}
