class BankNamesRunner{
              public static void main(String[] banks){
			 System.out.println("main started");
		      boolean isAccountNameAdded = BankNames.addAccountName("Karnataka Gramina Bank");
			  System.out.println("is BankNames added :"+isAccountNameAdded);
			  isAccountNameAdded = BankNames.addAccountName("SBI Bank");
			  System.out.println("is BankNames added :"+isAccountNameAdded);
			  isAccountNameAdded = BankNames.addAccountName("Kotak Mahindra Bank");
			  System.out.println("is BankNames added :"+isAccountNameAdded);
			  isAccountNameAdded = BankNames.addAccountName("Canara Bank");
			  System.out.println("is BankNames added :"+isAccountNameAdded);
			  isAccountNameAdded = BankNames.addAccountName("Yes Bank");
			  System.out.println("is BankNames added :"+isAccountNameAdded);
			  BankNames.getAccountName();
			  BankNames.updateAccountNameByName("ICIC bank" , "Yes Bank");
			   BankNames.getAccountName();
			   BankNames.deleteAccountNameByName("Canara Bank");
			   BankNames.getAccountName();
			    System.out.println("main ended");
     }
   }