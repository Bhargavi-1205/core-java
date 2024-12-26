class TrainTicket{
             
			 Long pnrNumber;
			 int age;
			 String gender;
			 String name;
            public TrainTicket(){
		   System.out.println("TrainTicket constructor is invoked");
	   }
	      public void showDetails(){
			System.out.println("The pnr number of train ticket is"+pnrNumber);
		   System.out.println("The age in train ticket is"+age);
		   System.out.println("The gender in train ticket is"+gender);
		   System.out.println("The name in trai ticket is "+name);  
			  
			  
		  }
}