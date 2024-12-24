package com.xworkz.bookapp;

import java.util.ArrayList;
import java.util.Collection;

public class Runner1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Jaanu");
        collection.add(1);

        Collection collection1 = new ArrayList();
        collection1.add("Pavi");
        collection1.add(2);
       // collection.add("Jyoo");
       // collection.add(3);

        //collection.clear();
        //collection.removeAll(collection);
        collection.addAll(collection1);
        System.out.println(collection);

    }
}
