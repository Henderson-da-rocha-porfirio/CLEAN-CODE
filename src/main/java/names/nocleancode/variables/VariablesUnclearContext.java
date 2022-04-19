package src.main.java.names.nocleancode.variables;

/*Consider the method in Listing 2-1. Do the variables need a more meaningful context? The function names provides only part of the context; the algorithm provides the rest.
        Once you read through the function, you see that the three variables, number, verb, and pluralModifier,
        are part of the “guess statistics” message. Unfortunately, the context must be inferred.
        When you first look at the method, the meanings of the variables are opaque:*/
public class VariablesUnclearContext {
    private void printGuessStatistics(char candidate, int count) {
        String number;
        String verb;
        String pluralModifier;
        if (count = =0){
            number = ”no”;
            verb = ”are”;
            pluralModifier = ”s”;
        } else if (count == 1) {
            number = ”1”;
            verb = ”is”;
            pluralModifier = ”s”;
        } else {
            number = Integer.toString( count);
            verb = ”are”;
            pluralModifier = ”s”;
        }
        String guessMessage = String.format(
                ”There %s %s %s% s”, verb, number, candidate, pluralModifier
        );
        print( guessMessage);
        }
    }