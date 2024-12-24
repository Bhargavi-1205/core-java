package com.xworkz.libapp.Book;

public class StringRunner {
    public static void main(String[] args) {
          String str="jaanu";//reach to SCP
          String str1="jaanu";

          boolean same= str == str1;//reach to instance memory
          System.out.println("Is str and str1 are equal: "+same);

        String st = new String("raja");
        String st1 = new String("Raja");//== compare references
        System.out.println("Is st and st1 are equal: "+st.equals(st1));

       // Integer str;
     //   str = 2;
      //  Integer str1 = new Integer(2);
     //   System.out.println();

        String str2 = "Raja";
        str2 ="singh";
        str2 = "bhargavi";
        System.out.println(str2);


    }
}
