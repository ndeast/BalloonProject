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

	void setColor(String newerColor) {
		color = newerColor;
	}

	void setSize(int newerSize) {
		size = newerSize;
	}

	void setInflation(boolean newerInflation) {
		inflated = newerInflation;
	}
}