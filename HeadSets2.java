class HeadSets2{

           static boolean isConnected;
		    static int currentVolume;
			static int maxVolume = 8;
			static int minVolume;
			
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
			       if(currentVolume < maxVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is "+ currentVolume);
				} else{
				     System.out.println("Max Volume Reached");
				}
			   }
				else{
				  System.out.println("Gube...first HeadSets na on maadu...");	
				}
			   
			}
			public static void decreaseVolume(){
			  System.out.println("Start of decreaseVolume method");
			   if (isConnected == true){
			       if(currentVolume < minVolume){
				currentVolume = currentVolume + 1;
				System.out.println("The currentVolume is "+ currentVolume);
				} else{
				     System.out.println("Min Volume Reached");
				}
			   }
				else{
					System.out.println("hey off the HeadSets");	
				}
				
			   
			}
}