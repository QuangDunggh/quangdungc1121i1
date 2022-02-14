package exceptionAndDebug;

import java.util.Scanner;

public class UseClassNumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter b: ");
        int b = Integer.parseInt(scanner.nextLine());
        calculate(a, b);
    }

    private static void calculate(int a, int b) {
        try {
            int total1 = a + b;
            int total2 = a - b;
            int total3 = a * b;
            int total4 =  (a / b);
            System.out.println("Tổng a và b là: " + total1);
            System.out.println("Hiệu a và b là: " + total2);
            System.out.println("Tích a và b là: " + total3);
            System.out.println("Thương a và b là: " + total4);
        } catch (Exception e) {
//            throw new RuntimeException("Không thể chia hết cho 0");
            System.out.println("Không có phép chia 0");

        }
    }
}
