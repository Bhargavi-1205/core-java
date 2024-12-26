class Library{

      int libraryId;
	  String address;
	  String type;
	  String OwnerName;
	  
	  public Library(){
		   System.out.println("Library constructor is invoked");
	   }
	   public void getDetails(){
		 System.out.println("The Library id is "+libraryId);
		 System.out.println("The address is"+address);
		 System.out.println("The type of library is"+type);
		 System.out.println("The library owner name is"+OwnerName);
		   
	   }


}