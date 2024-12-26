 import java.util.Arrays;
class Galaxy{

        static String planets[] ={null , null ,null , null , null};
		static int index;

          public static boolean addPlanet(String Planet)
		  {
		  System.out.println("addplanets started");
		  boolean isPlanetAdded = false;
		  if(Planet != null){
		  System.out.println("planet contain value...proceed to add");
		  planets[index] = Planet;
		  index++;
		  isPlanetAdded = true;
		  }
		  else{
		  System.out.println("planet is null");
		  }
		  System.out.println(" addplanet ended");
		  return isPlanetAdded;

}
          public static void getPlanet(){
		   System.out.println("Planet started");
		   System.out.println("list of planets are");
		   for(String Planet : planets){
			   System.out.println(Planet);
		   }
		

		}
		public static boolean updatePlanetByName(String newPlanetname , String oldPlanetname){
		boolean isPlanetUpdated = false;
		for(int start = 0; start<planets.length; start++){
			if(planets[start] ==  oldPlanetname){
				   planets[start] =  newPlanetname;
 					isPlanetUpdated=true;
				}
			}
		return isPlanetUpdated;
	}
	    public static boolean deletePlanetByName(String planetname){
			boolean isPlanetDeleted = false;
			int index , newIndex;
			System.out.println("deletePlanetByName started");
			for(index=0 , newIndex=0; index<planets.length; index++){
				String oldPlanetname = planets[index];
				if(oldPlanetname != planetname){
					planets[newIndex++] = oldPlanetname;
					isPlanetDeleted = true;
				}
			}
			planets = Arrays.copyOf(planets , newIndex);
			return isPlanetDeleted;
		}
}