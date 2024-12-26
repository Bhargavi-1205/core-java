 import java.util.Arrays;
class BankNames{

        static String accountNames[] ={null , null ,null , null , null};
		static int index;

          public static boolean addAccountName(String AccountName)
		  {
		  System.out.println("addaccountNames started");
		  boolean isAccountNameAdded = false;
		  if(AccountName != null){
		  System.out.println("accountNames contain value...proceed to add");
		  accountNames[index] = AccountName;
		  index++;
		  isAccountNameAdded = true;
		  }
		  else{
		  System.out.println("accountNames is null");
		  }
		  System.out.println(" addaccountNames ended");
		  return isAccountNameAdded;

}
          public static void getAccountName(){
		   System.out.println("AccountName started");
		   System.out.println("list of AccountName are");
		   for(String AccountName : accountNames){
			   System.out.println(AccountName);
		   }
		

		}
		public static boolean updateAccountNameByName(String newAccountname , String oldAccountname){
		boolean isAccountNameUpdated = false;
		for(int start = 0; start<accountNames.length; start++){
			if(accountNames[start] ==  oldAccountname){
				    accountNames[start] =  newAccountname;
 					isAccountNameUpdated=true;
				}
			}
		return isAccountNameUpdated;
	}
	    public static boolean deleteAccountNameByName(String accountname){
			boolean isAccountNameDeleted = false;
			int index , newIndex;
			System.out.println("deleteAccountNameByName");
			for(index=0 , newIndex=0; index<accountNames.length; index++){
				String oldAccountname = accountNames[index];
			     if(oldAccountname != accountname){
					 accountNames[newIndex++] = oldAccountname;
				     isAccountNameDeleted =true;	 
				 }
			}
            accountNames = Arrays.copyOf(accountNames , newIndex);
			return isAccountNameDeleted;
		}
}