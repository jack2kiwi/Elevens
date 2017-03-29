/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
		int[] values = {1,2,3,4,5,6,7,8,9,10};
		String[] suits = {"Hearts", "Diamonds"};
		Deck deck1 = new Deck(ranks, suits, values);
		Deck deck2 = new Deck(ranks, suits, values);
		Deck deck3 = new Deck(ranks, suits, values);
		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());
		System.out.println(deck1.size());
		System.out.println(deck2.size());
		System.out.println(deck3.size());
		System.out.println(deck1.isEmpty());
		System.out.println(deck2.isEmpty());
		System.out.println(deck3.isEmpty());
		System.out.println(deck1.deal());
		System.out.println(deck2.deal());
		System.out.println(deck3.deal());
	}
}
