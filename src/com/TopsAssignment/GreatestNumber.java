package com.TopsAssignment;

import java.util.Scanner;

/*
 * W.A.J.P to Take three numbers from the user and print the greatest number
 */
public class GreatestNumber {
public static void main(String[] args) {
Scanner sc=new Scanner (System.in)	;
int a,b,c;

System.err.println("enter a:");
a=sc.nextInt();

System.out.println("enter b:");
b=sc.nextInt();

System.out.println("enter c:");
c=sc.nextInt();

if(a>b&&a>c) {
System.out.println("a is greater");
}
else if (b>a&&b>c) {
System.out.println("b is greater");	
}

else{
System.out.println("c is greater");	
}

}
}

