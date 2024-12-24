package com.xworkz.bankapp.bankaccount;

import java.util.Scanner;

public class BankRunner {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount();
//        System.out.println(bankAccount);
//        bankAccount.setBankId(1);
//        bankAccount.setBankName("yes bank");
//        bankAccount.setBankAddress("Chintamani");
//        System.out.println(bankAccount.hashCode());
//
//        BankAccount bankAccount1 = new BankAccount();
//        System.out.println(bankAccount1);
//        bankAccount1.setBankId(1);
//        bankAccount1.setBankName("yes bank");
//        bankAccount1.setBankAddress("Chintamani");
//        System.out.println(bankAccount1.hashCode());
//
//       // boolean same = bankAccount.equals(bankAccount1);
//      //  System.out.println(same);
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();
        System.out.println("The bank id is ");
        int bankId = scanner.nextInt();
        bankAccount.setBankId(bankId);
        System.out.println("The bank Name is ");
        String bankName = scanner.next();
        bankAccount.setBankName(bankName);
        System.out.println("The bank address is ");
        String bankAddress = scanner.next();
        bankAccount.setBankAddress(bankAddress);
        System.out.println(bankAccount);
    }
}
