class Fridge{

           static boolean isConnected;
		    static int currentDefrost;
			static int defrostRise = 34;
			static int defrostLow;
			
			public static void main(String jbl[]){
			System.out.println("main Started");
			       increaseDefrost();
				   increaseDefrost();
			       decreaseDefrost();
				   decreaseDefrost();
			}
			public static void increaseDefrost(){
			  System.out.println("Start of increasedefrost method");
			   if (isConnected == true){
			       if(currentDefrost < defrostRise){
				currentDefrost = currentDefrost + 1;
				System.out.println("The currentDesert is "+ currentDefrost);
				} else{
				     System.out.println("Defrost Reached");
				}
			   }
				else{
					System.out.println("hey on the Fridge");	
				}
			   
			}
			public static void decreaseDefrost(){
			  System.out.println("Start of decreasedefrost method");
			   if (isConnected == true){
			       if(currentDefrost < defrostLow){
				currentDefrost = currentDefrost + 1;
				System.out.println("The currentDesert is "+ currentDefrost);
				} else{
				     System.out.println("Defrost Reached");
				}
			   }
				else{
					System.out.println("hey off the Fridge");	
				}
			   
			}
}