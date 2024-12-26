class Netflix{

          static String hindiMovies[]={"stree","student of the year","Taare Zameen Par","Hum apake",""};
		  static String koreanMovies[]={"All of us are dead","the penthouse","halfgirlfried","the girlfriend is an alien"};
		  static String kannadaMovies[]={"Kgf","Katerra","kantara","om","A"};
		  static String telguMovies[]={"Sye","style","I","bahubali","Mirchi"};
		
		public static void main(String[] watch){
		
		  System.out.println("No of hindi movies are:+hindiMovies.length");
		  System.out.println("the available hindi movies are:");
		  for(int open=hindiMovies.length-1; open>0; open--){
		          String ref=hindiMovies[open];
				  System.out.println(ref);
		  }
		  System.out.println("No of korean movies are:koreanMovies.length");
		  System.out.println("The available Korean movies are:");
		    for(int see=koreanMovies.length-1; see>0; see--){
			       String ref= koreanMovies[see]; 
				   System.out.println(ref);
			}
			 System.out.println("No of kannada movies are:kannadaMovies.length");
		    for(int end=kannadaMovies.length-1; end>0; end--){
			       String ref= kannadaMovies[end]; 
				   System.out.println(ref);
			}
			 System.out.println("No of telgu movies are:telguMovies.length");
		    for(int look=telguMovies.length-1; look>0; look--){
			       String ref=telguMovies[look];
				   System.out.println(ref);
				   }
		  }
		  
	 }