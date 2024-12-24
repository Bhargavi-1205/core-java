package com.xworkz.appname;

import java.util.ArrayList;
import java.util.Collection;

public class Runner3 {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        collection1.add(234);
        collection1.add(456);
        collection1.add(567);
        collection1.add(568);
        collection1.add(98);

        collection1.addAll(collection1);
       // collection1.clear();
        //collection1.removeAll(collection1);
        collection1.remove(98);
        System.out.println(collection1);

    }
}
