package com.xworkz.netflixapp.movies;

public class UserRunner {

    public static void main(String[] args) {
        System.out.println("main started");
        User user = new User();
        user.userId = 1;
        Object obj[] = {234 , user ,"jaan"};
        System.out.println(obj[0]+" "+obj[1]+" "+obj[2]);
        System.out.println("main ended");
    }
}
