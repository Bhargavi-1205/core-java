class TubeLight{

    int id;
	String brand;
	double price;
	String voltage;

	  public TubeLight(){
	  this(1, "focus light");
			System.out.println("no arg constructor is invoked");
		   
	   }
	   public TubeLight(int id ,  String brand){
	   this(100.00 , "Lighting");
			System.out.println("2 arg i.e(int , String) constructor is invoked");
	           this.id   =   id;
			   this.brand = brand;
			 } 
			 
			  
        public TubeLight( double price, String voltage){
		    this.price      =  price;
		    this.voltage    =  voltage;
			     }
		public void light(){
				 
				 }
	   
	   public void getDetails(){
		 System.out.println("The TubeLight id is "+id);
		 System.out.println("The TubeLight brand is "+brand);
		 System.out.println("The TubeLight price is "+price);
		 System.out.println("The TubeLight voltage is "+voltage);
	   }

}