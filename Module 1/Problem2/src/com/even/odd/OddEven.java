/**
 * 
 */
package com.even.odd;

import java.util.Scanner;

//Problem statement: 2.Check the Number is even or odd.

/**
 * @author Yadgire_7
 *
 */
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println("the number is even");
		else
			System.out.println("the number is odd");
	}

}
