class PhonePeRunner{
              public static void main(String[] policy){
				  System.out.println("main started");
		      boolean isInsuranceAdded = PhonePe.addInsurance("Bike insurance");
			  System.out.println("is insurance added :"+isInsuranceAdded);
			   isInsuranceAdded = PhonePe.addInsurance("Health Insurance");
			  System.out.println("is insurance added :"+isInsuranceAdded);
			  isInsuranceAdded = PhonePe.addInsurance("Car Insurance");
			  System.out.println("is insurance added :"+isInsuranceAdded);
			  isInsuranceAdded = PhonePe.addInsurance("Life Insurance");
			  System.out.println("is insurance added :"+isInsuranceAdded);
			  isInsuranceAdded = PhonePe.addInsurance("Crop Insurance");
			  System.out.println("is insurance added :"+isInsuranceAdded);
			  PhonePe.getInsurance();
			  PhonePe.updateInsuranceByName("Land Insurance" ,"Crop Insurance");
			  PhonePe.getInsurance();
			  PhonePe.deleteInsuranceByName("Life Insurance");
			  PhonePe.getInsurance();
			  System.out.println("main ended");
     }
   }