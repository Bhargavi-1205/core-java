 import java.util.Arrays;
class Theatre{

        static String movieNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addMovieName(String MovieName)
		  {
		  System.out.println("addmovies started");
		  boolean isMovieNameAdded = false;
		  if(MovieName != null){
		  System.out.println("movieNames contain value...proceed to add");
		  movieNames [index] = MovieName;
		  index++;
		  isMovieNameAdded = true;
		  }
		  else{
		  System.out.println("movieNames is null");
		  }
		  System.out.println(" addmovieNames ended");
		  return isMovieNameAdded;

}
          public static void getMovieNames(){
		   System.out.println("get movies Names started");
		   System.out.println("list of movies are");
		   for(String MovieName : movieNames){
			   System.out.println(MovieName);
		   }
		

		}
		 public static boolean updateMovieNamesByName(String newMoviename , String oldMoviename){
			  boolean isMovieNamesUpdated = false;
			  for(int start =0; start<movieNames.length; start++){
				  if(movieNames[start] == oldMoviename){
					  movieNames[start] = newMoviename;
					  isMovieNamesUpdated = true;
				  }
			  }
			  return isMovieNamesUpdated;
		  } 
		  public static boolean deleteMovieNamesByName(String moviename){
			  boolean isMovieNamesDeleted = false;
			  int index ,  newIndex;
			  System.out.println("deleteMovieNamesByName started");
			  for( index=0 , newIndex=0; index<movieNames.length; index++){
				  String oldMoviename = movieNames[index];
				  if(oldMoviename !=  moviename){
					  movieNames[newIndex++] = oldMoviename;
				  }
				  else{
					  isMovieNamesDeleted = true;
				  }
			  }
			  movieNames = Arrays.copyOf(movieNames , newIndex);
			  return isMovieNamesDeleted;
		  }
		    
		  		  
         
}