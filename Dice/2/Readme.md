## Dice as Classes
Our previous solution left some issues open:
- We do not get the impression of using a die.
- What if we need a ten-sided die? What do we need to modify?
- What if we need more than one die? What do we need to modify?
- The code has the "magic" numbers 1 and 6.
- What is the relation between the operation Roll() and the die? Is it captured in our program? Or is it only in the mind of the programmer?
- What is the relation between Roll() and the number of sides on the die?

We need a better representation of a die.

We characterize a die as follows:
- A die is a thing.
- A die is something that a player can "Roll".
- The "Roll" operation will roll a die.
- The value (on the top face) of the die is a result of this "Roll" operation.

Let us also remove the restriction on the number of sides that the die can have. We will make it a parameter.

Now, the new die is implemented in [Dice.java](src/main/java/Dice.java)
The die is used from the application [App.java](src/main/java/App.java)

[Interfaces as Types](../3/Readme.md)