

public class JavaExamples {

	void primeOrNot() {
		int number =12;
		for(int i=2;i<number/2;i++) {
			if(number%2==0) {
				System.out.println("its not a prime");
				break;
				}
			else {
			System.out.println("its prime");
			
			break;
			}
			
			}
		System.out.println("\n");
	}
	void fibnocci() {
	 
    int number=10, value1 = 0, value2 = 1;
    
  /*  System.out.println("Enter Number");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    */
    for (int i = 1; i <= number; ++i)
    {
        int sum = value1+value2;
        value1=value2;
        value2=sum;
        System.out.print(value1 + " ");   
    }
    System.out.println("\n");
	}
	
	 void pattern1() {
		 
		 int rows=4;
		 
		 for(int i = 1; i <= rows; ++i) {
	            for(int j = 1; j <= i; ++j) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
		 System.out.println("\n");
		 
			for(int i=0;i<=rows;++i) {
				for(int j=1;j<=i;++j) {
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("\n");
			for(int i=rows;i>=1;--i) {
				for(int j=1;j<=i;++j) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			System.out.println("\n");
			
			for(int i=rows;i>=1;--i) {
				for(int j=1;j<=i;++j) {
					System.out.print(j+" ");
				}				
				System.out.println();
			}
			System.out.println("\n");
			
			
			
			System.out.println("Equilateral");
			
			 for (int i=0; i<rows; i++) {  
		            for (int j=rows-i; j>1; j--){ 
				         System.out.print(" "); 
		            }
		            for (int j=0; j<=i; j++ )  {
		                System.out.print("* "); 
		            } 
		            	System.out.println(); 
		        } 
		    
	 }
	 
	 void palindromeOrNot() {
		 int number=121;
		 
		 int orginalNumber=number;
		 
		 int reverseNumber=0;
		 int reminder;
		 while(number!=0)
		 {
			reminder= number%10;
			reverseNumber=reverseNumber*10+reminder;
			number=number/10;
		 }
		// System.out.println(reverseNumber);
		// System.out.println(number);
		 if(orginalNumber==reverseNumber) {
			 System.out.println("palindrome");
		 }
		 else {
			 System.out.println("not palindrome");
		 }
		 
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		JavaExamples operator = new JavaExamples();
		operator.primeOrNot();
		operator.fibnocci();
		operator.pattern1();
		operator.palindromeOrNot();
		
	}

}
