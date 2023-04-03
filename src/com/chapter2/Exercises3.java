/*
 * (Checker board Pattern of Asterisks) Write an application that 
 * displays a checker board pattern, as follows: [Exercises 2.27 On Page 68]
 */

package com.chapter2;

public class Exercises3 {

	public static void main(String[] args) {
		
//		for(int a = 1; a <= 16; a++) {
//			for( int b = 1; b<=16; b++) {
//				if ((a+b) % 2 == 0) 
//					System.out.print("*");
//				else
//					System.out.print(" ");
//			}
//			System.out.println();		
//		}
		
		for(int a = 1; a <= 8; a++) {
			if (a%2 == 0)
				System.out.println(" ********");
			else 
				System.out.println("********");
		}

	}

}
