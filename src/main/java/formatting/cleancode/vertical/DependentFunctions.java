package src.main.java.formatting.cleancode.vertical;

/*If one function calls another, they should be vertically close, and the caller should be above the callee, if at all possible.
        This gives the program a natural flow. If the convention is followed reliably,
        readers will be able to trust that function definitions will follow shortly after their use. Consider,
        for example, the snippet.
        Notice how the topmost function calls those below it and how they in turn call those below them.
        This makes it easy to find the called functions and greatly enhances the readability of the whole module.
        As an aside, this snippet provides a nice example of keeping constants at the appropriate level.
        The “FrontPage” constant could have been buried in the getPageNameOrDefault function, but that would have hidden a well-known
        and expected constant in an inappropriately low-level function.
        It was better to pass that constant down from the place where it makes sense to know it to the place that actually uses it.*/

public class DependentFunctions implements SecureResponder {

    protected WikiPage page;
    protected PageData pageData;
    protected String pageTitle;
    protected Request request;
    protected PageCrawler crawler;

    public Response makeResponse(FitNesseContext context, Request request) throws Exception {
        String pageName = getPageNameOrDefault(request, “FrontPage”); loadPage(pageName, context);
        if (page == null)
            return notFoundResponse(context, request);
        else
            return makePageResponse(context);
    }

    private String getPageNameOrDefault(Request request, String defaultPageName) {
        String pageName = request.getResource();
        if (StringUtil.isBlank(pageName)) pageName = defaultPageName;
        return pageName;
    }

    protected void loadPage(String resource, FitNesseContext context) throws Exception {
        WikiPagePath path = PathParser.parse(resource);
        crawler = context.root.getPageCrawler();
        crawler.setDeadEndStrategy(new VirtualEnabledPageCrawler());
        page = crawler.getPage(context.root, path);
        if (page != null)
        pageData = page.getData();
    }

    private Response notFoundResponse(FitNesseContext context, Request request) throws Exception {
        return new NotFoundResponder().makeResponse(context, request);
    }

    private SimpleResponse makePageResponse(FitNesseContext context) throws Exception {
        pageTitle = PathParser.render(crawler.getFullPath(page));
        String html = makeHtml(context);
        SimpleResponse response = new SimpleResponse();
        response.setMaxAge(0);
        response.setContent(html);
        return response;
    }
    ...
}
