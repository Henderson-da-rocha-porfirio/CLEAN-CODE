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
### 4. Use Descriptive Names on functions. I changed the name of our example function from testableHtml to SetupTeardownIncluder.render.
#### i. This is a far better name because it better describes what the function does.
#### ii. I also gave each of the private methods an equally descriptive name such as isTestable or includeSetupAndTeardownPages.
#### iii. Don’t be afraid to make a name long. A long descriptive name is better than a short enigmatic name.
#### iv. A long descriptive name is better than a long descriptive comment.
#### v. Use a naming convention that allows multiple words to be easily read in the function names, and then make use of those multiple words to give the function a name that says what it does.
#### vi. Don’t be afraid to spend time choosing a name.
#### vii. Indeed, you should try several different names and read the code with each in place.
### 5. Functions Arguments:
````
Arguments are hard. They take a lot of conceptual power. That’s why I got rid of almost all of them from the example.
 Consider, for instance, the StringBuffer in the example.
 We could have passed it around as an argument rather than making it an instance variable,
 but then our readers would have had to interpret it each time they saw it.
 When you are reading the story told by the module,
 includeSetupPage()
 is easier to understand than
 includeSetupPageInto( newPage-Content).
 
 One input argument is the next best thing to no arguments.
 SetupTeardown-Includer.render( pageData) is pretty easy to understand.
 Clearly we are going to render the data in the pageData object.
````
