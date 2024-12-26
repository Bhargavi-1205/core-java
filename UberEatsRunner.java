class UberEatsRunner{
         
		 public static void main(String[] args){
		 String items = "Ghee rice";
		    double pricewithQuantity = UberEats.search(items , 4);
			System.out.println("The price of "+ items +" is"+pricewithQuantity);
		}
		}