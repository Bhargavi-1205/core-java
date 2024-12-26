class Bill{
               //Encapsulated class
         private int billId;
		 private double billAmount;
		 private String billName;
		 private String billAddress;
		 private boolean isBillPaid;
		  
		  public Bill(){
			  System.out.println("Bill cons invoked");
		  }
		 
		public void setBillAmount (double billAmount){
		        this.billAmount  = billAmount;
		}
		public double getBillAmount(){
		      return billAmount;
		}
        public void setBillId(int billId){
	               this.billId   = billId;
	   }
	    
	    public int getBillId(){
	           return billId;
			   
		}	
	    public void  setBillName(String billName){
		      this.billName = billName;
	   }
	    public String getBillName(){
		     return billName;
		   
	   }
	   public void setBillAddress(String billAddress ){
		   this.billAddress = billAddress;
		   
	   }
        public String getBillAddress(){
			return billAddress;
		}
		public void setBillPaid(boolean isBillPaid){
			this.isBillPaid = isBillPaid;
		}
		public boolean isBillPaid(){
			return isBillPaid;
		}
}