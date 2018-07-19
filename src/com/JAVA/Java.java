package com.JAVA;

import java.util.Scanner;

public class Java {

		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*//Swap two numbers
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+" "+b);*/

		
		
		/*//prime number
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int flag = 0;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				flag = 1;
				break;
			}
		}
		
		if(flag == 1) {
			System.out.println("not a prime number");
		}
		else {
			System.out.println("prime number");
		}*/
		
		
		
		/*//factorial
		Scanner in = new Scanner(System.in); 
		int num = in.nextInt();
		int fact = 1;
		
		for(int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		
		System.out.println(fact);*/
		
		
		
		/*//factorial recursion
		    static int Factorial(int num) {
		    if(num == 0){
		    	return 1;
		    }
		    else{
				return (num * Factorial(num - 1));
			}
		}
	
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			int num = in.nextInt();
			int fact = 1;
			
			fact = Java.Factorial(num);
			
			System.out.println(fact);
		}*/
	    	
	    	
	    	
	    	/*//fibonaccii series
	    	Scanner in = new Scanner(System.in);
	    	int a = in.nextInt();
	    	int b = in.nextInt();
	    	int c;
	    	
	    	System.out.println(a);
	    	System.out.println(b);
	    	
	    	for(int i = 1; i <= 10; i++) {
	    		c = a + b;
	    		a = b;
	    		b = c;
	    		
	    		System.out.println(c);		
	    	}*/
	    	
	    	
	    	
	    	/*//number reverse and palindrome number
	    	Scanner in = new Scanner(System.in);
	    	int num = in.nextInt();
	    	int revnum = 0;
	    	int rem;
	    	int copynum = num;
	    	
	    	while(num != 0) {
	    		rem = num % 10;
	    		revnum = revnum * 10 + rem;
	    		num = num / 10;
	    	}
	    	
	    	System.out.println(revnum);
	    	
	    	if (revnum == copynum) {
	    		System.out.println("palindrome");
	    	}
	    	else {
	    		System.out.println("not palindrome");
	    	}*/
	    	
	    	
	    	
	    	/*//armstrong number
	    	Scanner in = new Scanner(System.in);
	    	int num = in.nextInt();
	    	int arm = 0;
	    	int rem;
	    	int copynum = num;
	    	
	    	while(num != 0) {
	    		rem = num % 10;
	    		arm = arm + (rem * rem * rem);
	    		num = num / 10;
	    	}
	    	
	    	System.out.println(arm);
	    	
	    	if(arm == copynum) {
	    		System.out.println("armstrong number");
	    	}
	    	else {
	    		System.out.println("not armstrong number");
	    	}*/
	    	
	    	
	    	
	    	/*//string reverse and palindrome
	    	String name = "Madam";
	    	String revname = "";
	    	String copyname = name;
	    	
	    	int length = name.length();
	    	
	    	for(int i = length-1; i >= 0; i--) {
	    		revname = revname + name.charAt(i);
	    	}
	    	
	    	System.out.println(revname);
	    	
	    	if(revname.equalsIgnoreCase(copyname)) {
	    		System.out.println("palindrome string");
	    	}
	    	else {
	    		System.out.println("not palindrome string");
	    	}*/
	    	
	    	
	    	
	    /*	//custom exception
			static void validate(int age) {
				if(age < 18) {
					throw new ArithmeticException("not valid");
				}
				else {
					System.out.println("welcome to vote");
				}
			}
	    	public static void main(String[] args) {
	    		Java.validate(13);
	    		
	    		System.out.println("rest of the code");
	    	}*/
	    	
	    	
	    	
	}

}
