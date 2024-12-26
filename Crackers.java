class Crackers{

        int  crackerId;
		String crackerName;
		double price;
		String crackerType;
		
		public Crackers(){
			this(1, "Flowerpot");
			System.out.println("no arg constructor is invoked");
		}

		
		public Crackers(int crackerId , String crackerName ){
			this(1000.00 , "Sparkling");
			System.out.println("2 arg i.e(int ,String) constructor is invoked");
		     this.crackerId = crackerId;
			 this.crackerName=crackerName;
			 
		
		}
		public Crackers(double price , String crackerType){
			System.out.println("2 arg i.e(double ,String) constructor is invoked");
			this.price=price;
			this.crackerType=crackerType;
			
		}
		public void spark(){
		
		}
		public void getCrackerInfo(){
		System.out.println("The crackerId is "+crackerId);
		System.out.println("The crackerName is "+crackerName);
		System.out.println("The crackerprice is "+price);
		System.out.println("The crackerType is "+crackerType);
		
		}
		



}