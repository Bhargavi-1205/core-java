class TheatreRunner{
              public static void main(String[] see){
				   System.out.println("main started");
		      boolean isMovieNamesAdded = Theatre.addMovieName("Kalki");
			  System.out.println("is movieName added"+isMovieNamesAdded);
			  isMovieNamesAdded = Theatre.addMovieName("saalar");
			  System.out.println("is movieName added"+isMovieNamesAdded);
			  isMovieNamesAdded = Theatre.addMovieName("Oye");
			  System.out.println("is movieName added"+isMovieNamesAdded);
			  isMovieNamesAdded = Theatre.addMovieName("Twister");
			  System.out.println("is movieName added"+isMovieNamesAdded);
			  isMovieNamesAdded = Theatre.addMovieName("Jaanu");
			  System.out.println("is movieName added"+isMovieNamesAdded);
			  Theatre.getMovieNames();
			  Theatre.updateMovieNamesByName("Bheema" ,"Kalki" );
			  Theatre.getMovieNames();
			  Theatre.deleteMovieNamesByName("Oye");
			  Theatre.getMovieNames();
			   System.out.println("main ended");
			  
     }
   }