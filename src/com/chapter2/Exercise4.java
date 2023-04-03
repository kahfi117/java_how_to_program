/*
(Car-Pool Savings Calculator) Research several car-pooling websites. Create an application
that calculates your daily driving cost, so that you can estimate how much money could be saved by
car pooling, which also has other advantages such as reducing carbon emissions and reducing traffic
congestion. The application should input the following information and display the user’s cost per
day of driving to work:
a) Total miles driven per day.
b) Cost per gallon of gasoline.
c) Average miles per gallon.
d) Parking fees per day.
e) Tolls per day
*/
package com.chapter2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		float total_miles,
		gasoline_cost,
		average_miles,
		parking_fees,
		tolls;
		
		System.out.print("Total Miles Driven per Day = ");
		total_miles = input.nextInt();
		
		System.out.print("Cost per Gallon of Gasolline = ");
		gasoline_cost = input.nextInt();
		
		System.out.print("Average miles per galon = ");
		average_miles = input.nextInt();
		
		System.out.print("Parking Fees per day = ");
		parking_fees = input.nextInt();
		
		System.out.print("Tools Per day = ");
		tolls = input.nextInt();
		
		float total = ((total_miles/average_miles) * gasoline_cost) + parking_fees + tolls; // calculate total cost car pooling
		
		
		System.out.printf("Total Driving cost each day = %f", total);
		
	}

}
