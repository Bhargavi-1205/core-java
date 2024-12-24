package com.xworkz.bookapp;

public class Runner2 {
    public static void main(String[] args) {
        Object[] object1 = new Object[2];
      object1[0] ="";
      object1[1] ="";
      Object[] object2 = new  Object[2];
      object2[0] = object1;

      for(Object[] o : object2){
          for (Object value : o){
              System.out.println(value);
          }
      }
    }
}
//ClassCastException