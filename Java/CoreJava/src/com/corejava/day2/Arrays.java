package com.corejava.day2;

public class Arrays {
    public static void main(String[] args) {
        int array[];
        int arr[]={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for(int nos:arr){
            System.out.print(nos+" ");
        }


    }
}
