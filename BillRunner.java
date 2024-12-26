class BillRunner{

             public static void main (String args[]){
			 
			 Bill bill1= new Bill();
			 bill1.setBillId(1234);
			 int billId  = bill1.getBillId();
			 bill1.setBillAmount(789.00);
			 double billAmount = bill1.getBillAmount();
			 bill1.setBillName("Grocery Bill");
			 String billName = bill1.getBillName();
			 bill1.setBillAddress("Chintamani");
			 String billAddress = bill1.getBillAddress();
			 bill1.setBillPaid(true);
		     boolean isBillPaid = bill1.isBillPaid();
			 System.out.println("billId value is " +billId);
			 System.out.println("billAmount value is " +billAmount);
			 System.out.println("bill Name is "+billName);
			 System.out.println("bill Address is "+billAddress);
			 System.out.println("bill payment is"+isBillPaid);
			 }
}