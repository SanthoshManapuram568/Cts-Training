package com.cts.client;

import java.util.Scanner;
import com.cts.example.matrix.*;
public class MatrixUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MatrixOperations matrix=new MatrixOperations();
		matrix.initMatrix();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<=3;i++) {
		System.out.println("1.Display Matrix\n2.Check unit matrix or not\n3.find row additions\nPlease choose :");
		byte ch;
		ch= sc.nextByte();
		if(ch == 1 || ch == 2 || ch == 3) {
			switch(ch) {
				case 1: matrix.displayTheMatrix();
						break;
				case 2: boolean b=matrix.isUnitOrNot();
						System.out.println("The matrix is unit matrix ??  "+b);
						break;
				case 3: matrix.rowAddition();
						break;
			}
		}

	}
	}

}
