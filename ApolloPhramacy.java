class ApolloPhramacy{

        static String medicines[] ={null , null ,null , null , null};
		static String newMedicines[] ={null ,null , null , null};
		static int index;

          public static boolean addMedicine(String Medicine)
		  {
		  System.out.println("addMedicine started");
		  boolean isMedicineAdded = false;
		  if(Medicine != null){
		  System.out.println("Medicine contain value...proceed to add");
		  medicines[index] = Medicine;
		  index++;
		  isMedicineAdded=true;
		  }else{
		  System.out.println("medicine is null");
		  }
		  System.out.println(" addmedicine ended");
		  return  isMedicineAdded;

		  }
		  public static void getMedicine(){
		   System.out.println("getMedicine started");
		   System.out.println("list of Medicine are");
		   for(String Medicine : medicines){
			   System.out.println(Medicine);
		   }
		

		}
		public static boolean updateMedicineByName(String newMedicinename , String oldMedicinename){
		boolean isMedicineUpdated = false;
		for(int start = 0; start<medicines.length; start++){
			if(medicines[start] == oldMedicinename){
				    medicines[start] = newMedicinename;
 					isMedicineUpdated=true;
				}
			}
		return isMedicineUpdated;
	}
		 
        public static boolean deleteMedicineByName(String medicineName){
			System.out.println("deleteMedicineByName started");
			boolean isMedicineDeleted = false;
			for(int index=0 , newIndex =0; index<medicines.length; index++){
				String oldMedicinename = medicines[index];
				if(oldMedicinename !=medicineName){
					newMedicines[newIndex++]=oldMedicinename;   
				
				}else{
				isMedicineDeleted = true;
				}
			}
			return isMedicineDeleted;
		}
       public static void getNewMedicine(){
		   System.out.println("getNewMedicine started");
		   System.out.println("list of newMedicine are");
		   for(String newMedicine : newMedicines){
			   System.out.println(newMedicine);
}
	   }
	}