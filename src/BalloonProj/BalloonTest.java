package BalloonProj;

public class BalloonTest {

	
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

public static boolean isValidColor(String newColor) {
	boolean isValid = false;
	String [] validColors = new String[] {"RED", "BLUE", "GREEN", "YELLOW"};
	
	for(int i=0;i<validColors.length;i++) {
		if(newColor == validColors[i]) {
			isValid = true;
			break;
		}
	}
	return isValid;
}

public static String toString(Balloon newBalloon, int a){
	
	String balloonString = "Balloon " + a + ":\nSize: " + newBalloon.getSize() +
		"\nColor: " + newBalloon.getColor() + "\nInflated: " + newBalloon.getInflation() + "\n";
	
	return balloonString; 
}

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

public static boolean isValidBalloon(Balloon newBalloon) {
	boolean isValid = false;
	
	if(newBalloon instanceof Balloon) {
		isValid = true;
	}
	else {
		isValid = false;
	}
	return isValid;
}


}





























