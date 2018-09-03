## Design Exercises

<pre>
The harder I practice, the luckier I get.
- Gary Player
</pre>

- Instead of having a single die support multiple loading strategies,
we can have a hierarchy of dice, each supporting a different strategy;
Discuss the merits of this with respect to our choice of implementation.
- Instead of having the die implement the Rollable interface, we can have
an abstract class representing a die and all concrete implementations of
a die to inherit from this abstract class.
Discuss the merits of this with respect to our choice of implementation.
- Extend the die concept to allow for different types of objects on the faces.
For instance, a die might have letters on its faces, or it might have pictures
on its faces.