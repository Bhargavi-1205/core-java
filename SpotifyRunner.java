class SpotifyRunner{
              public static void main(String[] artists){
				    System.out.println("main started");
		      boolean isArtistNameAdded = Spotify.addArtistName("Arman Malik");
			  System.out.println("is arman malik added"+isArtistNameAdded);
			   isArtistNameAdded = Spotify.addArtistName("Arjun janya");
			  System.out.println("is arman malik added"+isArtistNameAdded);
			   isArtistNameAdded = Spotify.addArtistName("sanjith hegde");
			  System.out.println("is arman malik added"+isArtistNameAdded);
			   isArtistNameAdded = Spotify.addArtistName("vijay prakash");
			  System.out.println("is arman malik added"+isArtistNameAdded);
			   isArtistNameAdded = Spotify.addArtistName("sonu nigam");
			  System.out.println("is arman malik added"+isArtistNameAdded);
			  Spotify.getArtistName();
			  Spotify.updateArtistNameByName( "chandan shetty" , "sonu nigam" );
			  Spotify.getArtistName();
			  Spotify.deleteArtistNameByName("Arjun janya");
			  Spotify.getArtistName();
			    System.out.println("main ended");
     }
   }