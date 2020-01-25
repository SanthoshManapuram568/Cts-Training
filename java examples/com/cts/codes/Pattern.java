package com.cts.codes;

public class Pattern {

public void pattern1(int n) {
	int i,j;
    		for(i=1;i<=n;i++)
    		{

	       		for(j=1;j<=n-i;j++)
        		{
     				System.out.printf(" ");
			} 	
	       		for(j=1;j<=i;j++)
        		{
     				System.out.printf("%d",j);
			} 			
	       		for(j=i-1;j>=1;j--)
        		{
     				System.out.printf("%d",j);
			} 			

        		System.out.println( );
    		}
}
    		
  public void pattern2(int n) {
    			int i,j;
    			 
    			for (i=1;i<=n;i++)
    		    {
    		        for (j=n;j>i;j--)
    		        {
    		            System.out.print(" ");
    		        }

    		        for (int k=1;k<=i;k++)
    		        {
    		            System.out.print(i + " ");
    		        }
    		        System.out.println();
    			     }
    		}
	}

/*public static void main(String []args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the no of lines");
int n=sc.nextInt();
Pattern p =new Pattern();

return p.n;
}*/
