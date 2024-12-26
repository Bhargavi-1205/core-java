class Pen{
       
	   String brandName;
	   double price;
	   String color;
	   String material;
	   String type;
	   
	   public Pen(){
		   System.out.println("Pen constructor is invoked");
	   }
	   public Pen(String bName , double p , String tp , String clr , String mt){
	   System.out.println("Pen constructor is invoked");
	           brandName  =  bName;
			   price      =  p;
			   type       =  tp;
			   color      =  clr;
			   material   =  mt;
	   
	   }
	   
	   public void displayDetails(){
		   
		   System.out.println("The pen brandname is"+brandName);
		   System.out.println("The pen price is"+price);
		   System.out.println("The pen color is"+color);
		   System.out.println("The pen material"+material);
		   System.out.println("The pen type is"+type);
	   }
	   
	   


}
			