package com.xworkz.hotelapp.hotel;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        System.out.println("The hotel name is ");
        String hotelName = scanner.next();
        hotel.setHotelName(hotelName);
        System.out.println("The hotel address is ");
        String hotelAddress = scanner.next();
        hotel.setAddress(hotelAddress);
        System.out.println("The no of waiters in hotel ");
        int noOfWaiters = scanner.nextInt();
        hotel.setNoOfWaiters(noOfWaiters);
        System.out.println("The contact number of hotel is ");
        long contactNo = scanner.nextLong();
        hotel.setContactNo(contactNo);
        System.out.println(hotel);
    }
}
