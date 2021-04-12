package com.corejava.day2;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> SaberClass = new LinkedList<>();
        SaberClass.add("Arthur");
        SaberClass.add("Artoria");
        SaberClass.add("Mordred");


        Iterator<String> iterator = SaberClass.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        SaberClass.addFirst("Gawain");
        SaberClass.addLast("Lancelot");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        SaberClass.removeFirst();
        SaberClass.removeLast();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
