package com.TopsAssignment;

import java.util.Scanner;

public class SumOfArray {
public static void main(String[] args) {
	int[][] a=new int[3][3];
	int[][] b=new int[3][3];
	int[][] c=new int[3][3];
	
	Scanner SC = new Scanner(System.in);	
	for (int i = 0; i <3; i++) {
		for (int j = 0; j < 3; j++)
		{
			a[i][j]=j;
			System.out.print(" enter a["+i+"]["+j+"]:");
			a[i][j]=SC.nextInt();
		}	
	}
	for (int i = 0; i < c.length; i++) {
	for (int j = 0; j < c.length; j++) {
		
		
	a[i][j]=j;
	System.out.println(" enter b["+i+"]["+j+"]:");
	b[i][j]=SC.nextInt();
	}
	}
	
	System.out.println("sum of 2D Array");		
	for (int i = 0; i < c.length; i++) {
		for (int j = 0; j < c.length; j++) {
			
			c[i][j]=a[i][j]+b[i][j];
			System.out.print(" "+c[i][j]);
			
		}
		System.out.println();
}}}
