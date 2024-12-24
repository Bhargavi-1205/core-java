package com.xworkz.appname;

import java.util.ArrayList;
import java.util.Collection;

public class Runner2 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("jaanu");
        System.out.println(collection);
        Collection collection1 = new ArrayList<>(4);
        collection1.addAll(collection1);
        collection.removeAll(collection1);
        collection.remove("jaanu");
        collection.clear();
        collection.contains("jaanu");
        collection.containsAll(collection1);
        System.out.println(collection1);

    }
}
