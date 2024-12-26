class IceCream1{

      int id;
	  String brand;
	  String flavours;
	  String type;
	  int quantity;
	  
	  public IceCream1(){
	       this(1, "Cone");
		   System.out.println("no arg constructor is invoked");
	   }
	   
	   public IceCream1(int id ,  String brand ){
	   this(100, "Eating");
	   System.out.println("2 arg i.e(int , String) constructor is invoked");
	             this.id       =  id;
			   this.brand      =  brand;	 
			   
			   }
	    public IceCream1(String flavours , String type , int quantity){
		System.out.println("2 arg i.e(double ,String) constructor is invoked");
		      this.flavours   =  flavours;
			  this.type       =  type;
			   this.quantity   =  quantity;
		}
		public void Eat(){
		
		}
	   
	   
     public void fetchDetails(){
		    System.out.println("The Id of Icecream is"+id);
			System.out.println("The brand of IceCream is"+brand);
			System.out.println("The flavours of Icecream is"+flavours);
			System.out.println("The type of IceCream is "+type);
			System.out.println("The quantity of IceCream is"+quantity);
	 }
}