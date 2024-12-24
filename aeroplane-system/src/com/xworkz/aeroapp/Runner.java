package com.xworkz.aeroapp;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aeroplane aeroplane = new Aeroplane();
        System.out.println("The flight id is ");
        int flightId = scanner.nextInt();
        aeroplane.setFlightId(flightId);
        System.out.println("The flight name is ");
        String flightName = scanner.next();
        aeroplane.setFlightName(flightName);
        System.out.println("The flight source is ");
        String flightSource = scanner.next();
        aeroplane.setFlightSource(flightSource);
        System.out.println("The flight destination is ");
        String flightDestination = scanner.next();
        aeroplane.setFlightDestination(flightDestination);
        System.out.println(aeroplane);
    }
}
