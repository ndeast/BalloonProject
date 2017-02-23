package BalloonProj;

public class BalloonMain {

	public static void main(String[] args) {
		int test = 10;
		String testStr = "GREEN";
		boolean inflatedTest = true;
		boolean testBool;
		boolean testBoolStr;
		String testString;
		
		
		//testBool = BalloonTest.isValidSize(test); 
		//testBoolStr = BalloonTest.isValidColor(testStr);
		
		//System.out.println(testBool);
		//System.out.println(testBoolStr);
		
		Balloon Balloon1 = new Balloon(6, testStr, inflatedTest);
		Balloon Balloon2 = new Balloon(10, "RED", inflatedTest);
		Balloon Balloon3 = new Balloon(6, "BLUE", inflatedTest);
		Balloon Balloon4 = new Balloon(12, testStr, inflatedTest);
		Balloon testBalloon = new Balloon(10, "YELLOW", false);
		
		testString = BalloonTest.toString(Balloon1, 1);
		
		System.out.println(testString);
		
		testBool = BalloonTest.isValidBalloon(testBalloon);
		
		System.out.println(testBool);
		

	}

}
