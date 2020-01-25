package com.cts.codes;

import java.util.Scanner;

public class Array {
	

	public static int getMin(int[] inputArray){ 
	    int minValue = inputArray[0]; 
	    int position =0;
	    for(int i=1;i<inputArray.length;i++){ 
	      if(inputArray[i] < minValue){ 
	        minValue = inputArray[i]; 
	        position=i;
	      } 
	    } 
	  //  System.out.println(minValue);
	    System.out.println(position);
	    return position; 
	 
	  } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
public void averageOfArrayMultiplesOfFive(int n) {
	int array1[] = new int[n];
	Scanner s = new Scanner(System.in);
    System.out.println("Enter all the elements:");
    for(int i = 0; i < n; i++)
    {
        array1[i] = s.nextInt();
    }
	int average = 0;
	int count=0;
	int sum=0;
	int length = array1.length;
	for(int i=0;i<=array1.length;i++) {
		
		if(array1[i]%5==0) {
			sum=sum+array1[i];
			count++;
		}
		
	}
	average =sum/count;
	
	//return average;
	System.out.println(average);*/
	
	
}

/*
public void arrayIndexPosition(int[] n) {
	int positon=0, min=0;
	int [] array1=n;
	for(int i=0;i<=array1.length;i++) {
		if(array1[i]<min) {
			min=array1[i];
			positon=i;
			//array1.findIndex(array1,min);
		}
	}
	System.out.println(positon);
	
}
}*//*
static void getMin(int arr[], int n) 
{ 
    int res = arr[0]; 
      
    for (int i = 1; i < n; i++) 
        res = Math.min(res, arr[i]); 
  //  return res; 
    for(int i = 0; i < n; i++)
    {
        array1[i] = s.nextInt();
    }
    int n1 = array1.length; 
    System.out.println( "Minimum element"
       + " of array: " + getMin(arr, n));
} */
