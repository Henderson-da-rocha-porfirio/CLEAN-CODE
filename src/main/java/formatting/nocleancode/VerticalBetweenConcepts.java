/*Has a remarkably obscuring effect on the readability of the code:*/

package src.main.java.formatting.nocleancode;
import java.util.regex.Matcher;
public class VerticalBetweenConcepts extends ParentWidget {
    public static final String REGEXP = “’’’.?’’’”;
    private static final Pattern pattern = Pattern.compile(“’’’(.?)’’’”,
    Pattern.MULTILINE Pattern.DOTALL);
    public BoldWidget(ParentWidget parent, String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
        addChildWidgets(match.group(1));}
    public String render() throws Exception {
        StringBuffer html = new StringBuffer(“ < b >”);
        html.append(childHtml()).append(“ </b >”);
        return html.toString();
    }
}
