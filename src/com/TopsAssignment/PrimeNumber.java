package com.TopsAssignment;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

/*
 * W.A.J.P to check given number is Prime or not
 */
public class PrimeNumber {
public static void main(String[] args) {
	int number;
	boolean isPrime=true;
	Scanner sc=new Scanner(System .in);
	System.out.println("enter the numbur to check for prime or not");
	number=sc.nextInt();
	sc.close();
	
	if(number < 1)
	System.out.println("number needs to greater than 1");
	
	else if(number==1)
	System.out.println("1 is neigher prime nor composite");
	
	else {
		for (int i = 2; i <=(number/2); i++) {
			if ((number%i)==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime)	
		System.out.printf("%d is a Prime ",number);
		else 
			System.out.printf("%d is a not prime number ",number);
	}
}
















}
