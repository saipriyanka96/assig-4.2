package ABC;
//Package is a grouping of related types providing access protection and name 
//space management
import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions
public class Pattern {
//public keyword is used in the declaration of a class,method or field;public classes,method and fields can be accessed by the members of any class.
//class defines instance and class fields,methods and inner classes as well as specifying the interfaces the class implements and the immediate superclass of the class
//Type casting is a class name
			
	public static void main(String[] args) {
//Java Program processing starts from the main() method which is a mandatory part of every program 		
//static used to prepare a field,method or inner classes as a class field.
//void is used to define the return type of the method
//String[] args is actually an array of java.lang.String type and it's name is args here
//String is predefined class name 
//args is name of the array
// TODO Auto-generated method stub
		int j;
		 Scanner sc=new Scanner(System.in);
		//to scan values which we initialize
		 System.out.print("Enter N:\n");
		//System is a final class in java.lang package
			//out is a static member field of system class and it's type PrintStream
			//println is a method of PrintStream class and it means print in next line
			//Inside the brackets is value which to be printed		
			
		 int n=sc.nextInt();
		//scans next token of the input as int
		 for(int i=1;i<=n;i++)
		{
			for (j=1;j<=(n+1)-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				if(j<=i)
					System.out.print((char)(char)(j+64)+" ");//for printing values and parallely
			//looking into ASCII code and convert them into given alphabets
								else
									System.out.print((char)(char)(2*i-j+64)+" ");//
									System.out.println();
						}
		
		 for(int i=n-1;i>=1;i--)
			{
				for (j=1;j<=(n+1)-i;j++)
					System.out.print(" ");
					for(j=1;j<=2*i-1;j++)
				//here it will take the value and jumps into the next line		
					if(j<=i)
						System.out.print((char)(char)(j+64)+" ");
					else
				
						System.out.print((char)(char)(2*i-j+64)+" ");
						System.out.println();
			}	
	}	 
}	