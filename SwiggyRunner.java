class SwiggyRunner{
    
	public static void main(String[] args){
	   
     String foodName = "pizza";
	 double priceWithQuantity = Swiggy.search(foodName,3);
	 System.out.println("The price of"+foodName+" is "+priceWithQuantity);
		}
		}