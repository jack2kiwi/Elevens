1. The size of the board is one of the differences between Elevens and Thirteens. Why is size not an abstract method?

Size is an instance variable. There is no need to create setters or getter methods in the Board class since the size variable is already defined in the subclass.

2. Why are there no abstract methods dealing with the selection of the cards to be removed or replaced in the array cards?

Because removing and replacing cards is uniform regardless of which game is being played. Thus it can be implemented in the Board class and does not need to be an abstract method.

3. Would this new scheme allow the Elevens GUI to call isLegal
and anotherPlayIsPossible polymorphically? Would this alternate design work as well as the abstract Board class design? Why or why not?

isLegal() and anotherPlayIsPossible() would still be called polymorphically. This alternate design can still work but all of the methods will have to be implemented separately for each card game board class.