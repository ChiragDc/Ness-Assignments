package com.corejava.day2;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int arr[] = {324, 243, 321, 541, 234, 111};
        int min = arr[0], max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        System.out.println("smallest= " + min);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("largest= " + max);
    }
}
