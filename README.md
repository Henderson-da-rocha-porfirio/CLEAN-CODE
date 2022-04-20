# FUNCTION
## Functions are the first line of organization in any program.
### 1. The first rule of functions is that they should be small.
### 2. The second rule of functions is that they should be smaller than that.
````
This implies that the blocks within if statements, else statements, while statements, and so on should be one line long. 
````
#### a. Probably that line should be a function call. Not only does this keep the enclosing function small,
#### b. But it also adds documentary value because the function called within the block can have a nicely descriptive name.
#### c. This also implies that functions should not be large enough to hold nested structures.
#### d. Therefore, the indent level of a function should not be greater than one or two. This, of course, makes the functions easier to read and understand.