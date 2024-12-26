class NetFlix{
          
		  public static void main(String[] args){
		  System.out.println("main started");
		  boolean ref = signIn("bhargavi" , "gowda" , "bhargavin367@gmail.com" , "online");
		  System.out.println(ref);
		  System.out.println("main ended");
		 }
		  public static boolean signIn( String firstName , String lastName , String email , String paymentMethod){
//  System.out.println("signIn started");
//   String ref = null;
//    if(email != null && password != null){
//	System.out.println("Email/Password is valid");
//	   ref = "signIn successfull";
//	   }
//	else{
//	System.out.println("Email/Password is invalid");
//	    ref = "signIn unsuccessfull";
//		}
//  System.out.println("signIn ended");
//    return ref;
//}     

			System.out.println("The firstName is"+ firstName);
			System.out.println("The lastName is"+ lastName);
			System.out.println("The email is"+ email);
			System.out.println("The paymentMethod is"+ paymentMethod);
		
			
			return true;   
			}




      }
