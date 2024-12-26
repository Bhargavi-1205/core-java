1Ans-Programming language provides the syntax and semantics.
     Scripting language gives short, simple set of instructions.
2Ans-These are platform dependent
 JVM
 *It provides runtime environment.
 *It loads the bytecode.
 *It verifies the bytecode.
 *It executes the bytecode.
 JRE-It is the combination of JVM and Set of libraries.
     It physically exists.
	 It is minimum required to execute the bytecode.
 JDK-It is the combination of JRE and development tools[javadocs,compiler,debugger etc]
3Ans-Java is an object oriented programming language.Since it represent real-world entities and encapsulate 
both data and behavoiur it is object oriented language.
java is platform Independent-the reason for this is it can be "write once run anywhere".Java source code is compiled into 
bytecode , which is platform-neutral. This bytecode can be executed on any platform that has a JVM(Java Virtual Machine) 
compatible with the bytecode.
4Ans-The featues of java are:-
      *It is Platform independent.
	  *Robust
	  *object oriented
	  *portable
	  *security
	  *Distributed computing
	  *architectural-neutral
5Ans-Datatype - used to represent what type of data is created for variable/ref/registered area.
      There are two different types 
	  *Primitive datatypes
	  *Non-primitive datatypes
	  Primitive datatypes          Non-primitive datatypes
	    int  - 4bytes  -  0        string- default value null
        byte -  1 byte - 0         Array-default value  nulletc
        short - 2bytes-0
        long -8bytes-0L
      double-8bytes-0.0f
       float-4bytes-0.0d
     boolen -1 bit-false
     char- 1 byte-'|u0000'   
6Ans-Variable-Registered area allocated on the javamemory so that it can hold value.
    Types of variables are:-
    *static variables [inside class out of main]
    *non static variables [instance]
    *local variables -life limited to main [inside main class]
    * parameters
7Ans-public - <access specifier> static-<keyword> void-<returntype> main-<method name> them parameters;
8Ans-Method- bolck of code used to perform some functionality.
9Ans- It is to access the file
      It belongs version html5
10Ans-<!Doctype html>
      <html>
	  <head>
	  <title> story </title>
	  </head>
	  <body> 
	  <h4> The story of thirsty crow and water</h4>
	  <p> Once upon a time there was a crow and it was feeling very thirsty.
	  Then it saw a pot which was containing water inside and it felt sat that it was not able to drink that then it brougth
	  stones and added into the pot one by one then thev water camne up it drank and ran away happily </p>
	  <h6>The story of thirsty crow and water </h6>
	  <p>Once upon a time there was a crow and it was feeling very thirsty.
	  Then it saw a pot which was containing water inside and it felt sat that it was not able to drink that then it brougth
	  stones and added into the pot one by one then thev water camne up it drank and ran away happily</p>
	  </body>
	  </html>
11Ans-Array-It is a container which has group of similar type of data/value in a single reference.
              syntax = Datatype arrayVariable[] = {value1 , value2 , value3}.

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

 
	 
    