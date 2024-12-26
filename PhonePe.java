 import java.util.Arrays;
   class PhonePe{

        static String insurances[] ={null , null ,null , null , null};
		static int index;

          public static boolean addInsurance(String Insurance)
		  {
		  System.out.println("addinsurance started");
		  boolean isInsuranceAdded = false;
		  if(Insurance != null){
		  System.out.println("insurance contain value...proceed to add");
		  insurances[index] = Insurance;
		  index++;
		  isInsuranceAdded = true;
		  }
		  else{
		  System.out.println("insurance is null");
		  }
		  System.out.println(" addinsurance ended");
		  return isInsuranceAdded;

}
          public static void getInsurance(){
			  System.out.println("get Insurance started");
			  System.out.println("list of insurances");
			  for(String Insurance : insurances){
				  System.out.println(Insurance);
			  }
		  }
		  public static boolean updateInsuranceByName(String newInsurancename , String oldInsurancename){
			  boolean isInsuranceUpdated = false;
			  for(int start =0; start<insurances.length; start++){
				  if(insurances[start] == oldInsurancename){
					  insurances[start] = newInsurancename;
					  isInsuranceUpdated = true;
				  }
			  }
			  return isInsuranceUpdated;
		  }
          public static boolean deleteInsuranceByName(String insurancename){
			  boolean isInsuranceDeleted = false;
			  int index , newIndex;
			  System.out.println("deleteInsuranceByName");
			  for(index=0 , newIndex=0; index<insurances.length; index++){
				  String oldInsurancename = insurances[index];
				  if(oldInsurancename !=insurancename){
					  insurances[newIndex++]= oldInsurancename;
					  
				  }else{
					 isInsuranceDeleted=true; 
				  }
				  
			  }
			  insurances = Arrays.copyOf(insurances , newIndex);
			  return isInsuranceDeleted;
		  }		  
}
  
		
