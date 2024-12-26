class BlinkitNamesRunner{
              public static void main(String[] products){
				   System.out.println("main started");
		      boolean isProductNameAdded = BlinkitNames.addProductName("Dark Fantasy");
			  System.out.println("is BlinkitNames added :"+isProductNameAdded);
			  isProductNameAdded = BlinkitNames.addProductName("Hi-Fi");
			  System.out.println("is BlinkitNames added :"+isProductNameAdded);
			  isProductNameAdded = BlinkitNames.addProductName("sunfeast");
			  System.out.println("is BlinkitNames added :"+isProductNameAdded);
			  isProductNameAdded = BlinkitNames.addProductName("ParleG");
			  System.out.println("is BlinkitNames added :"+isProductNameAdded);
			  isProductNameAdded = BlinkitNames.addProductName("krack-jack");
			  System.out.println("is BlinkitNames added :"+isProductNameAdded);
			  BlinkitNames.getProductName();
			  BlinkitNames.updateProductNameByName("good day" ,"Hi-Fi");
			  BlinkitNames.getProductName();
			  BlinkitNames.deleteProductNameByName("ParleG");
			  BlinkitNames.getProductName();
			   System.out.println("main ended");
     }
   }