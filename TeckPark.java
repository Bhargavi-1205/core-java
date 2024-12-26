class TechPark{

        static String companyNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addcompanyName(String companyName)
		  {
		  System.out.println("add company Names started");
		  boolean iscompanyNameAdded = false;
		  if(companyName != null){
		  System.out.println("companyNmaes contain value...proceed to add");
		  companyNames[index] = companyName;
		  index++;
		  iscompanyNameAdded = true;
		  }
		  else{
		  System.out.println("company Names is null");
		  }
		  System.out.println(" add company Names ended");
		  return iscompanyNameAdded;

}
}