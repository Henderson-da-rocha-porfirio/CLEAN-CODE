# Objects and Datas Structures
## An object, we should be telling it to do something; we should not be asking it about its internals.
````
i. Objects: hide their data behind abstractions and expose functions that operate on that data. 
ii. Data structure: expose their data and have no meaningful functions.
````
### 1. Hiding implementation(objects):
````
Is not just a matter of putting a layer of functions between the variables.
Hiding implementation is about abstractions! A class does not simply push its variables out through getters and setters. 
Rather it exposes abstract interfaces that allow its users to manipulate the essence of the data, 
without having to know its implementation.
````
## 2. How to choose objects versus data structures:
### a. In any complex system there are going to be times when we want to add new data types rather than new functions:
#### Objects:
````
For these cases objects and OO are most appropriate.
````
### b. On the other hand, there will also be times when we’ll want to add new functions as opposed to data types:
#### Data Structures:
````
In that case procedural code and data structures will be more appropriate.
````
### Observation: Mature programmers know that the idea that everything is an object is a myth.
### Sometimes you really do want simple data structures with procedures operating on them.

## 3. The Law of Demeter (Methods)
### There is a well-known heuristic:
````
That says a module should not know
about the innards of the objects it manipulates.
As we saw in the last section, objects hide their data and expose operations. 
This means that an object should not expose its internal structure through accessors because to do so is to expose,
rather than to hide, its internal structure.
````
### More precisely, the Law of Demeter says:
````
That a method f of a class C should only call the methods of these:
 • C
 • An object created by f 
 • An object passed as an argument to f 
 • An object held in an instance variable of C
````
### The method should not invoke methods on objects that are returned by any of the allowed functions.
### In other words, talk to friends, not to strangers
## 4. Avoid Hybrids
### This confusion sometimes leads to unfortunate hybrid structures that are half object and half data structure.
