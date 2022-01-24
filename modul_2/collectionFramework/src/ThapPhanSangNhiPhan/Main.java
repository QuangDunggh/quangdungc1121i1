package ThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        int num2 = 0;
        do {
            num2 = num % 2;
            stack.push(num2);
            num = num / 2;
        }
        while (num != 0);
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
