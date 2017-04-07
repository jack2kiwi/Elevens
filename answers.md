1. Discuss the similarities and differences between Elevens, Thirteens, and Tens.

These games all involve a full deck of cards and a board. Certain functions are use among the three as deal, deckSize, isEmpty, etc. However, a few functions overlap but require different implementations between the games, such as isLegal() and anotherPlayIsPossible(). Finally, there a few functions that exist purely in one of the games and is not shareable, such as containsJQK().

2. How do the Board instance variables get initialized with the ElevensBoard values? What is the exact mechanism?

The instance variable is initialized in the Board class. Inside constructor of ElevensBoard, the values are passed into the constructor of the superclass.

3. Do they cover all the differences between Elevens,
Thirteens, and Tens as discussed in question 1? Why or why not?

They cover all the differences because all of the methods that are exactly shareable between the card games are implemented in the Board class while the overlapping functions that require different implmentations (anotherPlayIsPossible and isLegal) are abstract, and thus implemented in the respective board game subclasses.