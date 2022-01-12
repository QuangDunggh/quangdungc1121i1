//package com.ClassAndOOps;
//
//import java.util.Arrays;
//
//public class StopWatch2 {
//    private long start;
//    private long end;
//    public StopWatch2() {}
//
//    public void setStart() {
//        this.start = System.currentTimeMillis();
//    }
//
//    public void setEnd() {
//        this.end = System.currentTimeMillis();
//    }
//
//    public long elapsedTime() {
//        return this.end - this.start;
//    }
//
//    public int[] arrayRandom(int size ) {
//        int min = 20;
//        int max = 20000;
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = (int) (Math.random() * (max - min + 1) + min);
//        }
//        return arr;
//    }
//
//    public void sortArray(int[] arr) {
//        int size = arr.length;
//        for (int i = 0; i < size - 1; i++) {
//            int minArray = arr[i];
//            int index = 0;
//            boolean check = false;
//            for (int j = i; j < size; j++) {
//                if(minArray > arr[j]) {
//                    index = j;
//                    minArray = arr[j];
//                    check = true;
//                }
//            }
//            if(check){
//                arr[index] = arr[i];
//                arr[i] = minArray;
//            }
//
//        }
//    }
//
//    public static void main(String[] args) {
//////        int[] array = {8,5,6,1,2,3,7,9};
////        System.out.println(Arrays.toString(array));
//        StopWatch2 stopwatch = new StopWatch2();
//        int[] array = stopwatch.arrayRandom(10000);
//        stopwatch.setStart();
//        System.out.println("Day la mang chua sort: ");
//        System.out.println(Arrays.toString(array));
//        System.out.println("Day la mang sort roi: ");
//        stopwatch.sortArray(array);
//        System.out.println(Arrays.toString(array));
//        stopwatch.setEnd();
//        System.out.println("Thoi gian chay: " + stopwatch.elapsedTime());
//
//
//    }
//}
