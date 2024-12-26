class ShoppingMallsRunner{
              public static void main(String[] see){
				   System.out.println("main started");
		      boolean isShopNameAdded = ShoppingMalls.addShopName("GO-pizza");
			  System.out.println("is shopNames added"+isShopNameAdded);
			  isShopNameAdded = ShoppingMalls.addShopName("Dominos");
			  System.out.println("is shopNames added"+isShopNameAdded);
			  isShopNameAdded = ShoppingMalls.addShopName("zara");
			  System.out.println("is shopNames added"+isShopNameAdded);
			  isShopNameAdded = ShoppingMalls.addShopName("west sides");
			  System.out.println("is shopNames added"+isShopNameAdded);
			  isShopNameAdded = ShoppingMalls.addShopName("sip and play");
			  System.out.println("is shopNames added"+isShopNameAdded);
			  ShoppingMalls.getShopName();
			  ShoppingMalls.updateShopNameByName(  "fashion wear" , "zara");
			  ShoppingMalls.getShopName();
			  ShoppingMalls.deleteShopNameByName("west sides");
			  ShoppingMalls.getShopName();
			   System.out.println("main ended");
     }
   }