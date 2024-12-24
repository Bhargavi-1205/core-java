package com.xworkz.bankapp.bankaccount;

public class BankAccount {

    private int bankId;
    private String bankName;
    private String bankAddress;

    public BankAccount(){
        System.out.println("Bankaccount cons is invoked");
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    public String getBankAddress() {
        return bankAddress;
    }
//    @Override
//    public int hashcode(){
//        return this.bankId;
//    }

  public String toString(){
       return"account-(bankId ="+this.bankId+","+
               "bankName ="+this.bankName+","+
               "bankAddress ="+this.bankAddress+")";

  }
//    @Override
//    public int hashCode(){
//        return this.bankId;
//    }
//    @Override
//    public boolean equals(Object obj){
//        BankAccount bankAccount = (BankAccount)obj;
//        if (this.bankId == bankAccount.bankId && this.bankName == bankAccount.bankName && this.bankAddress == bankAccount.bankAddress)
//            return true;
//
//            return false;
//    }


}

