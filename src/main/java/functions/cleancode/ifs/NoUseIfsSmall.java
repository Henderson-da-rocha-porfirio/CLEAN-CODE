package src.main.java.functions.cleancode.ifs;

/*How short should your functions be? They should usually be shorter than NoUseIfs
 Indeed, NoUseIfs should really be shortened like NoUseIfsSmall:*/

public class NoUseIfsSmall {

    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite) throws Exception {
        if (isTestPage(pageData)) includeSetupAndTeardownPages(pageData, isSuite);
        return pageData.getHtml();
    }
}

/*
        "FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL. THEY SHOULD DO IT ONLY."
        #### i. The problem with this statement is that it is hard to know what “one thing” is:
        ````
        NoUseIfSmall classes do one thing?
        ````
        #### ii. It’s easy to make the case that it’s doing three things:
        ````
        1. Determining whether the page is a test page.
        2. If so, including setups and teardowns.
        3. Rendering the page in HTML.
        ````*/
