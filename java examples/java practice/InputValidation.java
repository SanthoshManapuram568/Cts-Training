import java.util.Scanner;


public class InputValidation {
	
	 boolean validationName(String name) {
		
	if( ((name != null) && (!name.equals(""))  && (name.matches("^[a-zA-Z]*$")))) {
		System.out.println("your name is "+name);
	}
	
		
	return true; 
		    
	}
	 boolean validationAge(int age) {
		 
		return true;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter your name : ");
	    String name=scanner.next();
	    System.out.println("Enter your age : ");
	    int age=scanner.nextInt();
		InputValidation inputValidation = new InputValidation();
		inputValidation.validationName(name);
		inputValidation.validationAge(age);
		
		
	   
	}

}
