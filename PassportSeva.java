class PassportSeva{
          
		public static void main(String[] args){
		System.out.println("main started");
		String ref = signIn(2434, "raj@1208");
		System.out.println(ref);
		System.out.println("main ended"); 
		  }
		  
		public static String signIn(int loginId , String password ){
		System.out.println("signIn started");
		 String ref = null;
		 if(loginId > 0 && password != null){
		  System.out.println("LoginId/Password is valid");
		    ref = "signin Successful";
			}
		 else{
		 System.out.println("LoginId/Password is invalid");
		    ref= "signin Unsuccessfull";
			}
		 System.out.println("signIn ended");
		 return ref;
		}
}