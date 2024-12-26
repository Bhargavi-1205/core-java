 import java.util.Arrays;
 class Olympics{

        static String sportsNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addSportsName(String SportsName)
		  {
		  System.out.println("add sports Names started");
		  boolean isSportsNameAdded = false;
		  if(SportsName != null){
		  System.out.println("sportNames contain value...proceed to add");
		  sportsNames[index] = SportsName;
		  index++;
		  isSportsNameAdded = true;
		  }
		  else{
		  System.out.println("sport Names is null");
		  }
		  System.out.println(" add sport Names ended");
		  return isSportsNameAdded;

}       
  public static void getSportsName(){
		   System.out.println("SportsName started");
		   System.out.println("list of SportsName are");
		   for(String SportsName : sportsNames){
			   System.out.println(SportsName);
		   }
		

		}
		public static boolean updateSportsNameByName(String newSportsName , String oldSportsName){
		boolean isSportsNameUpdated = false;
		for(int start = 0; start<sportsNames.length; start++){
			if(sportsNames[start] ==  oldSportsName){
				   sportsNames[start] =  newSportsName;
 					isSportsNameUpdated=true;
				}
			}
		return isSportsNameUpdated;
	}
	     public static boolean deleteSportsNameByName(String sportsname){
			boolean isSportsNameDeleted = false;
			int index , newIndex;
			System.out.println("deleteSportsNameByName started");
			for(index=0 , newIndex=0; index<sportsNames.length; index++){
				String oldSportsname = sportsNames[index];
				if(oldSportsname != sportsname){
				sportsNames[newIndex++]= oldSportsname;
                isSportsNameDeleted = true;				
				}
			}
			sportsNames = Arrays.copyOf(sportsNames , newIndex);
			return isSportsNameDeleted;
		}
}
