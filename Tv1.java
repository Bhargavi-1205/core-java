class Tv1{

        static boolean isConnected;
		static int currentVolume;
		static int maxVolume=17;
		static int minVolume;
		public static void main(String[] args){
		  boolean tvOn=onOrOff();
		  System.out.println("the tv is "+tvOn);
		  increaseVolume();
		  decreaseVolume();
		  }
		  public static boolean onOrOff(){
		  System.out.println("start the turnon");
		  if(isConnected ==false ){
		      isConnected = true;
			  System.out.println("headsets is turned on"+isConnected);
		  }else if(isConnected==true){
		    isConnected=false;
			System.out.println("TV is turned off "+isConnected);
		  }  
			System.out.println("end of turnon");
			 return isConnected; 
			 }
		  public static void increaseVolume(){
		  System.out.println("start of increasevolume method");
		    if (isConnected == true){
		     if (currentVolume < maxVolume){
		    currentVolume = currentVolume+1;
		  System.out.println("the current volume"+currentVolume);
		  }
		  else  {
		  System.out.println("volume reached");
		  }
		  }
		  else{
		  System.out.println("hey on the tv");
		  }
			}
			public static void decreaseVolume(){
				System.out.println("Start of decreaseVolume method");
				if(isConnected == false){
					if (currentVolume < minVolume){
						currentVolume = currentVolume-1;
						System.out.println("the current volume "+currentVolume);
					}
					else{
						System.out.println("volume reached");
						
					}
					}
					else{
						System.out.println("hey off the tv");
						
					}
				}
			}

			
			
			 
		   
		   
		 

