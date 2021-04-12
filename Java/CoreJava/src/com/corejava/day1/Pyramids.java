package com.corejava.day1;

public class Pyramids {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
        System.out.println("----------------");
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("* ");

            }
            System.out.println();
        }
//        System.out.println("----------------");
//
//        for (int i=0;i<5;i++){
//            for(int j=0;j<5-i-1;j++){
//                System.out.print(" ");
//            }
//            for(int k=0;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        System.out.println("----------------");
       for (int i=0;i<=5;i++){
           for(int j=5;j>i;j--){
               System.out.print("");
           }
           for (int k=1;k<=i;k++){
               System.out.print("* ");
           }
           System.out.println();
       }
        System.out.println("----------------");
        for (int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            for (int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("----------------");
        for (int i=0;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------------");

//        for (int i=0;i<=5;i++){
//            for(int j=5;j>i;j--){
//                System.out.print("");
//            }
//            for (int k=1;k<=i;k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println("----------------");
    }
}
