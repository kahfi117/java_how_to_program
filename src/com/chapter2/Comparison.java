//Compare integers using if statements, relational operators and equality operators.
package com.chapter2;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); // create scanner to obtain input get name 'input' 
		
		int number1, number2; // make variable
		
		System.out.print("Enter First Integer : ");
		number1 = input.nextInt();
		
		System.out.print("Enter Second Intger : ");
		number2 = input.nextInt();
		
		if ( number1 == number2 )
			System.out.printf("%d == %d\n", number1, number2);
		
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		
		if (number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);

	}//end method main

}// end class Comparison
