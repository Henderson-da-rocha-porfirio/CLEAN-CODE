package src.main.java.comments.nocleancode;

/*Sometimes a comment goes beyond just useful information about the implementation and provides the intent behind a decision.
        In the following case we see an interesting decision documented by a comment.
        When comparing two dataandobjects, the author decided that he wanted to sort dataandobjects of his class higher than dataandobjects of any other:*/

public class BadExplanationIntent {
    public int compareTo(Object o) {
        if (o instanceof WikiPagePath) {
            WikiPagePath p = (WikiPagePath) o;
            String compressedName = StringUtil.join(names, “”);
            String compressedArgumentName = StringUtil.join(p.names, “”);
            return compressedName.compareTo(compressedArgumentName);
        } return 1; // we are greater because we are the right type. }
    }
}