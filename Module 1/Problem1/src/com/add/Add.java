/**
 * 
 */
package com.add;

import java.util.Scanner;

// Problem statement: 1.Add two numbers using scanner.
/**
 * @author Yadgire_7
 *
 */
public class Add {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a=sc.nextInt();
		System.out.println("Enter the second number: ");
		int b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum = "+sum);

	}

}
