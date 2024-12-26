class SnapChat{
     
	    public static void main (String[] args){
		 System.out.println("main started");
		 boolean ref = signIn("bhargavigowda" , "raj@1208" , "12/05/2002" , 8296434761L , "bhargavin367@gmail.com" , "bhargaviraj");
		 System.out.println(ref);
		 System.out.println("main ended");
		 }
		 
		 public static boolean signIn(String UserName , String Password , String dob , long mobileNo , String email , String name){
//   System.out.println("SignIn started");
//      String ref = null;
//	if(UserName != null && Password != null){
//	 System.out.println("UserName/Password is valid");
//	   ref= "SignIn successfull";
//	   }
//	else{
//	System.out.println("UserName/Password is invalid");
//	  ref = "SignIn unsuccessfull";
//	  }
//  System.out.println("SignIn ended");
//   return ref;

         System.out.println("The UserName is"+ UserName);
			System.out.println("The Password is"+ Password);
			System.out.println("The dob is"+ dob);
			System.out.println("The mobileNo is"+ mobileNo);
		   System.out.println("The email is"+ email);
			System.out.println("The name is"+ name);
			return true;   
		 }

  }