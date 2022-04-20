# FUNCTION - FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY.
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
### 3. Explain: "FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY."
#### i. The problem with this statement is that it is hard to know what “one thing” is:
````
NoUseIfSmall class do one thing? 
````
#### ii. It’s easy to make the case that it’s doing three things:
````
1. Determining whether the page is a test page.
2. If so, including setups and teardowns.
3. Rendering the page in HTML.
````
