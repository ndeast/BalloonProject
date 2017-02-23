package BalloonProj;

import java.util.Scanner;
import java.util.ArrayList;

public class BalloonTest {


//returns true if array is already filled with objects
public boolean isArrayFull(Balloon[] newBalloon) {	
	boolean isFull = true;
	for(Balloon s : newBalloon) {
	    if(s == null) {
	        isFull = false;
	        break;
	    }
	}
	return isFull;
}

//Test if chosen size for a balloon is valid
public static boolean isValidSize(int newSize) {
	boolean isValid = false;
	int[] validSizes = new int[] {6, 8, 10, 12};
			
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
	String[] validColors = new String[] {"RED", "BLUE", "GREEN", "YELLOW"};
	
	newColor = newColor.toUpperCase();
	
	for(int i=0;i<validColors.length;i++) {
		if(newColor.equals(validColors[i])) {
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
		"\nColor: " + newBalloon.getColor() + "\nInflated: " + newBalloon.getInflation() + "\n";
	
	return balloonString; 
}

//returns true if balloon object is inflated
public static boolean isBalloonInflated(Balloon newBalloon) {
	boolean isInflated;
	
	if(newBalloon.getInflation()) {
		isInflated = true;
	}
	else {
		isInflated = false;
	}
	return isInflated;
}

//returns true if new balloon object is not already in balloon array
public static boolean isValidBalloon(Balloon newBalloon, ArrayList<Balloon> balloonArray) {
	boolean isValid = false;
	for(int i = 0; i < balloonArray.size(); i++)
	{
		if(newBalloon != balloonArray.get(i))
		{
			isValid = false;
			break;
		}
		else
		{
			isValid = true;
		}
	}
	return isValid;
}

public static Balloon balloonCreator() {
	Scanner fnput = new Scanner(System.in);
	int size = 0;
	String color = "null";
	
	System.out.println("Please one of the following colors: ");
	System.out.println("\nRed, Blue, Green, Yellow: ");
	
	String newColor = fnput.next();
    if(isValidColor(newColor))
    {
    	color = newColor;
    }
    else
    {
    	System.out.println("Please enter a valid color!");
    }
    System.out.println("Please one of the following sizes: ");
	System.out.println("\n6, 8, 10, 12: ");
	
	int newSize = fnput.nextInt();
	
	if(isValidSize(newSize))
	{
		size = newSize;
	}
	else
	{
		System.out.println("Please enter a valid size!");
	}
	
	Balloon newBalloon = new Balloon(size, color, false);
	
	return newBalloon;
	
}

public ArrayList<Balloon> balloonArray() {
	ArrayList<Balloon> balloons = new ArrayList<Balloon>();	
return balloons;
}




}






























