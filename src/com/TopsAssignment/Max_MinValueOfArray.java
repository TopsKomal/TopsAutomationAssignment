package com.TopsAssignment;

import java.util.Scanner;

/*
 * WAP to find the maximum and minimum value of an array.
 */
public class Max_MinValueOfArray {
public static void main(String[] args) {
	int[] a=new int[5];
	Scanner sc=new Scanner(System.in);
	for (int i= 0; i < args.length; i++) {
		System.out.println("enter a no:");
		a[i]=sc.nextInt();
	}
		int max=a[0];
		int avg;
		for (int i = 0; i < a.length; i++) {
			max=Math.max(max,a[i]);
			
		}
		System.out.println("max is:"+max);
		
		
}
}
