package com.xworkz.railapp.train;

import java.util.Scanner;

public class TrainRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Train train = new Train();
        System.out.println("The Train id is ");
        int trainId = scanner.nextInt();
        train.setTrainId(trainId);
        System.out.println("The train name is ");
        String trainName = scanner.next();
        train.setTrainName(trainName);
        System.out.println("The train source is ");
        String trainSource = scanner.next();
        train.setTrainSource(trainSource);
        System.out.println("The train destination is ");
        String trainDestination =scanner.next();
        train.setTrainDestination(trainDestination);
        System.out.println(train);
    }
}
