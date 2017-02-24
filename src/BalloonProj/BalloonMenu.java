package BalloonProj;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class BalloonMenu {

	private static BalloonTest bClass = new BalloonTest();
    private static ArrayList<Balloon> balloons = bClass.balloonArray();
	private static Scanner fnput = new Scanner(System.in);
	private static int choice;
	private static int killChoice=0;
	private static int inflateChoice=0;
	
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

            // Get the user input and convert to upper case
            	choice = fnput.nextInt();

            // Switch based on the option
            switch (choice) {
                // Create a new Balloon if ArrayList is not full
                case 1:
                	boolean arrayFull = BalloonTest.isArrayFull(balloons);
                	if(arrayFull)
                	{
                		Balloon BalloonNew = BalloonTest.balloonCreator();
                        balloons.add(BalloonNew);
                	}
                	else 
                	{
                		System.out.println("Sorry you already have your 5 balloons!");
                	}
                    break;

                // List all of the created balloons from the ArrayList
                case 2:
                    for(int i=0;i<balloons.size();i++)
                    {
                    	System.out.println("\nBalloon " + (i+1) + BalloonTest.toString(balloons.get(i)));
                    }
                    break;

                // Inflate a specific balloon
                case 3:	
                	//ensure that there are any balloons in the array
                	if((balloons.size() >= 1) && (balloons.size() <= BalloonTest.getMaxArraySize()))
                	{	
                		System.out.println("Which Number Balloon would you like to inflate?");
                		
                		//Try to receive valid integer input within size of array otherwise catch exception
                		try 
                		{
                			//capture input
                			inflateChoice = fnput.nextInt();
                			//testing if input is a valid int
                            if (1 <= inflateChoice && inflateChoice <= BalloonTest.getMaxArraySize()) 
                            {
                            	inflateChoice--;
                            	//if balloon exists in array
                            	if(BalloonTest.isValidBalloon(balloons.get(inflateChoice), balloons))
        	                	{	
                            		//if balloon is not inflated 
        	                		if(!BalloonTest.isBalloonInflated(balloons, (inflateChoice)))
        	                		{
        	                			//inflate balloon
        	                			BalloonTest.inflateBalloon(balloons, inflateChoice);
        	                		}
        	                		else
        	                		{
        	                			System.out.println("Balloon is already inflated!");
        	                			break;
        	                		}
        	                	}
                            } 
                            else 
                            {
                                System.out.println("Please enter a valid value");
                            }
                        } 
                		//catch invalid input from scanner
                		catch (InputMismatchException e) 
                		{
                            System.out.println("Input was not a valid number");
                            //clear/reset scanner to be ready to receive input again
                            fnput.next();
                        }
                	} 
                	else
                	{
                		System.out.println("There are no Balloons left to inflate");
                	}
                    break;

                // Destroy a specific balloon
                case 4:
                	//ensure that the ArrayList contains any balloons at all
                	if((balloons.size() >= 1) && (balloons.size() <= BalloonTest.getMaxArraySize()))
                	{	
                		System.out.println("Which Number Balloon would you like to destroy?");
                		
                		//Try to receive valid integer input within size of array otherwise catch exception
                		try 
                		{
                			//capture input
                			killChoice = fnput.nextInt();
                			//test if int is within valid size
                            if (1 <= killChoice && killChoice <= BalloonTest.getMaxArraySize()) 
                            {
                            	//value is stepped back so that 1 = 0 in array
                            	killChoice--;
                            	//if balloon is found in array
                            	if(BalloonTest.isValidBalloon(balloons.get(killChoice), balloons))
        	                	{
                            		//remove balloon from array
        	                		BalloonTest.destroyBalloon(balloons, (killChoice));
        	                	}
                            } 
                            else 
                            {
                                System.out.println("Please enter a valid value");
                            }
                        } 
                		catch (InputMismatchException e) 
                		{
                            System.out.println("Input was not a valid number");
                            fnput.next();
                        }
                	} 
                	else
                	{
                		System.out.println("There are no Balloons left to destroy");
                	}        		
                    break;

                // Print out the current number of balloons in the balloons array
                case 5:
                    System.out.println("You currently have: " + balloons.size() + " balloons created\n");
                    break;
                
                //Quit out of the menu
                case 6:
                    break;    

                default:
                    System.out.println("Option " + choice + " is not available");              
            }
        } while (choice != 6);
        System.out.printf("Thanks for visiting the Party World Balloon Generator Hotline WebApp SaaS");
	}
}