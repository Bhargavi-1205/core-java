class ApolloPhramacyRunner{

           public static void main(String[] tablet){
		   //  boolean ref = ApolloPhramacy.addMedicine("dolo650");
			//			System.out.println("is medicine added"+ref);
		   System.out.println("main started");
		   boolean isMedicineAdded = ApolloPhramacy.addMedicine("dolo650");
		   System.out.println("isMedicineAdded :"+isMedicineAdded);
		   isMedicineAdded= ApolloPhramacy.addMedicine("citrizen");
		   System.out.println("isMedicineAdded :"+isMedicineAdded); 
		   isMedicineAdded= ApolloPhramacy.addMedicine("Omez");
		   System.out.println("isMedicineAdded :"+isMedicineAdded);
		   isMedicineAdded= ApolloPhramacy.addMedicine("saradon");
		   System.out.println("isMedicineAdded :"+isMedicineAdded);
		   isMedicineAdded= ApolloPhramacy.addMedicine("Avil");
		   System.out.println("isMedicineAdded :"+isMedicineAdded);
		   ApolloPhramacy.getMedicine();
		   ApolloPhramacy.updateMedicineByName("Paracetemol","dolo650");
		  // System.out.println("MedicineNameUpdated:"+MedicineNameUpdated);
		   ApolloPhramacy.getMedicine();
		   ApolloPhramacy.deleteMedicineByName("saradon");
		   ApolloPhramacy.getNewMedicine();
		   System.out.println("main ended");
		   
		   
		   }




}