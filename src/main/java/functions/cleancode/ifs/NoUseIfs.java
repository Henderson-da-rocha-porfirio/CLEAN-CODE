package src.main.java.functions.cleancode.ifs;

/*However, with just a few simple method extractions,
        some renaming, and a little restructuring,
        I was able to capture the intent of the function in the nine lines
        See whether you can understand that*/

public class NoUseIfs {
    public static String renderPageWithSetupsAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute(" Test");
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