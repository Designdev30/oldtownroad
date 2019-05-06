package blackjack2;
import java.util.*;
public class Blackjack2 {
static int deck [] = {1,2,3,4,5,6,7,8,9,10,11};

public static void main (String[] arg) {
	 System.out.println(hand());
	 int player1 = hand();
	 int comp = hand();
	 playGame(player1, comp);

}

public static int hand() {
	Random rndm = new Random();
	int randomHand = rndm.nextInt(10);
	return deck[randomHand];
}

//public static String prompt() {
	
//}

//public static void player1() {
// int playerHand [] = {hand(), hand()};
//

public static void playGame(int p1, int p2) {
	if (p1 > p2) {
		System.out.println("player 1 wins");
	} else {
		System.out.println("player 2 wins");
	}
}
}
