/*
 Write Java statements that accomplish each of the following tasks:
	a) Display the message "Enter an integer: ", leaving the cursor on the same line.
	b) Assign the product of variables b and c to variable a.
	c) Use a comment to state that a program performs a sample payroll calculation.
 */

package com.chapter2;

import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
		Scanner input = new Scanner( System.in );
		
		int a, b , c = 0;
		
		System.out.print("Enter an Integer : "); // A
		b = input.nextInt();
		
		a = b * c; //B

	}

}
