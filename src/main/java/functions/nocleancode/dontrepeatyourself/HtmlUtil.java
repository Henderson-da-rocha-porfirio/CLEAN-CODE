package src.main.java.functions.nocleancode.dontrepeatyourself;

/*Look back HtmlUtil carefully and you will notice that there is an algorithm that gets repeated four times,
        once for each of the SetUp, SuiteSetUp, TearDown, and SuiteTearDown cases.
        It’s not easy to spot this duplication because the four instances are intermixed with other code and aren’t uniformly duplicated.
        Still, the duplication is a problem because it bloats the code and will require four-fold modification should the algorithm ever have to change.
        It is also a four-fold opportunity for an error of omission.*/

/*This duplication was remedied by the include method in HtmlFunctions.
        Read through that code again and notice how the readability of the
        whole module is enhanced by the reduction of that duplication.*/

public class HtmlUtil {
    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute(" Test")) {
            if (includeSuiteSetup) {
                WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
                if (suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("! include -setup .").append(pagePathName).append("\ n");
                }
            }
            WikiPage setup = PageCrawlerImpl.getInheritedPage(" SetUp", wikiPage);
            if (setup != null) {
                WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("! include -setup .").append(setupPathName).append("\ n");
            }
        }
        buffer.append(pageData.getContent());
        if (pageData.hasAttribute(" Test")) {
            WikiPage teardown = PageCrawlerImpl.getInheritedPage(" TearDown", wikiPage);
            if (teardown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(teardown);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\ n").append("! include -teardown .").append(tearDownPathName)
            }
            .append("\ n");
        } if (includeSuiteSetup) {
            WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
            if (suiteTeardown != null) {
                WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                String pagePathName = PathParser.render(pagePath);
                buffer.append("! include -teardown .").append(pagePathName).append("\ n");
            }
        }
    }
    pageData.setContent(buffer.toString()); return pageData.getHtml();
}
