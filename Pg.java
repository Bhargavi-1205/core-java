class Pg{

     String pgOwner;
	 int rent;
	 int noofFloors;
	 String address;

      public Pg(){
		   System.out.println("Pg constructor is invoked");
	   }
	   public void getDetails(){
	  System.out.println("The Pg owner name is"+pgOwner);
	  System.out.println("The rent of Pg is"+rent);
	  System.out.println("Total no of floor in Pg is"+noofFloors);
	  System.out.println("The address of PG is"+address);
	   }

}