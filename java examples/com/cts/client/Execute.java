package com.cts.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cts.codes.*;
public class Execute {
	
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter type of operation");
		System.out.println("1.Pattern");
		System.out.println("2.Calculate");
		int choice = Integer.parseInt(bufferedReader.readLine());
		
			for(int i=1;i<3;i++) {
		
		if(choice==1) {
			System.out.println("enter type of pattern");
			System.out.println("1.eqilateral type1");
			System.out.println("2.equilateral type 2");
			int choice1 = Integer.parseInt(bufferedReader.readLine());
			System.out.println("enter number of rows");
			int n =Integer.parseInt(bufferedReader.readLine());
	Pattern pattern= new Pattern();
	switch(choice1) {
	case 1 : pattern = new Pattern();
	pattern.pattern1(n);
	System.out.println(" ");
	System.out.println("**********************");
			 break;
	case 2: pattern = new Pattern();
	System.out.println(" ");
	System.out.println("**********************");
	pattern.pattern2(n);
	}
		}
		}
		
	
	for(int i=1;i<=3;i++) {
		if(choice==2)	{
		System.out.println("enter type of calculation");
		System.out.println("1.number to word");
		System.out.println("2.number expansion");
		System.out.println("3.number reverse");
		int choice2 = Integer.parseInt(bufferedReader.readLine());
		System.out.println("enter number to be modified");
		int num =Integer.parseInt(bufferedReader.readLine());
		Calculate calculate = new Calculate();
		switch(choice2) {
	case 1 :  calculate = new Calculate();
			calculate.numberToWord(num);
			System.out.println(" ");
			System.out.println("**********************");
			break;
	case 2 :  calculate = new Calculate();
			calculate.expansion(num);
			System.out.println(" ");
			System.out.println("**********************");
			break;
	case 3 :  calculate = new Calculate();
			System.out.println(calculate.reverse(num));
			System.out.println("**********************");
			System.out.println(" ");
			
			break;
			 }

	}
		
}

}}