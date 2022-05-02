package src.main.java.formatting.cleancode.horizontal;

/*I prefer to expand and indent the scopes instead, like this:*/

public class BreakingIdentation extends TextWidget {
    public static final String REGEXP =“^#[^\r\n]*(?:(?:\r\n)|\n|\r)?”;

    public CommentWidget(ParentWidget parent, String text) {
        super(parent, text);
    }

    public String render() throws Exception {
        return “”;
    }
}
