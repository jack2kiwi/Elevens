/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
//		String[] ranks = {"jack", "queen", "king"};
//		String[] suits = {"blue", "red"};
//		int[] pointValues = {11, 12, 13};
//		Deck d = new Deck(ranks, suits, pointValues);
//
//		System.out.println("**** Original Deck Methods ****");
//		System.out.println("  toString:\n" + d.toString());
//		System.out.println("  isEmpty: " + d.isEmpty());
//		System.out.println("  size: " + d.size());
//		System.out.println();
//		System.out.println();
//
//		System.out.println("**** Deal a Card ****");
//		System.out.println("  deal: " + d.deal());
//		System.out.println();
//		System.out.println();
//
//		System.out.println("**** Deck Methods After 1 Card Dealt ****");
//		System.out.println("  toString:\n" + d.toString());
//		System.out.println("  isEmpty: " + d.isEmpty());
//		System.out.println("  size: " + d.size());
//		System.out.println();
//		System.out.println();
//
//		System.out.println("**** Deal Remaining 5 Cards ****");
//		for (int i = 0; i < 5; i++) {
//			System.out.println("  deal: " + d.deal());
//		}
//		System.out.println();
//		System.out.println();
//
//		System.out.println("**** Deck Methods After All Cards Dealt ****");
//		System.out.println("  toString:\n" + d.toString());
//		System.out.println("  isEmpty: " + d.isEmpty());
//		System.out.println("  size: " + d.size());
//		System.out.println();
//		System.out.println();
//
//		System.out.println("**** Deal a Card From Empty Deck ****");
//		System.out.println("  deal: " + d.deal());
//		System.out.println();
//		System.out.println();

		System.out.println("**** Shuffle card****");
		    
		String[] ranks2 = new String[13];
        String[] suits2 = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int[] pointValues2 = new int[13];
        for (int i = 0; i < 13; i++) {
            String rank = "";
            if ( i == 10 ) {
                rank = "Jack";
            }
            else if ( i == 11 ) {
                rank = "Queen";
            }
            else if ( i == 12 ) {
                rank = "King";
            }
            else if ( i == 0 ) {
                rank = "Ace";
            }
            else {
                rank = Integer.toString((i + 1) % 13);
            }
            
            ranks2[i] = rank;
            pointValues2[i] = ((i+1) % 13);
        }
        
        Deck e = new Deck(ranks2, suits2, pointValues2);
        System.out.println(e);
	}
}
