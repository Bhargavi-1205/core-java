lass HeadSets1{
          
		  static boolean isConnected;
		  public static void main(String[] jbl){
	
		  	boolean headSetConnected =  onOrOff();
			System.out.println("is headset connected"+headSetConnected);
			
			    headSetConnected =  onOrOff();
			System.out.println("is headset connected"+headSetConnected);
			    headSetConnected =  onOrOff();
			System.out.println("is headset connected"+headSetConnected);
			    headSetConnected =  onOrOff();
			System.out.println("is headset connected"+headSetConnected);
			    
			 
			  
		  }
		  public static boolean onOrOff(){
		  System.out.println("start of onOrOff");
		  isConnected = !isConnected? true:false;
		  System.out.println("end of onOrOff");
		  return isConnected;
		  }
		  }