class Mixer{

           static boolean isConnected;
		    static int currentSpeed;
			static int maxSpeed = 15;
			static int minSpeed;
			
			public static void main(String jbl[]){
			System.out.println("main Started");
			       increaseSpeed();
				   increaseSpeed();
				   decreaseSpeed();
				   decreaseSpeed();
			} 
			public static void increaseSpeed(){
			  System.out.println("Start of increaseSpeed method");
			   if (isConnected == true){
			       if(currentSpeed < maxSpeed){
				currentSpeed = currentSpeed + 1;
				System.out.println("The currentSpeed is "+ currentSpeed);
				} else{
				     System.out.println("Max Speed Reached");
				}
			   }
				else{
					System.out.println("hey on the mixer");	
				}
			   
			}
			public static void decreaseSpeed(){
			  System.out.println("Start of decreaseSpeed method");
			   if (isConnected == true){
			       if(currentSpeed < minSpeed){
				currentSpeed = currentSpeed + 1;
				System.out.println("The currentSpeed is "+ currentSpeed);
				} else{
				     System.out.println("Min Speed Reached");
				}
			   }
				else{
					System.out.println("hey off the mixer");	
				}
			   
			}
}