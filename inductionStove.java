class InductionStove{

           static boolean isConnected;
		    static int currentFlame;
			static int flameOn = 34;
			static int flameOff;
			
			public static void main(String jbl[]){
			System.out.println("main Started");
			       increaseFlame();
				   increaseFlame();
				   decreaseFlame();
				   decreaseFlame();
			} 
			public static void increaseFlame(){
			  System.out.println("Start of increaseflame method");
			   if (isConnected == true){
			       if(currentFlame < flameOn){
				currentFlame = currentFlame + 1;
				System.out.println("The currentFlame is "+ currentFlame);
				} else{
				     System.out.println("Flame Reached");
				}
			   }
				else{
					System.out.println("hey on the stove");	
				}
			   
			}
				public static void decreaseFlame(){
			  System.out.println("Start of decreaseflame method");
			   if (isConnected == true){
			       if(currentFlame < flameOff){
				currentFlame = currentFlame + 1;
				System.out.println("The currentFlame is "+ currentFlame);
				} else{
				     System.out.println("Flame Reached");
				}
			   }
				else{
					System.out.println("hey on the stove");	
				}
			   
			}
}