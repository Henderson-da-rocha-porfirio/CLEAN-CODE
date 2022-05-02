package src.main.java.formatting.cleancode.unclebob;

import java.util.Arrays;
import java.util.Set;

public class UncleBobFormattingRules {

    public int getWidestLineNumber() {
     return widestLineNumber;
    }

    public LineWidthHistogram getLineWidthHistogram() {
     return lineWidthHistogram;
    }

    public double getMeanLineWidth() {
     return (double)totalChars/lineCount;
    }

    public int getMedianLineWidth() {
     Integer[] sortedWidths = getSortedWidths();
     int cumulativeLineCount = 0;
     for (int width:sortedWidths) {
      cumulativeLineCount += lineCountForWidth(width);
      if (cumulativeLineCount > lineCount/2)
       return width;
     }
     throw new Error(“Cannot get here”);
    }

    private int lineCountForWidth(int width) {
     return lineWidthHistogram.getLinesforWidth(width).size();
    }

    private Integer[] getSortedWidths() {
     Set<Integer> widths = lineWidthHistogram.getWidths();
     Integer[] sortedWidths = (widths.toArray(new Integer[0]));
     Arrays.sort(sortedWidths);
     return sortedWidths;
    }
}
