class UberEats{
         
//		 public static void main(String[] args){
//		    double price = search("Ghee rice");
//			System.out.println("The price of Ghee rice is "+price);
//		}
		 public static double search(String items , int Quantity){
		 
		 if(items == "jeera rice"){
		     return 270.56;
			 }
		 if(items == "paneer rice"){
		     return 187.07;
			 }
		 if(items == "Mushroom rice"){
		     return 307.05;
			 }
		 if(items == "Veg rice"){
		     return 140.65;
			 }
		 if(items == "Bisibelebath"){
		    return 84.79;
			}
		 if(items == "Ghee rice"){
		    return 45.56;
			}
		 if(items == "vangi bath"){
		     return 45.07;
			 }
		 if(items== "Lemon rice"){
		     return 22.34;
			 }
		 if(items == "pulihora"){
		    return 79.87;
			}
		 if(items == "tomato bath"){
		   return 56.90;
		   }
		 if(items == "pallav"){
		   return 87.07;
		   }
		 if(items == "soya rice"){
		   return 39.00;
		   }
		 if(items == "Mentyabath"){
		   return 228.07;
		   }
		 if(items == "alurice"){
		   return 59.12;
		   }
		 if(items == "Bendi Biryani"){
		   return 56.87;
		   }
		 if(items == "rice and sambar"){
		    return 87.79;
			}
		 if(items == "South Meals"){
		    return 79.80;
			}
			return -1.0;
		 }
	 }