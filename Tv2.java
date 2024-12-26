class Tv1{

        static boolean isConnected;
		static int currentVolume;
		static int maxVolume=17;
		static int minVolume;
		public static void main(String[] args){
		  onOrOff();
		  increaseVolume();
		  decreaseVolume();
		  }
		  public static void onOrOff(){
		  System.out.println("start the turnon");
		   if(isConnected == false){
		      isConnected = true;
			  System.out.println("Tv is turned on"+isConnected);
			  } else if{
			  if(isConnected == true){
			  isConnecte = false;
			  System.out.println("Tv is turned off"+isConnected);
			  } 
			  else{
			  System.out.println(" end of turnon");
			  }
			  }
			 }
		  public static void increaseVolume(){
		  System.out.println("start of increasevolume method");
		    if (isConnected == true){
		     if (currentVolume < maxVolume){
		    currentVolume = CurrentVolume+1;
		  System.out.println("the current volume"+currentVolume);
		  }
		  else  {
		  System.out.println("volume reached");
		  }
		  }
		  else{
		  Syste.out.println("hey on the tv");
		  }
			}	
			
			 
		   
		   
		 

