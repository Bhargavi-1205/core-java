class ElectricityBill{
            
			long rrNumber;
			int accountId;
			String address;
			
			public ElectricityBill(){
		     System.out.println("ElectricityBill constructor is invoked");
	   }
	        public void fetchDetails(){
		    System.out.println("The RR number of ElectricityBill is"+rrNumber);
		    System.out.println("The accountId of ElectricityBill is"+accountId);
		   System.out.println("The address in ElectricityBill is"+address);
			}
	
	
	}