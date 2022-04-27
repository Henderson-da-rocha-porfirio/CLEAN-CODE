package src.main.java.comments.nocleancode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*Sometimes programmers will put special comments on closing braces, as in Listing 4-6. Although this might make sense for long functions with deeply nested structures,
        it serves only to clutter the kind of small and encapsulated functions that we prefer.
        So if you find yourself wanting to mark your closing braces, try to shorten your functions instead.*/
public class Braces {

    public class wc {
        public static void main(String[] args) {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String line;
            int lineCount = 0;
            int charCount = 0;
            int wordCount = 0;
            try {
                while ((line = in.readLine()) != null) {
                    lineCount++;
                    charCount += line.length();
                    String words[] = line.split("\\ W");
                    wordCount += words.length;
                } // while
                System.out.println(" wordCount = " + wordCount);
                System.out.println(" lineCount = " + lineCount);
                System.out.println(" charCount = " + charCount);
            } // try
            catch (IOException e) {
                System.err.println(" Error:"e.getMessage());
            } // catch
        } // main }
    }
}