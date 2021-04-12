package com.corejava.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Members{
    int gen;
    String name;
    String subs;

    public Members(int gen, String name, String subs) {
        this.gen = gen;
        this.name = name;
        this.subs = subs;
    }
}

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> gen = new ArrayList<>();
        gen.add(1);
        gen.add(3);
        gen.add(2);
        gen.add(4);
        gen.add(5);
        for (int i : gen)
            System.out.print(i);
        System.out.println();
        for (int i = 0; i < gen.size(); i++)
            System.out.print(gen.get(i));
        System.out.println();
        gen.set(0, 0);
        gen.add(1, 1);
        Collections.sort(gen);
        Collections.reverse(gen);
        Iterator it = gen.iterator();
        while (it.hasNext())
            System.out.print(it.next());
        System.out.println();

        Members m1 =new Members(5,"Nene","500k");
        Members m2 =new Members(1,"Fubuki","1.2M");
        Members m3 =new Members(1,"Haato","1.1M");
        ArrayList<Members> hl =new ArrayList<>();
        hl.add(m1);
        hl.add(m2);
        hl.add(m3);
        for (Members m:hl){
            System.out.println(m.gen+" "+m.name+" "+m.subs);
        }
        System.out.println(hl.size());
        System.out.println(hl.isEmpty());
        System.out.println(hl.contains(m1));
    }
}
