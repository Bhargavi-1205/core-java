class Train{

       Long trainNumber;
	   int totalCoaches;
	   String trainName;
	   
	   public  Train(){
		   System.out.println(" Train constructor is invoked");
	   }
	   public void getDetails(){
		   
		   System.out.println("The trainNumber of train is"+trainNumber);
			System.out.println("Total no of coaches in train is"+totalCoaches);
			System.out.println("The name of train"+trainName);
	   }
}