package com.corejava.day1;

public class TrialOne {
    public static void main(String[] args) {
//        int a =7;
//        System.out.println(a++);
//        System.out.println(a--);
//        System.out.println(--a);
//        System.out.println(++a);
//
//        int b=10;
//        System.out.println((a>b)?"a is greater":"b is greater");

        int x=0,y=0;
        for(x=0;x<=1;x++){
            for(y=0;y<=1;y++){
                System.out.println(x | y);
            }
        }
    }
}
