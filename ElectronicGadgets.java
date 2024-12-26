class ElectronicGadgets{
 
        public static void main(String things[]){
		
		String gadgetNames[] = {
            "WashingMachine", "Airconditioner", "Laptop", "Laptop",
			"computer","Refrigerator","Mobile","Tablet","Speaker","Heater",
			"Geyser","Microoven","Blender","Juicer","Food Processor","Rice cooker"
        };
		System.out.println("No of gadgets Added are:"+gadgetNames.length);
		// System.out.println(
          //  "musicalinstruments available are = " 
           // + gadgetNames[0] + "," 
           // + gadgetNames[1] + "," 
            //+ gadgetNames[2] + "," 
         //   +gadgetNames[3] + "," 
           // + gadgetNames[4] + "," 
          //  + gadgetNames[5] + "," 
           // + gadgetNames[6] + "," 
            //+ gadgetNames[7] + "," 
            //+ gadgetNames[8] + "," 
            //+ gadgetNames[9] + "," 
            //+ gadgetNames[10] + "," 
            //+ gadgetNames[11] + "," 
            //+ gadgetNames[12] + "," 
            //+ gadgetNames[13] + "," 
            //+ gadgetNames[14]
       // );
	   System.out.println("The musicalinstruments available are:");
	   for(int begin=0; begin<gadgetNames.length; begin++){
				       String ref = gadgetNames[begin];
					   System.out.println(ref);
	   }
	   
		}
	}