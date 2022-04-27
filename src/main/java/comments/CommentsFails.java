package src.main.java.comments;

import java.util.Locale;

public class CommentsFails {
    MockRequest request;
    private final String HTTP_DATE_REGEXP =
        “[SMTWF][a-z]{2}\\,\\s[0-9]{2}\\s[JFMASOND][a-z]{2}\\s”+
        “[0-9]{4}\\s[0-9]{2}\\:[0-9]{2}\\:[0-9]{2}\\sGMT”;
    private Response response;
    private FitNesseContext context;
    private FileResponder responder;
    private Locale saveLocale;
    // Example: ”Tue, 02 Apr 2003 22: 18: 49 GMT”
}
