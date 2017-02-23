package BalloonProj;

import java.util.Scanner;
import java.util.ArrayList;

public class BalloonMenu {

	
	public static void mainMenu() {
		
		BalloonTest m1 = new BalloonTest();
	    ArrayList<Balloon> balloons = m1.balloonArray();
		Scanner fnput = new Scanner(System.in);
		int choice;
		
		System.out.println("Welcome to the Balloon Generator");
		do {
            // Prompt the user for a choice
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
                	if(balloons.size() != 5)
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
                	Balloon BalloonNew = BalloonTest.balloonCreator();
                	if(BalloonTest.isValidBalloon(BalloonNew, balloons))
                	
                    break;

                // Destroy a specific balloon
                case 4:
                   
                    break;

                // Print the current number of balloons
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
        System.out.printf("Thanks for visiting Party City");
        System.out.println(balloons.get(0).getColor());
		
		
		
		
		
		
		
		
		
	}
	
	
}
