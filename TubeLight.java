class TubeLight{

    int id;
	String brand;
	double price;
	String voltage;

	  public TubeLight(){
		   System.out.println("TubeLight constructor is invoked");
	   }
	   public void getDetails(){
		 System.out.println("The TubeLight id is"+id);
		 System.out.println("The TubeLight brand is"+brand);
		 System.out.println("The TubeLight price is"+price);
		 System.out.println("The TubeLight voltage is"+voltage);
	   }

}