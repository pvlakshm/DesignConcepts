## Design Concepts - An Introduction with Java
"Design" is context-driven. For a product, this context would be its purpose, its lifetime, the materials used, the usage pattern, the scale, to name but a few.

The design of a single-seater aircraft would be inappropriate for the space shuttle. The design of a steamer would be inappropriate for an aircraft carrier.

Software system design is no different. We must consider various issues
such as:
- performance
- portability
- which alogrithms and data structures to use
- controlling interaction between the various pieces

Having said that, good design typically has the following characteristics:
- shows appropriate decomposition
- is modular
- has low coupling
- is flexible
- can be tested

We must design with an eye on implementation.
 
We will take a sample problem and try to illustrate these issues.
 
This tutorial builds up a sample over several steps, refining it at each step by applying a simple pattern; the patterns 'interface as type', 'factory' and 'strategy' are illustrated as we go along.
 
The tutorial is implemented in Java.

Problem Statement:
Build a six-sided die that a player might use to play a game.

[A Simple Solution](https://github.com/pvlakshm/DesignConcepts/blob/FB1/Dice/1/Readme.md)