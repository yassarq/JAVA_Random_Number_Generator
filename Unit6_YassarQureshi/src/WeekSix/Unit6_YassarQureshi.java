package WeekSix;

import java.util.Random;

//# Name:       Yassar Qureshi
//# Class:      CIS-2751
//# Assignment: Homework 6 (dice)
//# File:       Unit6_YassarQureshi.java
//# Purpose:    Random Number generator (dice count, total and iteration)

public class Unit6_YassarQureshi {
	public static void main(String[] args) {
		
		Random dice1 = new Random(); // create Random generator for dice 1
		Random dice2 = new Random(); // create Random generator for dice 2
		// declare integer variables
		int counter; 
		int howManyRoles = 10000; // initialize how many times to role the set of dice 1 and 2
		int sides = 6; // greatest value for each dice
		// create a for loop that iterates how many times both dice rolled displaying each value
		for(counter=0; counter < howManyRoles; ++counter) {
			
		int rollNumber = counter + 1; // count the number of times the dice 1 and 2 are rolled
		
		int x = dice1.nextInt(sides); // random up to 5 and assigns it to x 
		++x; //increments all number from 0 to 5 by 1 making it 1 to 6
		System.out.println("On Roll number " +rollNumber + " Dice 1 rolled a " +x); // print out the value from 1 to 6 plus current total times rolled so far
		
		int y = dice2.nextInt(sides); // random up to 5 and assigns it to y 
		++y; //increments all number from 0 to 5 by 1 making it 1 to 6
		System.out.println("On Roll number " +rollNumber + " Dice 2 rolled a " +y); // print out the value from 1 to 6 plus current total times rolled so far
		
		int rollTotal = x + y; 
		System.out.println("The total rolled is: " + rollTotal); // add Dice 1 and Dice 2 rolls
		
		System.out.println(""); // space between each set
		}
		// display total times dice set rolled at the end
		System.out.println("The dice set was rolled a total of " + howManyRoles + " times");
	}
}
