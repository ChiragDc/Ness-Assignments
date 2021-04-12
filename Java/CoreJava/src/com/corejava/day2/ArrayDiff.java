package com.corejava.day2;

import java.util.Scanner;

public class ArrayDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("ent the length of array");
        int size = s.nextInt();
        int[] arr = new int[size];
        System.out.println("ent " + size + " elements");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int max = 0;
        int min = 0;
        int ele1 = 0;
        int ele2 = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    continue;
                if ((Math.abs(max)) < arr[i] - arr[j]) {
                    max = arr[i] - arr[j];
                    ele1 = arr[i];
                    ele2 = arr[j];
                }

            }
        }
        System.out.println(ele1 + " " + ele2 + " diff=" + Math.abs(max));

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j)
                    continue;
                if ((Math.abs(min)) > arr[i] - arr[j]) {
                    min = arr[i] - arr[j];
                    ele1 = arr[i];
                    ele2 = arr[j];
                }

            }
        }
        System.out.println(ele1 + " " + ele2 + " diff=" + Math.abs(min));
    }
}
