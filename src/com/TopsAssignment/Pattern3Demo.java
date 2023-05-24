package com.TopsAssignment;

import java.time.chrono.JapaneseChronology;

/*
 *    1
 *   2 2 
 *  3 3 3
 * 4 4 4 4
 */
public class Pattern3Demo {
public static void main(String[] args) {
	for (int i = 1; i <=4; i++) {//row
		for (int k =i; k<=4 ; k++) {
		System.out.print(" ");	
		}
		for (int j=i; j <2*i; j++) {//col
		System.out.print(" "+i);	
		}
		System.out.println();  
		
	}
	

	
}
}
