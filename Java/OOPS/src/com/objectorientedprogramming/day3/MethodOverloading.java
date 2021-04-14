package com.objectorientedprogramming.day3;
class Mobile{


    public void itemInfo(int id,String brand){
        System.out.println("Item Details:"+id+" "+brand);
    }
    public void itemInfo(int price,int ram){
        System.out.println("Item specs:"+price+" "+ram);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Mobile m1=new Mobile();
        m1.itemInfo(101,"Moto");
        m1.itemInfo(16000,8);
    }
}
