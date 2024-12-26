class Zepto{
     
	   //  public static void main(String[] args){
		  double price = search("Nandini Pure Ghee");
	//	  System.out.println("The price of Ghee is"+price);
//		 }

        public static double search(String item , int Quantity){
		
		if(item == "Nandini Pure Ghee"){
		    return 20.00;
		}
		if(item == "Kerala Bannana Chips"){
		    return 56.00;
		}
		if(item == "A2B Masala Chips"){
		    return 45.00;
		}
		if(item == "Butter PopCorn"){
		   return 82.67;
		}
		if(item == "Amul choclateBar "){
		   return 200.00;
		}
		if(item == "Amul Chocominis"){
		   return 140.88;
		}
		if(item == "Lotte choco Pie "){
		   return 79.09;
		}
		if(item == "Britannia Gobbles"){
		   return 28.76;
		}
		if(item == "Gulab jamoon"){
		   return 388.87;
		}
		if(item == "Nova Best Bite"){
		   return 216.54;
		}
		if(item == "Epigamia Greek Natural yoghurt"){
		   return 220.00;
		}
		if(item == "Ferror Rocher T8"){
		   return 166.37;
		}
		if(item == "Rite Bite Max Protein cookies"){
		   return 47.34;
		}
		if(item == "Cadburry Nutties"){
		   return 67.89;
		}
		return 0.0;
		}


   }