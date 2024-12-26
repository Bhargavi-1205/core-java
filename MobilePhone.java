class MobilePhone{
       
	      static String brandName;
          static double price; 
          static String modelId;
          static String color;
          static int storage;
	   
	    public static void main(String mobile[]){
          System.out.println("MobilePhone brandname is:"+brandName);
          System.out.println("MobilePhone price is:"+price);
          System.out.println("MobilePhone modelId is:"+modelId);
          System.out.println("MobilePhone color is:"+color);
          System.out.println("MobilePhone storage is:"+storage);
		  
		  brandName="one-plus";
          price=45000.78 ; 
          modelId="AHFTHD2345";
          color="Black";
          storage=256;
		  System.out.println("MobilePhone brandname is:"+brandName);
          System.out.println("MobilePhone price is:"+price);
          System.out.println("MobilePhone modelId is:"+modelId);
          System.out.println("MobilePhone color is:"+color);
          System.out.println("MobilePhone storage is:"+storage);
	   }
}