package BalloonProj;

import java.util.Scanner;
import java.util.ArrayList;

public class BalloonTest {
private static final int maxArraySize = 5;
private static int[] validSizes = new int[] {6, 8, 10, 12};
private static String[] validColors = new String[] {"RED", "BLUE", "GREEN", "YELLOW"};
private static Scanner fnput = new Scanner(System.in);

//returns true if array is already filled with objects
public static boolean isArrayFull(ArrayList<Balloon> balloonArray) {	
	boolean isFull = false;
	//tests the ArrayList against the maximum value wanted for array
	if(balloonArray.size() != maxArraySize)
	{
		isFull = true;
	}
	else
	{
		isFull = false;
	}
	return isFull;	
}

//Test if chosen size for a balloon is valid
public static boolean isValidSize(int newSize) {
	boolean isValid = false;
			
	for(int i=0;i<validSizes.length;i++){
		if(newSize == validSizes[i]) {
			isValid = true;
			break;
		}
	}
	return isValid;
}

//Test if the chosen color for a balloon is valid
public static boolean isValidColor(String newColor) {
	boolean isValid = false;
	//sets user input to uppercase
	newColor = newColor.toUpperCase();
	
	for(int i=0;i<validColors.length;i++) 
	{
		//if selected color is valid input as compared to 
		//an array of strings
		if(newColor.equals(validColors[i])) 
		{
			isValid = true;
			break;
		}
		else
		{
			isValid = false;
		}
	}
	return isValid;
}

//Converts a balloon object into a string to print out
public static String toString(Balloon newBalloon){
	
	String balloonString = ":\nSize: " + newBalloon.getSize() +
		"\nColor: " + newBalloon.getColor() + "\nInflated: " + newBalloon.getInflation();
	
	return balloonString; 
}

//returns true if balloon object is inflated
public static boolean isBalloonInflated(ArrayList<Balloon> balloonArray, int index) {
	boolean isInflated = balloonArray.get(index).getInflation();

	return isInflated;
}

//returns true if new balloon object is already in balloon array
public static boolean isValidBalloon(Balloon newBalloon, ArrayList<Balloon> balloonArray) {
	boolean isValid = false;
	for(int i = 0; i < balloonArray.size(); i++)
	{
		if(newBalloon == balloonArray.get(i))
		{
			isValid = true;
			break;
		}
		else
		{
			isValid = false;
		}
	}
	return isValid;
}

//Menu to create a new balloon object
public static Balloon balloonCreator() {
	int size = 0;
	String color = "";
	do
	{
		System.out.println("Please enter one of the following colors: ");
		System.out.println("\nRed, Blue, Green, Yellow: ");
		
		//receive input
		String newColor = fnput.next();
		//test if user input is a valid color
	    if(isValidColor(newColor))
	    {
	    	color = newColor;
	    }
	    else
	    {
	    	System.out.println("Please enter a valid color!");
	    }
	  //repeat menu until a valid color is entered
	} while(!isValidColor(color));
	
	do
	{
	    System.out.println("Please enter one of the following sizes: ");
		System.out.println("\n6, 8, 10, 12: ");
		if(fnput.hasNextInt())
		{
			int newSize = fnput.nextInt();
			
			//test if size input is a valid size
			if(isValidSize(newSize))
			{
				size = newSize;
			}
			else
			{
				System.out.println("Please enter a valid size!");
			}
		}
		//repeat menu until valid input is received
	} while(!isValidSize(size));
	
	//create the balloon object from the received variables
	Balloon newBalloon = new Balloon(size, color, false);
	
	return newBalloon;	
}

//remove specific balloon from an ArrayList
public static void destroyBalloon(ArrayList <Balloon> newBArray, int killChoice) {
	
	newBArray.remove(killChoice);
	
	System.out.println("Balloon #" + (killChoice+1) + " has been destroyed");
}

//set the inflated boolean on a balloon object from an ArrayList
public static void inflateBalloon(ArrayList <Balloon> newBArray, int inflateChoice) {
	
	newBArray.get(inflateChoice).setInflation(true);
	
	System.out.println("Balloon #" + (inflateChoice+1) + " has been inflated");
}

//create a balloon arraylist
public ArrayList<Balloon> balloonArray() {
	ArrayList<Balloon> balloons = new ArrayList<Balloon>();	

	return balloons;
}

//get method for MaxArraySize
static int getMaxArraySize() {
	return maxArraySize;
}

}