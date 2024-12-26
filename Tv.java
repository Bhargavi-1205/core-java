class Tv{

           static boolean isConnected;
		    static int currentVolume;
			static int volumeOn = 34;
			static int volumeOff;
			
			public static void main(String jbl[]){
			System.out.println("main Started");
			       increaseVolume();
				   increaseVolume();
				   decreaseVolume();
				   decreaseVolume();
			} 
			public static void increaseVolume(){
			  System.out.println("Start of increaseVolume method");
			   if (isConnected == true){
			       if(currentVolume < volumeOn){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is "+ currentVolume);
				} else{
				     System.out.println("Volume Reached");
				}
			   }
				else{
					System.out.println("hey on the TV");	
				}
			   
			}
			public static void decreaseVolume(){
			  System.out.println("Start of decreaseVolume method");
			   if (isConnected == true){
			       if(currentVolume < volumeoff){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is "+ currentVolume);
				} else{
				     System.out.println("Volume Reached");
				}
			   }
				else{
					System.out.println("hey of the TV");	
				}
			   
			}
}