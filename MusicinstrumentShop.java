class MusicinstrumentShop {

    public static void main(String[] melody) {
    
        String musicalinstruments[] = {
            "Guitar", "Saxophone", "Accordion", "clarinet", "Harp", 
            "Trombone", "Drums", "Flute", "Trumpet", 
            "Voilin", "Harmonica", "Bassoon", "Guitar", "piccolo", 
            "recorder"
        };
        System.out.println("No of instruments Added are:"+musicalinstruments.length);
        //System.out.println(
        //    "musicalinstruments available are = " 
         //  + musicalinstruments[0] + "," 
         //   + musicalinstruments[1] + "," 
           // + musicalinstruments[2] + "," 
         //   + musicalinstruments[3] + "," 
         //   + musicalinstruments[4] + "," 
        //    + musicalinstruments[5] + "," 
          //  + musicalinstruments[6] + "," 
           // + musicalinstruments[7] + "," 
            //+ musicalinstruments[8] + "," 
            //+ musicalinstruments[9] + "," 
          //  + musicalinstruments[10] + "," 
           // + musicalinstruments[11] + "," 
           // + musicalinstruments[12] + "," 
            //+ musicalinstruments[13] + "," 
            //+ musicalinstruments[14]
       // );
	   System.out.println("Themusicalinstruments available are:");
	    for(int commence=0; commence< musicalinstruments.length; commence++){
				       String ref = musicalinstruments[commence];
					   System.out.println(ref);
		}	
    }
}
