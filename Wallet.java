class Wallet{

    int id;
	String brand;
	int noofCompartments;
	String color;
	
	public Wallet(){
		   System.out.println("Wallet constructor is invoked");
	   }
	public void showDetails(){
		System.out.println("The Wallet id is"+id);
		System.out.println("The Wallet brand is"+brand);
		System.out.println("The Wallet has noOfCompartments are"+noofCompartments);
		System.out.println("The Wallet color is"+color);
		
		
	}

}