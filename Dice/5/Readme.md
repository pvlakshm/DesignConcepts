## Strategy

### Flexibility
Remember that we are using the die in a game scenario - say, man vs computer, or, like in a casino.

No casino likes to lose. So a requirement would be to have a predictable outcome to rolling a die. This is popularly called "loading" the die. If the casino starts losing, they will switch to a "loaded" die. Then they can beat you. And make money.

Normally a die has a "random" loading i.e., the outcome of a roll would be a random number within the range of numbers on the faces of the die.

### Testing
How would the game developer test the game? It is difficult to write test cases if the outcome of the roll is going to be random (although in this case it is going to be in a fixed range). We must be able to ensure a predictable and repeatable outcome to effectively test our software.

### Strategy
We must be able to vary the "loading" strategy without having to rebuild our die component (for which we may not even have the source code)! From both "flexibility" and "testing" perspectives, it is desirable to be able to vary the rolling strategy ("loading") of our die at run time.

### Solution
We abstract the rolling as an interface in [RollStrategy.java](src/main/java/RollStrategy.java) Every die refers to an instance of a RollStrategy object through this interface. We abstract the "loading" as a method on the dice interface that allows us to set the RollStrategy to be used by the die. This object represents the strategy to be used when the die is rolled.

We make the addition to the die representaion in [Dice.java](src/main/java/Dice.java). We move the Roll method from [App.java](src/main/java/App.java) and create a RandomRoll class, [RandomRoll.java)](src/main/java/RandomRoll.java), representing the random distribution strategy. This is the default strategy used by the die.

We introduce a method to load the die in [Rollable.java](src/main/java/Rollable.java) and implement it on our die class, [Dice.java](src/main/java/Dice.java). The roll function now uses this "load" to perform the rolling operation. We update [DiceFactory.java](src/main/java/DiceFactory.java) to set the default load on the die upon creation of the die.

We create a CyclicRoll strategy in a similar fashion in [CyclicRoll.java](src/main/java/CyclicRoll.java).

Now the client can initialize the desired rolling strategy, set it on the die, and then roll it. Notice how we can vary it at run time.

#### Server files:
[Dice.java](src/main/java/Dice.java), [RandomRoll.java](src/main/java/RandomRoll.java), [DiceFactory.java](src/main/java/DiceFactory.java), [Rollable.java](src/main/java/Rollable.java), [RollStrategy.java](src/main/java/RollStrategy.java)

#### Client
[App.java](src/main/java/App.java), [CyclicRoll.java](src/main/java/CyclicRoll.java)

Only [DiceFactory.java](src/main/java/DiceFactory.java), [Rollable.java](src/main/java/Rollable.java), [RollStrategy.java](src/main/java/RollStrategy.java) are "visible" to the client.

This implementation has the following characteristics:
- clear separation of client and server
- is modular
- low coupling (restricted to the interface level)
- supports independent evolution of the client and server
- allows varying the rolling strategy of the die (flexibility) at run time
- supports testing

This completes our "die design" project. Hope you learnt something along the way!

[Design Excercises](../Exercises/Readme.md)