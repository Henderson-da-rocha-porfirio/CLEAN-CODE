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

    /*Unless you are a student of FitNesse, you probably don’t understand all the details.
        Still, you probably understand that this function performs the inclusion of some setup and
        teardown pages into a test page and then renders that page into HTML.
        If you are familiar with JUnit, 2 you probably realize that this function belongs to some kind of Web-based testing framework.
        And, of course, that is correct.
        Divining that information, is pretty easy, but it’s pretty well obscured by example Useif.
        So what is it that makes this function easy to read and understand? How can we make a function communicate its intent?
        What attributes can we give our functions that will allow a casual reader to intuit the kind of program they live inside?*/