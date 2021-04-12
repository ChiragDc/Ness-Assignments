package com.corejava.day2;


import java.util.Scanner;

public class ReversingArray {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int[] arr =new int[3];
       int[] arr2 = new int[arr.length];
       for(int i=0;i< arr.length;i++){
           System.out.println("Enter a number:");
           arr[i]=s.nextInt();
       }
        System.out.println("Reversed array:");
       for (int i=arr.length-1;i>=0;i--){

               arr2[arr.length-1-i]=arr[i];
       }
       for(int no:arr2){
           System.out.print(no+" ");
       }
    }
}
