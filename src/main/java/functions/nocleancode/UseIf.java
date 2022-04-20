package src.main.java.functions.nocleancode;

/*Do you understand the function after three minutes of study? Probably not.
        There’s too much going on in there at too many different levels of abstraction.
         There are strange strings and odd function calls mixed in with doubly nested if statements controlled by flags. o*/

public class UseIf {

    public static String testableHtml(
            PageData pageData,
            boolean includeSuiteSetup
    ) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute(" Test")) {
            if (includeSuiteSetup) {
                WikiPage suiteSetup =
                        PageCrawlerImpl.getInheritedPage(
                                SuiteResponder.SUITE_SETUP_NAME, wikiPage
                        );
                if (suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                }
                String pagePathName = PathParser.render(pagePath);
                buffer.append("!include -setup.")
                        .append(pagePathName)
                        .append("\n");
            }
        }
        WikiPage setup =
                PageCrawlerImpl.getInheritedPage(" SetUp", wikiPage);
        if (setup != null) {
            WikiPagePath setupPath =
                    wikiPage.getPageCrawler().getFullPath(setup);
            String setupPathName = PathParser.render(setupPath);
            buffer.append("! include -setup .")
                    .append(setupPathName)
                    .append("\n");
        }
    }
        buffer.append(pageData.getContent());
        if (pageData.hasAttribute(" Test"))

    {
        WikiPage teardown =
                PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
        if (teardown != null) {
            WikiPagePath = wikiPage.getPageCrawler().getFullPath(teardown);
            String tearDownPathName = PathParser.render(tearDownPath);
            buffer.append("\n")
                    .append("!include -teardown.")
                    .append(tearDownPathName)
                    .append("\n");
        }
        if (includeSuiteSetup) {
            WikiPage suiteTeardown =
                    PageCrawlerImpl.getInheritedPage(
                            SuiteResponder.SUITE_TEARDOWN_NAME,
                            wikiPage
                    );
            if (suiteTeardown != null) {
                WikiPagePath pagePath =
                        suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                String pagePathName = PathParser.render(pagePath);
                buffer.append("!include -teardown.")
                        .append(pagePathName)
                        .append("\n");
            }
        }
    }
    pageData.setContent(buffer.toString());
    return pageData.getHtml();
}