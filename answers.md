Exercise 2 Questions:
1. Explain in your own words the relationship between a deck and a card.
A deck is a group of multiple cards.

2. Consider the deck initialized with the statements below. How many cards does the deck contain?
6

3. The game of Twenty-One is played with a deck of 52 cards. Ranks run from ace (highest) down to 2
(lowest). Suits are spades, hearts, diamonds, and clubs as in many other games. A face card has point
value 10; an ace has point value 11; point values for 2, …, 10 are 2, …, 10, respectively. Specify the
contents of the ranks, suits, and pointValues arrays so that the statement
Deck d = new Deck(ranks, suits, pointValues);
initializes a deck for a Twenty-One game.
Ranks and suits would need to be the usual ranks and suits of a 52 card deck. However, for pointValues the first number would be 11 and then going from 2 to 10 and the last three would all have the pointValue of 10.

4. Does the order of elements of the ranks, suits, and pointValues arrays matter?
The order of ranks and pointValues have to correlate with eachother so that the each rank has the right point value but other wise the order does not matter.