package src.main.java.comments.cleancode;

public class GoodComment {

    /* This class Generates prime numbers up to a user specified
     * maximum. The algorithm used is the Sieve of Eratosthenes.
     * Given an array of integers starting at 2:
     * Find the first uncrossed integer, and cross out all its
     * multiples. Repeat until there are no more multiples
     * in the array.
     */
    import java.util .*;

    public class GeneratePrimes {
        /*
         * @param maxValue is the generation limit.
         */
        public static int[] generatePrimes(int maxValue) {
            if (maxValue > = 2) // the only valid case
            {
                // declarations
                int s = maxValue 1; // size of array
                boolean[] f = new boolean[s];
            }

        }

        ...
        
    }