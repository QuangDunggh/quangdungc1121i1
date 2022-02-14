package exceptionAndDebug;

import java.util.Arrays;
import java.util.Scanner;

public class UseClassArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the min: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter the max: ");
        int max = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
        System.out.println(Arrays.toString(arr));


        System.out.print("Enter the Index you want find: ");
        int index = Integer.parseInt(scanner.nextLine());
        try {
            System.out.println("Element of index you want find is: " + arr[index]);
        } catch (Exception indexOutOfBoundsException) {
            System.out.println("The Index is not exist");
        }


    }
}
