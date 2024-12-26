import java.util.Arrays;
class TechPark{

        static String companyNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addCompanyName(String CompanyName)
		  {
		  System.out.println("add company Names started");
		  boolean isCompanyNameAdded = false;
		  if(CompanyName != null){
		  System.out.println("companyNmaes contain value...proceed to add");
		  companyNames[index] = CompanyName;
		  index++;
		  isCompanyNameAdded = true;
		  }
		  else{
		  System.out.println("company Names is null");
		  }
		  System.out.println(" add company Names ended");
		  return isCompanyNameAdded;

} 
           public static void getCompanyName(){
		   System.out.println("CompanyName started");
		   System.out.println("list of CompanyName are");
		   for(String CompanyName : companyNames){
			   System.out.println(CompanyName);
		   }
		

		}
		public static boolean updateCompanyNameByName(String newCompanyname , String oldCompanyname){
		boolean isCompanyNameUpdated = false;
		for(int start = 0; start<companyNames.length; start++){
			if(companyNames[start] ==  oldCompanyname){
				   companyNames[start] =  newCompanyname;
 					isCompanyNameUpdated=true;
				}
			}
		return isCompanyNameUpdated;
	}
	    public static boolean deleteCompanyNameByName(String companyname){
			boolean isCompanyNameDeleted = false;
			int index , newIndex;
			System.out.println("deleteCompanyNameByName started");
			for(index=0 , newIndex=0; index<companyNames.length; index++){
				String oldCompanyname = companyNames[index];
				if(oldCompanyname != companyname){
				companyNames[newIndex++]= oldCompanyname;
                isCompanyNameDeleted = true;				
				}
			}
			companyNames = Arrays.copyOf(companyNames , newIndex);
			return isCompanyNameDeleted;
		}
}