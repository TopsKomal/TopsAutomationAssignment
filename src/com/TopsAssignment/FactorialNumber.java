package com.TopsAssignment;
/*
 * W.A.J.P to find factorial for Given Number.
 * n!=n*(n-1)*(n-2)*(n-3)*.......
 */
public class FactorialNumber {
public static void main(String[] args) {
int n=4,o=1;

for (int i = 1; i <=n; i++) {
	System.out.println(i);
	o=o*i;
}
	System.out.println("output :"+o);		
}
}
