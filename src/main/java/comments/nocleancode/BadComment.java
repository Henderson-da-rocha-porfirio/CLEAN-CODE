package src.main.java.comments.nocleancode;

import java.util .*;
public class BadComment {

    /* This class Generates prime numbers up to a user specified
     * maximum.
     * The algorithm used is the Sieve of Eratosthenes.
     * < p >
     * Eratosthenes of Cyrene, b. c. 276 BC, Cyrene, Libya --
     * d. c. 194, Alexandria. The first man to calculate the
     * circumference of the Earth. Also known for working on
     * calendars with leap years and ran the library at Alexandria.
     * < p > * The algorithm is quite simple. Given an array of integers
     * starting at 2. Cross out all multiples of 2. Find the next
     * uncrossed integer, and cross out all of its multiples.
     * Repeat untilyou have passed the square root of the maximum
     * value. * * @author Alphonse * @version 13 Feb 2002 atp */


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