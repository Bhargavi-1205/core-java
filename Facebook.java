class Facebook{
         public static void main(String[] args){
		 System.out.println("main started");
		 boolean message = login("bhargavin367@gmail.com","raj@1208" ,"bhargavigowda" ,
			"food" , "jamoon" );
		  System.out.println("message");
		 System.out.println("main ended");
		 }
		 
         public static boolean login(String email , String password , String UserName ,
			String hintque , String hintans){
//	 System.out.println("login started");
//   String message=null;
//  if(email != null && password != null ){
//  System.out.println("Email / password is valid");
//       message ="login successful";
//  }
//  
//  else{
//     System.out.println("Email/password  is invalid");
//	   message ="login unsuccesful";
//	 }
		 // if(password != null){
		 //  System.out.println("Password is checked");
		//	 }
        //  else{
		//  System.out.println("Password is invalid");
		//  }			 
			// System.out.println("Login Succesful");
//	System.out.println("login ended");
//	 return message;
System.out.println("The email is"+email);
			System.out.println("The Password is"+ password);
		 System.out.println("The UserName is"+ UserName);
			System.out.println("The hintque is"+ hintque);
			System.out.println("The hintans is"+ hintans);
			
			return true; 
	 }
			
}







