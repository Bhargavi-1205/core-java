class DrivingLicense{

          Long dlNumber;
		  String name;
		  String dateOfBirth;
		  String validTill;
		  String bloodGroup; 
        
       public DrivingLicense(){
		   System.out.println("DrivingLicense constructor is invoked");
	   }
	   public void fetchDetails(){
	  System.out.println("The Driving License Number is"+dlNumber);
	  System.out.println("The Person name in DL"+name);
	  System.out.println("The date of Birth in DL is"+dateOfBirth);
	  System.out.println("The valid date in DL"+validTill);
	  System.out.println("The bloodGroup in DL"+bloodGroup);


	   }

	   
}