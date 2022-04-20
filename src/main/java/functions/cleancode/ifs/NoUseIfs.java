package src.main.java.functions.cleancode.ifs;

/*However, with just a few simple method extractions,
        some renaming, and a little restructuring,
        I was able to capture the intent of the function in the nine lines
        See whether you can understand that*/

public class NoUseIfs {

    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }
}

    /*Unless you are a student of FitNesse, you probably don’t understand all the details.
        Still, you probably understand that this function performs the inclusion of some setup and
        teardown pages into a test page and then renders that page into HTML.
        If you are familiar with JUnit, 2 you probably realize that this function belongs to some kind of Web-based testing framework.
        And, of course, that is correct.
        Divining that information, is pretty easy, but it’s pretty well obscured by example Useif.
        So what is it that makes a function like Listing 3-2 easy to read and understand? How can we make a function communicate its intent?
        What attributes can we give our functions that will allow a casual reader to intuit the kind of program they live inside?*/