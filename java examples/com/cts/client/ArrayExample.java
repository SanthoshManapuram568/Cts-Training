package com.cts.client;

import java.util.Scanner;

import com.cts.codes.Array;

public class ArrayExample {

	 public static void main(String[] args) 
	    {
	        int n, sum = 0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int array1[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            array1[i] = s.nextInt();}
	        
		   Array arr = new Array();
		    // Calling getMin() method for getting min value
		 int min = arr.getMin(array1);
		//    System.out.println("Minimum Value is: "+min);
		  }
}
