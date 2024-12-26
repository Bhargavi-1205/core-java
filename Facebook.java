class Facebook{
         public static void main(String[] args){
		 
		 login("bhargavin367@gmail.com",null);
		 
		 }
		 
         public static String login(String email , String password){
		   String message="Login Succesful";
		  if(email != null){
		  System.out.println("Email is checked");
		  }
		  else{
		     System.out.println("Email is invalid");
			 }
		  if(password != null){
		     System.out.println("Password is checked");
			 }
          else{
		  System.out.println("Password is invalid");
		  }			 
			 System.out.println("Login Succesful");
			 return message;
			 }
			
}







