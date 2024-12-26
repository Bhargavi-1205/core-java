class IceCream{

      int id;
	  String brand;
	  String flavours;
	  String type;
	  int quantity;
	  
	  public IceCream(){
		   System.out.println("IceCream constructor is invoked");
	   }
	   public IceCream(int Id, String bName, String fl , String tp , int qt){
	   System.out.println("IceCream constructor is invoked");
	             id       =  Id;
			   brand      =  bName;	 
			   flavours   =  fl;
			   type       =  tp;
			   quantity   =  qt;
			   
			   }
	   
	   
     public void fetchDetails(){
		    System.out.println("The Id of Icecream is"+id);
			System.out.println("The brand of IceCream is"+brand);
			System.out.println("The flavours of Icecream is"+flavours);
			System.out.println("The type of IceCream is "+type);
			System.out.println("The quantity of IceCream is"+quantity);
	 }
}