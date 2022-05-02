package src.main.java.formatting.cleancode.vertical;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*Control variables for loops should usually be declared within the loop statement,
 as in this cute little function from the same source.*/

public class VerticalDistanceVariablesLoops {
    public int countTestCases() {
        int count = 0;
        for (Test each : tests)
            count += each.countTestCases();
        return count;
    }
}