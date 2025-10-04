/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 *
 * @author Dylan Kyle
 * @version ???
 */

public class Main {

	/* ALGORITHM
	*
	1. Generate 52 card deck into Card array
	- ???
	2. Print deck (simple)
	- ???
	*
	*/
	public static void main(String[] args) {
		/*** RUNNING TESTER ***/
		//uncomment line below to run CardTester:
		CardTester.main(null);

		/*** DRIVER PROGRAM ***/
		//1. Generate 52 card deck into Card array
		
		char[] suits = { Card.HEART, Card.DIAMOND, Card.SPADE, Card.CLUB };

		Card[] cards = new Card[52];

		Card a = new Card();

		System.out.println(a.getPrintCard());
		int cardIndex = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 1; j <= 13; j++) {
				cards[cardIndex] = new Card(j, suits[i]);
				System.out.print(cards[cardIndex] + " ");
				cardIndex++;
			}
			System.out.println();
		}
		
		//2. Print deck
	}
}