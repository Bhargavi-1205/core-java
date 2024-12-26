class PassportSeva2{
            
			public static void main(String[] seva){
			 boolean ref = userRegistration("PO" , "Bengaluru" , "Bhargavi" , "Narayanaswamy" , 
			 "12/05/2002" , "bhargavin367@gmail.com" , true , "bhargavin367@gmail.com" ,
			 "raj@1208" , "raj@1208" , "Colour" , "Black" , "WERTY");
			 System.out.println("Is user Registerd" +ref);
			 
			 
			 }
			public static boolean userRegistration(String cpvLocation , String dcdrLocation , String givenName,
			String surName, String dob ,String email , boolean emailloginSame , String loginId , String password , 
			String confirmPassword , String hintQue , String hintAns , String captcha){
			System.out.println("The CpvLocation is"+cpvLocation);
			System.out.println("The DCDRLocation is"+dcdrLocation);
			System.out.println("The Given name is"+givenName);
			System.out.println("The surName is"+surName);
			System.out.println("The DOB is"+dob);
			System.out.println("The email is"+email);
			System.out.println("The email login same"+emailloginSame);
			System.out.println("The loginId is"+loginId);
			System.out.println("The password is"+password);
			System.out.println("The confirmpassword is"+confirmPassword);
			System.out.println("The hintQuestion is "+hintQue);
			System.out.println("The hintAnswers is"+hintAns);
			System.out.println("The Captcha is"+captcha);
			
			return true;
			}




      }