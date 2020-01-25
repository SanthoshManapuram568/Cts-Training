package javaproject;

import java.io.*;
import java.util.*;

import com.example.InvalidAgeException;
public class MyAgePRo extends InvalidAgeException  {
public static void ageInput() throws NumberFormatException, IOException ,InvalidAgeException {
	int age;
	try {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter age");
	age =Integer.parseInt(bufferedReader.readLine());
	if(age<20||age>60)
	throw new InvalidAgeException();
	System.out.println("succesed");
	
}
	catch(InputMismatchException ch) {
		System.out.println("invalid format");
	}
	catch(InvalidAgeException e) {
		System.out.println("throws exception");
	}
}

public static void main(String[] args) throws IOException , InvalidAgeException {
ageInput();
}
}
