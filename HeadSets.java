class HeadSets{
          
		  static boolean isConnected;
		  public static void main(String[] jbl){
	
			  onOrOff();
			  onOrOff();
			 
			  
		  }
		  public static void onOrOff(){
		  System.out.println("start of turnon");
		  if(isConnected ==false ){
		      isConnected = true;
			  System.out.println("headsets is turned on"+isConnected);
		  }else if(isConnected==true){
		    isConnected=false;
			System.out.println("headsets is turned off "+isConnected);
		  }  
			System.out.println("end of turnon");
		   return;  
		  }
		 
		   
		  }