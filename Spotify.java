import java.util.Arrays;
class Spotify{

        static String artistNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addArtistName(String ArtistName)
		  {
		  System.out.println("addartistNames started");
		  boolean isArtistNameAdded = false;
		  if(ArtistName != null){
		  System.out.println("artistNmaes contain value...proceed to add");
		  artistNames[index] = ArtistName;
		  index++;
		  isArtistNameAdded = true;
		  }
		  else{
		  System.out.println("artist Names is null");
		  }
		  System.out.println(" add artist Names ended");
		  return isArtistNameAdded;

}   
          public static void getArtistName(){
		   System.out.println("Planet started");
		   System.out.println("list of planets are");
		   for(String ArtistName : artistNames){
			   System.out.println(ArtistName);
		

		}
		  }
		public static boolean updateArtistNameByName(String newArtistname , String oldArtistname){
		boolean isArtistNameUpdated = false;
		for(int start = 0; start<artistNames.length; start++){
			if(artistNames[start] ==  oldArtistname){
				   artistNames[start] =  newArtistname;
 					isArtistNameUpdated=true;
				}
			}
		return isArtistNameUpdated;
	}
	    public static boolean deleteArtistNameByName(String artistname){
			boolean isArtistNameDeleted = false;
			int index , newIndex ;
			System.out.println("deleteArtistNameByName started");
			for(index=0 , newIndex=0; index<artistNames.length; index++){
				String oldArtistname = artistNames[index];
				if(oldArtistname != artistname){
				artistNames[newIndex++] = oldArtistname;
				isArtistNameDeleted = true;
				}
			}
			artistNames = Arrays.copyOf(artistNames , newIndex);
			return isArtistNameDeleted;
		}
}