package src.main.java.formatting.cleancode.horizontal;

/* 1. We use horizontal white space to associate things that are strongly related
        and disassociate things that are more weakly related.
        Consider the following function.
        /*
    2. I surrounded the assignment operators with white space to accentuate them.
        Assignment statements have two distinct and major elements:
        the left side and the right side.
        The spaces make that separation obvious: */

public class AssociateAndDisassociateThings {

    private void measureLine(String line) {
        lineCount++;
        int lineSize = line.length();
        totalChars += lineSize;
        lineWidthHistogram.addLine(lineSize, lineCount);
        recordWidestLine(lineSize);
    }
}

/* 3. On the other hand, I didn’t put spaces between the function names and the opening parenthesis.
        This is because the function and its arguments are closely related. Separating them makes them
        appear disjoined instead of conjoined.
        I separate arguments within the function call parenthesis to accentuate
        the comma and show that the arguments are separate.*/
