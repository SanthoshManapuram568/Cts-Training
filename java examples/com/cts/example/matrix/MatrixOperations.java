package com.cts.example.matrix;

import java.util.Scanner;

public class MatrixOperations {
	public int arr[][];
	public int rows,colums;
	
	public void initMatrix() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" no of rows :");
		rows = sc.nextByte();
		System.out.println("no of columns:");
		colums = sc.nextByte();
		arr = new int[rows][colums];
		for(byte i=0;i<rows;i++) {
			System.out.println(" row-"+(i+1)+" :");
			for(byte j=0;j<colums;j++) {
				System.out.println("column-"+(j+1)+" :");
				arr[i][j]=sc.nextInt();
			}
		}
		
	}
	
	public void displayTheMatrix() {
		
		for(int i=0;i<this.rows;i++) {
			for(int j=0;j<colums;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();	
		}
		
	}
	
	public boolean isUnitOrNot() {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colums;j++) {
				if(arr[i][j] != 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public void rowAddition() {
		
		for(int i=0;i<rows;i++) {
			int sum=0;
			for(int j=0;j<colums;j++) {
				sum =sum + arr[i][j];
			}
			System.out.println(sum);
		}
	}


}
