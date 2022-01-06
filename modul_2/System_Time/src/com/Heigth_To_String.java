package com;
import java.util.Scanner;
public class Heigth_To_String {
    public static void main(String[] args) {
        System.out.println("What is number do you want to spell?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Neu so do tu 11 - 19 thi dien vao day: ");
        int tens = scanner.nextInt();
        System.out.println("Hang tram cua so la: ");
        int hu = scanner.nextInt();
        System.out.println("Hang chuc cua so la: ");
        int ty = scanner.nextInt();
        System.out.println("Hang don vi cua so la: ");
        int ones = scanner.nextInt();
        String result = "";
        String resultOnes = "";
        String resultTens = "";
        String resultTy = "";
        String resultHu = "";
        switch (ones) {
            case 0:
                resultOnes = " ";
                break;
            case 1:
                resultOnes = "one";
                break;
            case 2:
                resultOnes = "two";
                break;
            case 3:
                resultOnes = "three";
                break;
            case 4:
                resultOnes = "four";
                break;
            case 5:
                resultOnes = "five";
                break;
            case 6:
                resultOnes ="six";
                break;
            case 7:
                resultOnes ="seven";
                break;
            case 8:
                resultOnes ="eight";
                break;
            case 9:
                resultOnes ="nine";
                break;
            case 10:
                resultOnes ="ten";
                break;
            default:
                resultOnes ="out of ability";
        }
        switch (tens) {
            case 0:
                resultTens = " ";
                break;
            case 11:
                resultTens = "eleven";
                break;
            case 12:
                resultTens = "twelfth";
                break;
            case 13:
                resultTens = "thirteen";
                break;
            case 14:
                resultTens = "fourteen";
                break;
            case 15:
                resultTens = "fifteen";
                break;
            case 16:
                resultTens = "sixteen";
                break;
            case 17:
                resultTens = "seventeen";
                break;
            case 18:
                resultTens = "eighteen";
                break;
            case 19:
                resultTens = "nineteen";
                break;
            default:
                System.out.println("Error number!!!");
        }
        switch (ty) {
            case 0:
                resultTy = "";
                break;
            case 2:
                resultTy = "twenty";
                break;
            case 3:
                resultTy = "thirty";
                break;
            case 4:
                resultTy = "forty";
                break;
            case 5:
                resultTy = "fifty";
                break;
            case 6:
                resultTy = "sixty";
                break;
            case 7:
                resultTy = "seventy";
                break;
            case 8:
                resultTens = "eighty";
                break;
            case 9:
                resultTy = "ninety";
                break;
        }
        switch (hu) {
            case 0:
                resultHu = " ";
                break;
            case 1:
                resultHu = "one hundred";
                break;
            case 2:
                resultHu = "two hundred";
                break;
            case 3:
                resultHu = "three hundred";
                break;
            case 4:
                resultHu = "four hundred";
                break;
            case 5:
                resultHu = "five hundred";
                break;
            case 6:
                resultHu ="six hundred";
                break;
            case 7:
                resultHu ="seven hundred";
                break;
            case 8:
                resultHu ="eight hundred";
                break;
            case 9:
                resultHu ="nine hundred";
                break;
            default:
                resultHu ="out of ability";
                break;
        }

        if (resultHu == " " ) {
            result = resultTy + resultTens + resultOnes;
        } else if (resultTens != " ") {
            result = resultTens;
        } else {

            result = resultHu + " " + "and" + " " + resultTy + resultTens + resultOnes;
        }
        System.out.println("The string is: " + result);

    }
}
