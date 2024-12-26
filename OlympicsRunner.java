class OlympicsRunner{
              public static void main(String[] sports){
				  System.out.println("main started");
		      boolean  isSportsNameAdded = Olympics.addSportsName("Jawlin");
			  System.out.println("is jawlin added"+isSportsNameAdded);
			  isSportsNameAdded = Olympics.addSportsName("shotput");
			  System.out.println("is jawlin added"+isSportsNameAdded);
			  isSportsNameAdded = Olympics.addSportsName("relay");
			  System.out.println("is jawlin added"+isSportsNameAdded);
			  isSportsNameAdded = Olympics.addSportsName("long jump");
			  System.out.println("is jawlin added"+isSportsNameAdded);
			  isSportsNameAdded = Olympics.addSportsName("hihg jump");
			  System.out.println("is jawlin added"+isSportsNameAdded);
			  Olympics.getSportsName();
			  Olympics.updateSportsNameByName( "kabbadi" , "long jump" );
			  Olympics.getSportsName();
			  Olympics.deleteSportsNameByName( "relay" );
			   Olympics.getSportsName();
			   System.out.println("main ended");
     }
   }
   
   