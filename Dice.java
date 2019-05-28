package dice;

import java.util.Random;

public class Dice {

	public static void main(String[] args) {
		System.out.println ( "Rolling 7 or 11 on the first try is a WIN " +
				"Rolling 2, 3 or 12 on the first try is a LOSE!");
		System.out.print("first roll: ");
		// TODO Auto-generated method stub
System.out.println ("You " + Logic(roll()));

	}

// roll function is going to make 2 random numbers between 1 and 6 and add them together 
	
// logic function is going to take sum of random numbers do some logic and return win or loss 
public static int roll() {
	Random rndm = new Random();
	int randomHand = rndm.nextInt(6) + (1);
	int randomHand2= rndm.nextInt(6) + (1);
	int sum= randomHand + randomHand2;
	System.out.println ("You rolled a "+ sum);
	return sum;
	

}
public static String Logic(int roll) {

	if (roll == 7 || roll == 11 ) {
		return "Win";
	} else if(roll == 2 || roll == 3 || roll == 12){
		return "Lose";
		
	}
	else {
		System.out.println ("Choose to reroll, if you roll 7 you lose!");
		int point = roll;
		int reroll = 0;
		while (reroll != point && reroll != 7) {
			reroll = roll();
		}
		if ( reroll == 7) {
		return "Lose";
		} else {
			return "Win";
		}
	}
	// point = roll
	//reroll is set to 0
	//while reroll is not equal to point and reroll is not equal to 7 continue to roll by calling the roll function
	//if reroll is equal to 7 return lose else you win
}
	}


		


