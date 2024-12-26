 import java.util.Arrays;
 class ShoppingMalls{

        static String shopNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addShopName(String ShopName)
		  {
		  System.out.println("addshopNames started");
		  boolean isShopNameAdded = false;
		  if(ShopName != null){
		  System.out.println("shopNames contain value...proceed to add");
		  shopNames[index] = ShopName;
		  index++;
		  isShopNameAdded = true;
		  }
		  else{
		  System.out.println("shopNames is null");
		  }
		  System.out.println(" addshopNames ended");
		  return isShopNameAdded;

}
         public static void getShopName(){
		   System.out.println("get movies Names started");
		   System.out.println("list of movies are");
		   for(String ShopName : shopNames){
			   System.out.println(ShopName);
		   }
		

		}
		 public static boolean updateShopNameByName(String newShopname , String oldShopname){
			  boolean isShopNameUpdated = false;
			  for(int start =0; start<shopNames.length; start++){
				  if(shopNames[start] == oldShopname){
					  shopNames[start] = newShopname;
					  isShopNameUpdated = true;
				  }
			  }
			  return isShopNameUpdated;
		  } 
		  public static boolean deleteShopNameByName(String shopname){
			  boolean isShopNameDeleted = false;
			  int index , newIndex;
			  System.out.println("deleteShopNameByName started");
			  for(index=0 , newIndex=0; index<shopNames.length; index++){
				  String oldShopname = shopNames[index];
				  if(oldShopname != shopname){
					 shopNames [newIndex++] = oldShopname;
				isShopNameDeleted = true;
				  }
			  }
			  shopNames = Arrays.copyOf(shopNames , newIndex);
			  return isShopNameDeleted;
		  }
}