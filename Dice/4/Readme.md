## The Factory

<pre>
Before I built a wall I'd ask to know
What I was walling in or walling out
And to whom I was like to give offence.
Something there is that does'nt love a wall,
That wants it down.
- Robert Frost, Mending Wall
</pre>

### Coupling
Our last solution raised questions regarding the coupling between the client and server. A good design must support independent evolution of the client and server. To do that, we need to minimize this coupling.

The present implementation of die is "visible" to the client. That means that next time we make a change to the die class (server), the client needs to recompile. There is no clear separation between client and server.

Let us clearly separate the client and server.

We create a new class dicefactory.jsl to manage the creation of die objects. The client now deals only with this factory. This also gives the server the flexibility to manage the die's storage. The client no longer needs to know where the die lives; i.e., is it allocated on the heap, is it allocated from a preallocated collection of "dice", etc.

Now, the following files provide the die service:
- [Dice.java](src/main/java/Dice.java)
- [Rollable.java](src/main/java/Rollable.java)
- [DiceFactory.java](src/main/java/DiceFactory.java)

[App.java](src/main/java/App.java) is the client.

The "real" representation of the die is no longer "visible" to the client. And it need not be too. The coupling between client and server is restricted to dicefactory.jsl and the interface rollable.jsl

We have insulated the client from the server.

[Next: Strategy](../5/Readme.md)