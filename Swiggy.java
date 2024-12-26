class Swiggy{
    
	//public static void main(String[] args){
	   
//     double price =	 search("pizza");
	// System.out.println("The price of pizza is "+price);
//		}
		
		public static double search (String foodName , int Quantity){
		
		if(foodName == "pizza"){
		     return 99.99;
			 }
		if(foodName == "Burger"){
			return 120.99;
		}
		if(foodName == "French Fries"){
			return 90.00;
		}
		if(foodName == "Pav Bhaji"){
			return 159.00;
		}
		if(foodName == "vada pav"){
			return 79.00;
		}
		if(foodName == "Sandwich"){
			return 209.54;
		}
		if(foodName == "Bhel Puri"){
			return 104.76;
		}
		if(foodName == "Bus Maska"){
			return 89.00;
		}
		if(foodName == "IdlyVada"){
			return 95.00;
		}
		if (foodName == "panipuri"){
			return 70.00;
		}
		if(foodName == "Dahi chaat"){
			return 278.89;
		}
	    if(foodName == "Crazy chat"){
			return 80.00;
		}
		if(foodName == "Pazham Pori"){
			return 80.00;
		}
        if(foodName == "Malnad Pork"){
			return 225.00;
		}
		if(foodName == "Chole Bhature"){
			return 165.00;
		}
		return  -1.0;
		}

      }