package src.main.java.functions.cleancode.args.commandqueryseparation;

/*We could try to resolve this by renaming the set function to setAndCheckIfExists,
 but that doesn’t much help the readability of the if statement.
  The real solution is to separate the command from the query so that the ambiguity cannot occur.*/

public class FuncDoOrAnswerSomethingNotBoth {
    public boolean set(String attribute, String value);

   if(

    attributeExists(”username”))

    {
        setAttribute(” username”, ”unclebob”);
       …
    }
}
