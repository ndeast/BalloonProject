package BalloonProj;

public class Balloon {
	private int size = 6;
	private String color = "red";
	private boolean inflated = false;
	
	
	Balloon(int newSize, String newColor, boolean newInflated) {	
		size = newSize;
		color = newColor;
		inflated = newInflated;
	}
	
	Balloon() {
		
	}
	
	int getSize() {
		return size;
	}
	
	boolean getInflation() {
		return inflated;
	}
	
	String getColor() {
		return color;
	}
	
	void setColor(String newColor) {
		color = newColor;
	}
	
	void setSize(int newSize) {
		size = newSize;
	}
	
	void setInflation(boolean newInflation) {
		inflated = newInflation;
	}

}