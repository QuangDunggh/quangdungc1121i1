package demoSort;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter min: ");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter max: ");
        int max = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        System.out.println("Mảng trước lúc sử dụng merge sort: ");
        arrRandom(arr, max, min);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, size - 1);
        System.out.println("Mảng sau khi sử dụng merge sort: ");
        System.out.println(Arrays.toString(arr));

    }

    public static void arrRandom(int[] arr, int max, int min) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * (max - min + 1) + min);
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int sizeArr1 = mid - left + 1;
        int sizeArr2 = right - mid;
        int[] newArr1 = new int[sizeArr1];
        int[] newArr2 = new int[sizeArr2];
        for (int i = 0; i < sizeArr1; i++) {
            newArr1[i] = arr[left + i];
        }

        for (int i = 0; i < sizeArr2; i++) {
            newArr2[i] = arr[mid + i + 1];
        }
        int leftIndex = 0;
        int rightIndex = 0;
        for (int i = left; i < right + 1; i++) {
            if (leftIndex < sizeArr1 && rightIndex < sizeArr2) {
                if (newArr1[leftIndex] < newArr2[rightIndex]) {
                    arr[i] = newArr1[leftIndex];
                    leftIndex++;
                } else {
                    arr[i] = newArr2[rightIndex];
                    rightIndex++;
                }
            } else if (leftIndex < sizeArr1) {
                arr[i] = newArr1[leftIndex];
                leftIndex++;
            } else if (rightIndex < sizeArr2) {
                arr[i] = newArr2[rightIndex];
                rightIndex++;
            }
        }

    }
}
