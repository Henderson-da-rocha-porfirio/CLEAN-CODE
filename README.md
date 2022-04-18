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
