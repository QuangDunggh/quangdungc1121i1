package ThapPhanSangNhiPhan;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        System.out.print("Nhap vao so nhi phan: ");
        String nhiphan = scanner.nextLine();
        char[] arr = nhiphan.toCharArray();
        for (int i = 0; i < arr.length;i++) {
            stack.push(arr[i]);
        }
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(String.valueOf(stack.pop()));
            if (num == 1) {
                result += Math.pow(2.0, i);
            }
        }
        System.out.println("Đổi sang số thập phân là: " + result);

    }
}
