class ChatShop{
        
		static String  chats[]={"panipuri","Masalapuri","Gobi","NippetMasala","Dahipuri"};
        public static void main(String food[]){
		
		//String  chats[]={"panipuri","Masalapuri","Gobi","NippetMasala","Dahipuri"};
		System.out.println("No of chats Added are:"+chats.length);
		System.out.println("The available chats are:");
		
		      //String ref = chats[0];
			    //System.out.println(ref);
			  //String ref1 = chats[1];
			    //System.out.println(ref1);
			 //looping for,while,do while
			 for(int start=0; start<chats.length-1; start++){
				       String ref = chats[start];
					   System.out.println(ref);
			 }
		}
 }