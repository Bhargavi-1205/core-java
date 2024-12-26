class BankAccount{
            
			public static void main(String[] seva){
			 boolean ref = createAccount("bhargavi" , "gowda" , 23 , 8296434761L , 
			 223547771667L , 12345678L , "bengaluru" , "bengaluru" ,
			 "chintamani" , "savings" , "NarayanaSwamy" , "Bagyamma" , "chintamani" , "female");
			 System.out.println("Is account created" +ref);
			 
			 
			 }
			public static boolean createAccount(String firstName , String lastName , int age,
			long phno, long adhaarNo ,long panNO , String currentAddress , 
			String currentAddressSameAsPermanent, String permanentAddress , 
			String accountType , String fatherName , String motherName , String branch , String gender){
		m.out.println("The firstName is"+ firstName);
			System.out.println("The lastName is"+ lastName);
			System.out.println("The age is"+ age);
			System.out.println("The phno is"+ phno);
			System.out.println("The adhaarNois"+ adhaarNo);
			System.out.println("The panNO is"+ panNO);
			System.out.println("The currentAddress same"+ currentAddress);
			System.out.println("The currentAddressSameAsPermanent is"+ currentAddressSameAsPermanent);
			System.out.println("ThepermanentAddressis"+ permanentAddress);
			System.out.println("The accountType is"+ accountType);
			System.out.println("The fatherName is "+ fatherName);
			System.out.println("The motherName is"+ motherName);
			System.out.println("The branchis"+branch);
           System.out.println("The Gender is "+gender);
			return true;
			}




      }