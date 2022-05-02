package src.main.java.formatting.nocleancode.horizontal;

/*I avoid collapsing scopes down to one line like this:*/

public class BreakingIdentation extends TextWidget {
    public static final String REGEXP =“^#[ ^\r\n]*(?:(?:\r\n)|\n|\r)?”;

        public CommentWidget( ParentWidget parent, String text){super( parent, text);}
        public String render() throws Exception {return “”; }
}
