package src.main.java.name.intentionrevealingname.nocleancode;

/*Number-series naming (a1, a2, .. aN) is the opposite of intentional naming. Such names are not disinformative—
they are noninformative; they provide no clue to the author’s intention.
 Consider:*/

public class NoninformativeNames {
    public static void copyChars( char a1[], char a2[]) {
        for (int i = 0; i < a1.length; i++) {
            a2[ i] = a1[ i];
        }
    }
}
