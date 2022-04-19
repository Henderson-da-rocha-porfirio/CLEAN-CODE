# NAME
## I took these instructions from the Clean Code Book (Robert C. Martin)
### 1. Names are everywhere in software.
### 2. Use names that reveal intent
### 3. The name of a variable, function, or class, should answer all the big questions. 
### 4. It should tell you why:
````
1. it exists
2. what it does
3. how it is used.
````
### 5. If a name requires a comment, then the name does not reveal its intent.
### 6. Choosing names that reveal intent can make it much easier to understand and change code.
### 7. Avoid Disinformation. We should avoid words whose entrenched meanings vary from our intended meaning.
````
For example, hp, aix, and sco would be poor variable names because they are the names of Unix platforms or variants. Even if you are coding a hypotenuse and hp looks like a good abbreviation, it could be disinformative.
````
### 8. If names must be different, then they should also mean something:
#### i. Imagine that you have a:
````
Product class
````
#### ii. If you have another called:
````
ProductInfo or ProductData, you have made the names different without making them mean anything different.
````
#### iii. Info and Data are indistinct noise words like a, an, and the.
#### iv. The problem comes in when you decide to call a variable: 
````
" theZork "  because you already have another variable named " zork ".
````
### 9. Noise words are redundant. The words should never appear in a variable or table name:
````
a. variable
b. table
c. NameString
d. Name
````
#### i. Imagine finding one class named:
````
Customer
````
#### ii. And another named:
````
CustomerObject.
````
#### iii. What should you understand as the distinction? Which one will represent the best path to a customer’s payment history?

### 10. So make your names pronounceable.

### 11. Don’t Add Gratuitous Context In an imaginary application called “Gas Station Deluxe,” it is a bad idea to prefix every class with GSD.

### 12. People are also afraid of renaming things for fear that some other developers will object. 
````
We do not share that fear and find that we are actually grateful when names change (for the better).
````
