package src.main.java.functions.nocleancode.args.commandqueryseparation;

/*Imagine this from the point of view of the reader. What does it mean? Is it asking
        whether the “username” attribute was previously set to “unclebob”?
        Or is it asking whether the “username” attribute was successfully set to “unclebob”?
        It’s hard to infer the meaning from the call because it’s not clear whether the word “set” is a verb or an adjective.
        The author intended set to be a verb, but in the context of the if statement it feels like an adjective.
        So the statement reads as “If the username attribute was previously set to unclebob”
        and not “set the username attribute to unclebob and if that worked then.…”*/

public class FuncDoOrAnswerSomethingNotBoth {

    public boolean set( String attribute, String value);

    if (set(” username”, ”unclebob”))…
}
