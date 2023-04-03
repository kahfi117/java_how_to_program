/*
 * (Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below. [Exercises 2.31 on page 69 ]
 */
package com.chapter2;

public class Excersice2 {

	public static void main(String[] args) {
		System.out.println("number \t square \t cube");
		
		for(int a = 0; a <=10 ; a++) {
			int square = a * a;
			int cube = a * a * a;
			System.out.println(a + " \t " + square + " \t\t " + cube);
		}

	}

}
