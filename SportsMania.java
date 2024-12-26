class SportsMania{
  
           static String totalmensTeam[]={"India", "Pakistan", "Australia", "England",
			                              "New zealand","South Africa","Srilanka","Bangladesh","Afghanistan","Netherlands"};
		   static String totalwomenTeam[]={"India", "Pakistan", "Australia", "England",
			                              "New zealand","South Africa","Srilanka","Bangladesh","West indies","Netherlands"};
		   static String footballTeam[]={"Germany", "Spain", "Atlanta Falcons", "Portugal",
			                              "Italy","France","Brazil","Belgium","Argentina","Netherlands"};							  
		  
         public static void main(String[] args){
		 
		     System.out.println("No of mens teams are:totalmensTeam.length");
              for(int play=totalmensTeam.length-1; play>0; play--){
			  String ref = totalmensTeam[play];
			  System.out.println(ref);
			  }			 
			  System.out.println("No of women teams are:totalwomenTeam.length");
              for(int start= totalwomenTeam.length-1; start>0; start--){
			  String ref = totalwomenTeam[start];
			  System.out.println(ref);
			  }
			  System.out.println("No of football teams are:footballTeam.length");
              for(int kick=footballTeam.length-1; kick>0; kick--){
			  String ref = footballTeam[kick];
			  System.out.println(ref);
			  }
			  }		
			  }