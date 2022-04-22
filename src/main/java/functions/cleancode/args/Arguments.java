package src.main.java.functions.cleancode.args;

public class Arguments {


   /* The ideal number of arguments for a function is zero (niladic). Next comes one (monadic), followed closely by two (dyadic).
    Three arguments (triadic) should be avoided where possible.
    More than three (polyadic) requires very special justification— and then shouldn’t be used anyway.*/

/*    Arguments are hard. They take a lot of conceptual power. That’s why I got rid of almost all of them from the example.
    Consider, for instance, the StringBuffer in the example. We could have passed it around as an argument rather than making it an instance variable,
    but then our readers would have had to interpret it each time they saw it. When you are reading the story told by the module,
    includeSetupPage() is easier to understand than includeSetupPageInto( newPage-Content).
    The argument is at a different level of abstraction than the function name and
    forces you to know a detail (in other words, StringBuffer) that isn’t particularly important at that point.
    Arguments are even harder from a testing point of view.*/

    /*One input argument is the next best thing to no arguments. SetupTeardown-Includer.render( pageData) is pretty easy to understand.
    Clearly we are going to render the data in the pageData object.*/

}
