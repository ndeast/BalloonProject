package BalloonProj;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BalloonMenuTest {

	private static Scanner gnput = new Scanner(System.in);
	private static int killChoice = 0;
	private static int inflateChoice = 0;

	public static void createNewBalloon(ArrayList<Balloon> balloonArray) {

		if (BalloonTest.isArrayFull(balloonArray)) {
			Balloon BalloonNew = BalloonTest.balloonCreator();
			balloonArray.add(BalloonNew);
		} else {
			System.out.println("Sorry you already have your 5 balloons!");
		}
	}

	public static void listCreatedBalloons(ArrayList<Balloon> balloonArray) {

		for (int i = 0; i < balloonArray.size(); i++) {
			System.out.println("\nBalloon " + (i + 1) + BalloonTest.toString(balloonArray.get(i)));
		}
	}

	public static void printCurrentAmount(ArrayList<Balloon> balloonArray) {
		System.out.println("You currently have: " + balloonArray.size() + " balloons created\n");

	}
	
	/** 
	 * The next 2 methods need to be cleaned up
	 * with their nested if's put into their own methods
	 * 
	 */
	
	public static void destroyBalloon(ArrayList<Balloon> balloonArray) {
		// ensure that the ArrayList contains any balloons at all
		if ((balloonArray.size() >= 1) && (balloonArray.size() <= BalloonTest.getMaxArraySize())) {
			System.out.println("Which Number Balloon would you like to destroy?");

			// Try to receive valid integer input within size of array otherwise
			// catch exception
			try {
				// capture input
				killChoice = gnput.nextInt();
				// test if integer is within valid size
				if (1 <= killChoice && killChoice <= balloonArray.size()) {
					// value is stepped back so that 1 = 0 in array
					killChoice--;
					// if balloon is found in array
					if (BalloonTest.isValidBalloon(balloonArray.get(killChoice), balloonArray)) {
						// remove balloon from array
						BalloonTest.destroyBalloon(balloonArray, (killChoice));
					}
				} else {
					System.out.println("Please enter a valid balloon");
				}
			} catch (InputMismatchException e) {
				System.out.println("Input was not a valid number");
				gnput.next();
			}
		} else {
			System.out.println("There are no Balloons left to destroy");
		}
	}

	public static void inflateBalloon(ArrayList<Balloon> balloonArray) {
		// ensure that there are any balloons in the array
		if ((balloonArray.size() >= 1) && (balloonArray.size() <= BalloonTest.getMaxArraySize())) {
			System.out.println("Which Number Balloon would you like to inflate?");

			// Try to receive valid integer input within size of array otherwise
			// catch exception
			try {
				// capture input
				inflateChoice = gnput.nextInt();
				// testing if input is a valid integer
				if (1 <= inflateChoice && inflateChoice <= BalloonTest.getMaxArraySize()) {
					inflateChoice--;
					// if balloon exists in array
					if (BalloonTest.isValidBalloon(balloonArray.get(inflateChoice), balloonArray)) {
						// if balloon is not inflated
						if (!BalloonTest.isBalloonInflated(balloonArray, (inflateChoice))) {
							// inflate balloon
							BalloonTest.inflateBalloon(balloonArray, inflateChoice);
						} else {
							System.out.println("Balloon is already inflated!");
						}
					}
				} else {
					System.out.println("Please enter a valid value");
				}
			}
			// catch invalid input from scanner
			catch (InputMismatchException e) {
				System.out.println("Input was not a valid number");
				// clear/reset scanner to be ready to receive input again
				gnput.next();
			}
		} else {
			System.out.println("There are no Balloons left to inflate");
		}

	}

}
