package src.main.java.functions.cleancode.args.singleargs;

public class FlagArgs {

    void renderForSuite() {


    }

    void renderForSingleTest() {


    }


  /*  Flag arguments are ugly. Passing a boolean into a function is a truly terrible practice.
    It immediately complicates the signature of the method, loudly proclaiming that this function does more than one thing.
    It does one thing if the flag is true and another if the flag is false!
    We had no choice because the callers were already passing that flag in,
    and I wanted to limit the scope of refactoring to the function and below.
    Still, the method call render( true) is just plain confusing to a poor reader.
    Mousing over the call and seeing render( boolean isSuite) helps a little, but not that much.
    We should have split the function into two: renderForSuite() and renderForSingleTest().*/
}
