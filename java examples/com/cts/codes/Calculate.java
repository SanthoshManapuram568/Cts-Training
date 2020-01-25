package com.cts.codes;

public class Calculate {
	
	public void numberToWord(int number) {
		
		int div=0,temp,i=1,count=0;
		temp=number ;
		while(temp>10) {
		temp =temp/10;
		i *= 10;
		count++;
		}
		//System.out.println(temp+" "+i+" "+number);
		while(count >=0) {
		div=number/i;
		number = number%i;
		switch(div) {
		case 0:System.out.print("zero");
		break;
		case 1:System.out.print("one");
		break;
		case 2:System.out.print("two");
		break;
		case 3:System.out.print("three");
		break;
		case 4:System.out.print("four");
		break;
		case 5:System.out.print("five");
		break;
		case 6:System.out.print("six");
		break;
		case 7:System.out.print("seven");
		break;
		case 8:System.out.print("eight");
		break;
		default:System.out.print("nine");
		break;
		}
		System.out.print(" ");
		i=i/10;
		count--;

	}
	}
	public void expansion(int number) {
		int div=0,temp,i=1,count=0;
		temp=number ;
		while(temp>10) {
			temp =temp/10;
			i *= 10;
			count++;
		}
		while(count >=0) {
			div=number/i;
			number = number%i;
			if(count >= 1)
				System.out.print(div+"*"+i+"+");
			else
				System.out.print(div);
			count--;
			i=i/10;
	}
	}
	
		public int reverse(int num) {
		int reversed = 0;
	    while(num != 0) {
	        int digit = num % 10;
	        reversed = reversed * 10 + digit;
	        num /= 10;
	    }
	  return reversed; 
	}
}
