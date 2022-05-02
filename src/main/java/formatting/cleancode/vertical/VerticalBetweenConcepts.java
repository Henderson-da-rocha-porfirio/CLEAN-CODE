package src.main.java.formatting.cleancode.vertical;

import java.util.regex.Matcher;

/*There are blank lines that separate the package declaration, the import( s), and each of the functions.
        This extremely simple rule has a profound effect on the visual layout of the code.
        Each blank line is a visual cue that identifies a new and separate concept.
        As you scan down the listing, your eye is drawn to the first line that follows a blank line.*/
public class VerticalBetweenConcepts extends ParentWidget {

    public static final String REGEXP = “’’’.+?’’’”;
    private static final Pattern pattern = Pattern.compile(“’’’(.+?)’’’”,
    Pattern.MULTILINE Pattern.DOTALL );

    public BoldWidget(ParentWidget parent, String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
        addChildWidgets(match.group(1));
    }

    public String render() throws Exception {
        StringBuffer html = new StringBuffer(“ < b >”);
        html.append(childHtml()).append(“ </b >”);
        return html.toString();
    }
}}
