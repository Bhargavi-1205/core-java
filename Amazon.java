class Amazon{

           public static void main (String[] args){
		   System.out.println("main started ");
		   boolean ref= signIn(Long.parseLong("8296434761") , "raj@1208" , "bhargavin367@gmail.com" , "bhargavi" , "12/05/2002");
		   System.out.println(ref);
		   System.out.println("main ended");
		   }
		   
		   
		   public static boolean signIn(long phno , String password , String email , String name , String dob){
//    System.out.println("SignIn Started");
//	String ref = null;
//	 if(phno > 0 && password != null){
//	   System.out.println("Phno/password is valid");
//	      ref="SignIn succesfull";
//		  }
//     else{
//	   System.out.println("Phno/password is invalid");
//	      ref="SignIn unsuccesfull";
//		  }
//   System.out.println("SignIn ended");
//    return ref; 
            System.out.println("The phno is"+ phno);
			System.out.println("The Password is"+ password);
		 System.out.println("The email is"+ email);
			System.out.println("The name is"+ name);
			System.out.println("The dob is"+ dob);
			return true;   
			}
		   
	   }
