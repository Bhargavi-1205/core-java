 import java.util.Arrays;
class BlinkitNames{

        static String productNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addProductName(String ProductName)
		  {
		  System.out.println("addproductNames started");
		  boolean isProductNameAdded = false;
		  if(ProductName != null){
		  System.out.println("productNames contain value...proceed to add");
		  productNames[index] = ProductName;
		  index++;
		  isProductNameAdded = true;
		  }
		  else{
		  System.out.println("productNames is null");
		  }
		  System.out.println(" addproductNames ended");
		  return isProductNameAdded;

}
         public static void getProductName(){
		   System.out.println("AccountName started");
		   System.out.println("list of AccountName are");
		   for(String ProductName : productNames){
			   System.out.println(ProductName);
		   }
		

		}
		public static boolean updateProductNameByName(String newProductName , String oldProductName){
		boolean isProductNameUpdated = false;
		for(int start = 0; start<productNames.length; start++){
			if(productNames[start] ==  oldProductName){
				    productNames[start] =  newProductName;
 					isProductNameUpdated=true;
				}
			}
		return isProductNameUpdated;
	}
	   public static boolean deleteProductNameByName(String productname){
		   boolean isProductNameDeleted = false;
		   int index , newIndex;
		   System.out.println("deleteProductNameByName started");
		   for(index=0 , newIndex=0; index<productNames.length; index++){
			   String oldProductName = productNames[index];
			   if(oldProductName != productname){
				   productNames[newIndex++] = oldProductName;
				   isProductNameDeleted = true;
			   }
		   }
		    productNames = Arrays.copyOf(productNames , newIndex);
			return 
           isProductNameDeleted;
	   }
	   
		
}