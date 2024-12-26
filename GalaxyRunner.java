class GalaxyRunner{
              public static void main(String[] planets){
				   System.out.println("main started");
		      boolean isPlanetAdded = Galaxy.addPlanet("pluto");
			  System.out.println("is planets added"+isPlanetAdded);
			  isPlanetAdded = Galaxy.addPlanet("jupiter");
			  System.out.println("is planets added"+isPlanetAdded);
			  isPlanetAdded = Galaxy.addPlanet("Mars");
			  System.out.println("is planets added"+isPlanetAdded);
			  isPlanetAdded = Galaxy.addPlanet("Neptune");
			  System.out.println("is planets added"+isPlanetAdded);
			  isPlanetAdded = Galaxy.addPlanet("saturn");
			  System.out.println("is planets added"+isPlanetAdded);
			  Galaxy.getPlanet();
			  Galaxy.updatePlanetByName("earth" ,"Mars");
			 Galaxy.getPlanet();
			 Galaxy.deletePlanetByName("Neptune");
			 Galaxy.getPlanet();
              System.out.println("main started");			 
     }
   }