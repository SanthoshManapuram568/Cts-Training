package javaproject;

 class Example
 	{
	 static int n;
	 int a;
	 Example(){
		 System.out.println("inside constructor");
		
	 }
	 {
		 System.out.println("instance block");
		 System.out.println(n);   
	 }
static
{
	System.out.println("Static block intialized");
	n=20;
//	a=12;        a static block can use static members of that class only
}
 	}
public class SampleStaticBlock
	{
	
public static void main(String[] args) throws Exception
{
	//Explicit loading of class
	//Class.forName("javaproject.Example");
	System.out.println("main method");
	Example e = new Example();
	//Example e1  = new Example();
Example.n=10; //for loading a class by jvm
}
	}

