# Error Handling

### Unchecked Exceptions:
````
 The price of checked exceptions is an Open/ Closed Principle1 violation.
 If you throw a checked exception from a method in your code and the catch is three levels above,
 you must declare that exception in the signature of each method between you and the catch.
 This means that a change at a low level of the software can force signature changes on many higher levels.
 The changed modules must be rebuilt and redeployed, even though nothing they care about changed.
````

### Provide Context with Exceptions
````
 Each exception that you throw should provide enough context to determine the source and location of an error.
 In Java, you can get a stack trace from any exception; however, a stack trace can’t tell you the intent of the operation that failed. 
 Create informative error messages and pass them along with your exceptions.
 Mention the operation that failed and the type of failure.
 If you are logging in your application, pass along enough information to be able to log the error in your catch.