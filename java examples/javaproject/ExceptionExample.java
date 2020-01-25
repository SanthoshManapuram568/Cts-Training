package javaproject;

public class ExceptionExample {
	static void fun() {
		try{
		int arr[] =new int[5];
		int a =10;
		int b=2;
		int c=a/b;
		try{
			arr[8]=20;
		}
		catch(ArrayIndexOutOfBoundsException aob) {
			System.out.println("arrayIndex");
		}
		}
		
		catch(ArithmeticException ae) {
			System.out.println("arithmaticexception");
		}
		
		catch(Exception e) {
			System.out.println("all exception");
		}
	}
	public static void main(String [] args) {
		
		fun();
		
	}
}

