//package com.ClassAndOOps;
//
//import javafx.scene.paint.Stop;
//
//public class StopWatch {
//    private long starTime;
//    private long endTime;
//
//    public StopWatch() {
//    }
//
//    public void start() {
//        this.starTime = System.currentTimeMillis();
//    }
//    public void end() {
//        this.endTime = System.currentTimeMillis();
//    }
//    public long getElapsedTime() {
//         long result = this.endTime - this.starTime;
//         return result;
//    }
//    public int[] getArray(int size) {
//        int[] array = new int[size];
//        int min = 20;
//        int max = 20000;
//        for (int i = 0; i < size; i++) {
//            array[i] = (int) (Math.random()*(max - min + 1) + min);
//        }
//        return array;
//    }
//    public void sortArray(int[] arr) {
//        int size = arr.length;
//        for (int i = 0; i < size - 1; i++) {
//            int temp = arr[i];
//            int index = 0;
//            int check = -1;
//            for (int j = i; j < size; j++) {
//                if (temp > arr[j]) {
//                    index = j;
//                    temp = arr[j];
//                    check = 1;
//                }
//            }
//            if (check == 1) {
//                arr[index] = arr[i];
//                arr[i] = temp;
//            }
//
//
//        }
//    }
//}
