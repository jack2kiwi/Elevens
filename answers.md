1. What items would be necessary if you were playing a game of Elevens at your desk (not on the computer)? List the private instance variables needed for the ElevensBoard class.

A deck of cards

2. Write an algorithm that describes the actions necessary to play the Elevens game.

    1. Create new game
    2. Draw 9 cards.
    3. Look for a set of Jack, Queen, and King. If it exists, replace the three cards.
    4. Look for a set of two cards that adds to 11. If it exists, replace the two cards.
    5. If nothing was replaced in the last turn, then the game is lost.
    6. Repeat steps 4-6 until there are no cards left remaining in the deck or on the board.
    7. Game is won.

3. Now examine the partially implemented ElevensBoard.java file found in the Activity7 Starter Code directory. Does the ElevensBoard class contain all the state and behavior necessary to play the game?

Yes

4. ElevensBoard.java contains three helper methods. These helper methods are private because they are only called from the ElevensBoard class.

    a. Where is the dealMyCards method called in ElevensBoard?
    
        dealMyCards is called in the newGame() method and in the constructor when a new ElevensBoard is instantiated.

    b. Which public methods should call the containsPairSum11 and containsJQK methods?
    
        anotherPlayIsPossible(), isLegal()

    c. Complete the diagram below by filling in the elements of the returned list, and by showing how those values index cards.
    
        0, 1, 3, 6, 7

    d. Complete the following printCards method to print all of the elements of cards that are indexed by cIndexes.

        for (Integer i : cIndexes) {
          System.out.println(board.cards[i].toString());
        }
    
    e. Which one of the methods that you identified in question 4b above needs to call the cardIndexes method before calling the containsPairSum11 and containsJQK methods? Why?
    
        anotherPlayIsPossible(). This is because the containsPairSumll and containsJQK needs the selected cards to begin with and to get the selected cards you need their indexes.