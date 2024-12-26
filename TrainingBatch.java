class TrainingBatch{
             
			 int batchName;
			 int totalTrainers;
			 String trainername;
			 String instituteName;
			 
            public TrainingBatch(){
		     System.out.println("TrainingBatch constructor is invoked");
	   }
	        public void fetchDetails(){
		     System.out.println( "The batch name of Training batch is "+batchName);
			 System.out.println("Total trainers in Training batch is"+totalTrainers);
			 System.out.println("The trainer name in training batch is"+trainername);
			 System.out.println("The institute name of Training batch is"+instituteName);
		   
		   
		   
	   }



}