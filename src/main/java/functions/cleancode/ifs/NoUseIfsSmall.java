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