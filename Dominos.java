class Dominos{
          
		 public static void main(String[] tasty){
		 
		String pizzas[]={"New York Pizza","Silicon Pizza","Neapolitan Pzza","Detroit-style Pizza",
		                  "Greek pizza","chicago deep pizza","pizza quattro stagioni",
						  "Margherita Pizza","Roman Pizza","cheese Pizza"
						 };
			 System.out.println("No of pizzas Added are:"+pizzas.length);
	  //System.out.println(
	  //	 "Types of Pizzas="
	//  +pizzas[0]+","
    //      +pizzas[1]+","
    //      +pizzas[2]+","
    //      +pizzas[3]+","
	//	  +pizzas[4]+","
	//	  +pizzas[5]+","
	//	  +pizzas[6]+","
	//	  +pizzas[7]+","
	//	  +pizzas[8]+","
	//	  +pizzas[9]
	//	  );
	        System.out.println("The Types of pizzas are:");
		for(int open=0; open< pizzas.length; open++){
				       String ref = pizzas[open];
					   System.out.println(ref);
		   }
		}
	}