class PanCard{
    
	    Long panNumber;
		String name;
        String fatherName;
        String dateOfBrith;
		
		public PanCard(){
		   System.out.println("PanCard constructor is invoked");
	   }
	   public void getDetails(){
		   System.out.println("The Pancard number is "+panNumber);
		   System.out.println("The name in Pancard is"+name);
		   System.out.println("The Father name in Pancard is "+fatherName);
		   System.out.println("The date of Birth in Pancard is"+dateOfBrith);
	   }
	}