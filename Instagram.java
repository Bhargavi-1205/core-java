class Instagram{
      
	        public static void main(String[] args){
			System.out.println("main started");
			boolean ref = signIn(Long.parseLong("8296434761"), "raj@1208" , "bhargavigowda" ,
			"food" , "jamoon" ,"bhargaviraj");
			System.out.println(ref);
			System.out.println("main ended");
			}
			
			public static boolean signIn(long phno , String password , String UserName ,
			String hintque , String hintans , String name){
//	  System.out.println("signIn started");
//	  String ref= null;
//	  if(phno > 0 && password != null){
//	  System.out.println("Phno/Password is valid");
//	        ref= "signIn successfull";
//	   }
//	  else{
//	  System.out.println("Phno/Password is invalid ");
//	        ref="signIn Unsuccessfull";
//	   }
//	   System.out.println("signIn ended ");
//	   return ref; 
                System.out.println("The phno is"+ phno);
			System.out.println("The Password is"+ password);
		 System.out.println("The UserName is"+ UserName);
			System.out.println("The hintque is"+ hintque);
			System.out.println("The hintans is"+ hintans);
			System.out.println("The name is"+ name);
			return true;   
			   
	     }
   }