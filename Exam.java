class Exam{
public static void main(String[] test){
	int price[] = {225,337,179,217,83,435,313,420,108,120,101,143,90,35};
	for(int i=0;i<price.length;i++){
		int pri = price[i];
		System.out.println(pri);
		
	}
	System.out.println("---------------");
	for(int i=0;i<price.length;i++){
		
		int pri = price[i];
		if(pri<225){
		System.out.println(pri);	
		}
	}
	System.out.println("---------------");
	for(int i=0;i<price.length;i++){
		int pri = price[i];
		if(pri>=420){
		System.out.println(pri+20);	
		}
	}
	System.out.println("---------------");
	for(int i=0;i<price.length;i++){
		int pri = price[i];
		if(pri<=90){
		System.out.println(pri*50);	
		}
	}
	System.out.println("---------------");
	for(int i=0;i<price.length;i++){
		int pri = price[i];
		if(pri==420){
		System.out.println(pri-277);	
		}
	}
}
}