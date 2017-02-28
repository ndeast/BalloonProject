package BalloonProj;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BalloonMenu {

	private static BalloonTest bClass = new BalloonTest();
    private static ArrayList<Balloon> balloons = bClass.balloonArray();
	private static Scanner fnput = new Scanner(System.in);
	private static int choice;
	
	public static void mainMenu() {

		System.out.println("Welcome to the Balloon Generator");
		do {
            // Prompt the user for a choice
			System.out.println("\nPlease make a selection");
            System.out.println("(1) Create a new Balloon");
            System.out.println("(2) List all created Balloons");
            System.out.println("(3) Inflate a Balloon");
            System.out.println("(4) Destroy a Balloon");
            System.out.println("(5) Print the number of Balloons that exist");
            System.out.println("(6) Quit");
            System.out.print("Enter your choice: ");

            try 
    		{
    			//capture input
    			choice = fnput.nextInt();
            } 
    		//catch invalid input from scanner
    		catch (InputMismatchException e) 
    		{
                //clear/reset scanner to be ready to receive input again
                fnput.next();
            }

            // Switch based on the option
            switch (choice) {
                // Create a new Balloon if ArrayList is not full
                case 1:
                	BalloonMenuTest.createNewBalloon(balloons);
                    break;

                // List all of the created balloons from the ArrayList
                case 2:
                    BalloonMenuTest.listCreatedBalloons(balloons);
                    break;

                // Inflate a specific balloon
                case 3:	
                	BalloonMenuTest.inflateBalloon(balloons);
                    break;

                // Destroy a specific balloon
                case 4:
                	BalloonMenuTest.destroyBalloon(balloons);        		
                    break;

                // Print out the current number of balloons in the balloons array
                case 5:
                    BalloonMenuTest.printCurrentAmount(balloons);
                    break;
                
                //Quit out of the menu
                case 6:
                    break;    

                default:
                    System.out.println("\nOption is not available");              
            }
        } while (choice != 6);
        System.out.printf("Thanks for visiting Party Balloon Generator");
	}
}