class DisneyplusHotstar{

          static String englishSeries[]={"the rings of power","Kaos","Ghosts","Hearts topper","emily in paris"};
		  static String  animey[]={"The loin king","spirited away","SpiderMan","Iceage"};
		  static String cartoonMovies[]={"kungfu panda","zoopopia","Migration","Chota Bheem","Krishna aur kans"};
		  
		  public static void main(String[] watch){
		    
			System.out.println("No of english series are:englishSeries.length");
			for(int look=englishSeries.length-1; look>0; look--){
			        String ref= englishSeries[look];
					System.out.println(ref);
					}
			
			System.out.println("No of animations are:animey.length");
			for(int wild=animey.length-1; wild>0; wild--){
			        String ref= animey[wild];
					System.out.println(ref);
			}
			System.out.println("No of cartoon movies are:cartoonMovies.length");
			for(int act=cartoonMovies.length-1; act>0; act--){
			        String ref= cartoonMovies[act];
					System.out.println(ref);
			}
					}
		  


}