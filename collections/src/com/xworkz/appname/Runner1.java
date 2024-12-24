package com.xworkz.appname;

import java.util.ArrayList;
import java.util.Collection;

public class Runner1 {
    public static void main(String[] args) {
        Collection collection = new ArrayList<Long>();
        collection.add(345678);
        collection.addAll(collection);
        collection.remove(23456);
        collection.removeAll(collection);
        collection.contains(34567);
        collection.containsAll(collection);
        collection.clear();
        collection.size();
        System.out.println(collection);
    }
}
