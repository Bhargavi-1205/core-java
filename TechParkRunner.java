class TechParkRunner{
              public static void main(String[] companys){
				  System.out.println("main started");
		      boolean isCompanyNameAdded = TechPark.addCompanyName("amazon");
			  System.out.println("is amazon added"+isCompanyNameAdded);
			  isCompanyNameAdded = TechPark.addCompanyName("google");
			  System.out.println("is amazon added"+isCompanyNameAdded);
			  isCompanyNameAdded = TechPark.addCompanyName("IBM");
			  System.out.println("is amazon added"+isCompanyNameAdded);
			  isCompanyNameAdded = TechPark.addCompanyName("Hitachi");
			  System.out.println("is amazon added"+isCompanyNameAdded);
			  isCompanyNameAdded = TechPark.addCompanyName("accenture");
			  System.out.println("is amazon added"+isCompanyNameAdded);
			  TechPark.getCompanyName();
			  TechPark.updateCompanyNameByName("techmahindra" , "google");
			  TechPark.getCompanyName();
			  TechPark.deleteCompanyNameByName("IBM");
			  TechPark.getCompanyName();
			   System.out.println("main ended");
     }
   }