package com.TopsAssignment;
/*
 * 
 *                 *  
 *               * * *
 *             * * * * *
 *               * * *     
 *                 *
 *                 
 */
public class Pattern4Demo {
public static void main(String[] args) {

	for (int i = 1; i <=3; i++) {//row
		for (int k =i; k<=3 ; k++) {
		System.out.print(" ");	
		}
		for (int j=1; j <2*i; j++) {//col
		System.out.print("*");	
		}
		System.out.println();  
		
	}
	
	for (int i =2 ; i>=1; i--) {//row
		for (int k =3; k>=i ; k--) {
		System.out.print(" ");	
		}
		for (int j=2*i; j>1; j--) {//col
		System.out.print("*");	
		}
		System.out.println();  
		
	}
	
}
}
