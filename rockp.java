
package rockpapers;
import java.util.*;
import java.util.Scanner;
public class rockp {
	public static void main (String[]args) {
		//getComputer();
		//userAnswer();
		play();
	}
	public static String getComputer() {
		Random rand = new Random ();
		int compChoice = rand.nextInt(3);
		String rps[] = {"rock", "paper", "scissors"};
		System.out.println ("computer answer was " + rps[compChoice]);
		return rps[compChoice];
//inside brackets is iterating

}
	
	public static String userAnswer() {
		 
		    Scanner myObj = new Scanner(System.in);
		    System.out.println("Choose rock, paper, or scissors"); 
		    String userChoice = myObj.nextLine();   
		    System.out.println ("You chose " + userChoice);  
		    myObj.close();
		    return userChoice;
	}
	public static void play() {
	
		
	if (userAnswer().equals("rock") || userAnswer().equals ("rock") && getComputer() == "rock") {
	System.out.println("Tie Game");
	}

		else if (userAnswer().equals ("rock") || userAnswer().equals ("rock") && getComputer() == "paper") {
			System.out.println("You Lost");
		}
		else if (userAnswer().equals ("rock") || userAnswer().equals ("rock") && getComputer() == "scissors") {
			System.out.println("You Won");
		}

		else if (userAnswer().equals  ("paper") || userAnswer().equals ("rock") && getComputer() == "paper") {
			System.out.println("You Lost");
		}
		else if (userAnswer().equals  ("paper" )|| userAnswer().equals ("rock") && getComputer() == "scissors") {
			System.out.println("You Won");
		}
		else if (userAnswer().equals  ("paper" )|| userAnswer ().equals ("rock") && getComputer() == "paper") {
			System.out.println("You Lost");
		}
		else if (userAnswer().equals  ("scissors") || userAnswer ().equals ("rock") && getComputer() == "scissors") {
			System.out.println("You Won");
		}
		else if (userAnswer().equals  ("scissors") || userAnswer ().equals ("rock") && getComputer() == "paper") {
			System.out.println("You Lost");
		}
		else if (userAnswer().equals ("scissors") || userAnswer().equals ("rock") && getComputer() == "scissors") {
			System.out.println("You Won");
		}
		else{
			System.out.println("Pick Rock, Paper or Scissors");
		}
}
}
