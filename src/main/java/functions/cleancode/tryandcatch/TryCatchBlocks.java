package src.main.java.functions.cleancode.tryandcatch;

/*In the above,the delete function is all about error processing.
        It is easy to understand and then ignore.
        The deletePageAndAllReferences function is all about the processes of fully deleting a page.
        Error handling can be ignored.This provides a nice separation that makes the code easier to understand and modify.*/

public class TryCatchBlocks {
    public void delete(Page page) {
        try {
            deletePageAndAllReferences(page);
        } catch (Exception e) {
            logError(e);
        }
    }

    private void deletePageAndAllReferences(Page page) throws Exception {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }

    private void logError(Exception e) {
        logger.log(e.getMessage());
    }
}
