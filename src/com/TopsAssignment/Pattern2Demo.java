package com.TopsAssignment;
/*
 * 1
 * 01
 * 101
 * 01010
 * 101010
 */
public class Pattern2Demo {
public static void main(String[] args) {
	for (int i=1; i<=5; i++) {
		for (int j=i; j>=1; j--) {
			System.out.print(j%2);
		}
	System.out.println();
		}
	
}
}
