// Addition program that displays the sum of two numbers
package com.chapter2;

import java.util.Scanner; // import class Scanner

public class Addition {


	public static void main(String[] args) {
		Scanner input = new Scanner( System.in ); // create scanner to obtain input get name 'input' 
		
		int number1, 
		number2, 
		sum; // create variable
		
		System.out.print("Enter First Number : ");
		number1 = input.nextInt(); // read first number by user send
		
		System.out.print("Enter Second Number Number : ");
		number2 = input.nextInt(); // read second number by user send
		
		sum = number1 + number2;
		
		System.out.print("Sum is "+ sum); //display sum by print
		System.out.printf("Sum is %d", sum); // Display sum by printf
		
	} //end class main

} //end class addition
