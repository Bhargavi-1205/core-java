class RadissionBlu{

               static String foodMenu[]={"Idlesambar", "Masala dosa", "set dosa", "Onion dosa",
			                              "Veg rice","Mushroom rice","Fried rice","Ghee rice","Pongal","chapathi",
			                              "parota","Veg biryani","Bisibelebath","south meals","Rice sambar","chicken biryani",
										  "Mutton biryani","Kushka","Egg rice","Kabbab"};
										  
			  
            public static void main(String[] eat){
			
			System.out.println("No of food items are:foodMenu.length");
			for(int taste=foodMenu.length-1; taste>0; taste--){
			        String ref= foodMenu[taste];
					System.out.println(ref);
					}		
			}
}