## Interfaces as Types

### Re-organizing the Modules
Our previous solution allowed us to have more than one die.

Before proceeding, let us introduce the notion of a **client** and a **server**. A server provides some service. In this case [Dice.java](src/main/java/Dice.java) provides the die service.
[App.java](src/main/java/App.java) is the client that makes use of this service.

What about coupling between the client and server?
How tightly is the design of the client bound to the die that it is using? What will happen if we were to make changes to the die - like introducing some new methods? Does the client need to be recompiled? Is that reasonable? What if the die is used in multiple files? What if it is used by multiple clients?

### Interfaces as Types
We introduce an interface to the die in [Rollable.java](src/main/java/Rollable.java).
The die class in [Dice.java](src/main/java/Dice.java) implements this interface.
The client, [App.java](src/main/java/App.java) works only in terms of this interface.

Do you see any more areas where we can improve?

[The Factory]()