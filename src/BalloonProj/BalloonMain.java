package BalloonProj;


public class BalloonMain {

	public static void main(String[] args) {
		int test = 10;
		String testStr = "GREEN";
		boolean inflatedTest = true;
		boolean testBool;
		boolean testBoolStr;
		String testString;
		Balloon[] balloonArray1 = new Balloon[5];
		String tester = "red";
		
		
		//testBool = BalloonTest.isValidSize(test); 
		//testBoolStr = BalloonTest.isValidColor(testStr);
		
		//System.out.println(testBool);
		//System.out.println(testBoolStr);
		
		Balloon Balloon1 = new Balloon(6, testStr, inflatedTest);
		Balloon Balloon2 = new Balloon(10, "RED", inflatedTest);
		Balloon Balloon3 = new Balloon(6, "BLUE", inflatedTest);
		Balloon Balloon4 = new Balloon(12, testStr, inflatedTest);
		Balloon testBalloon = new Balloon(10, "YELLOW", false);
		
		testString = BalloonTest.toString(Balloon1);
		
		System.out.println(testString);
		
		for(int i = 0; i<balloonArray1.length;i++){
			balloonArray1[i] = new Balloon(6, "RED", true);
		}
		
		System.out.println(BalloonTest.toString(balloonArray1[1]));
		
		//System.out.println(BalloonTest.isValidBalloon(Balloon1, balloonArray1));
		
		//alloon BalloonNew = BalloonTest.balloonCreator();
		
		//System.out.println(BalloonTest.toString(BalloonNew));
		
		//tester = tester.toUpperCase();
		
		//System.out.println(BalloonTest.isValidColor(tester));
		
		
		
		//testBool = BalloonTest.isValidBalloon(testBalloon);
		
		//System.out.println(testBool);
		
		BalloonMenu.mainMenu();

	}

}
