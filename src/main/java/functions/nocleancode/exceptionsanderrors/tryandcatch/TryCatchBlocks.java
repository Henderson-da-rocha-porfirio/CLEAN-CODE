package src.main.java.functions.nocleancode.exceptionsanderrors.tryandcatch;

/*Try/ catch blocks are ugly in their own right.
They confuse the structure of the code and mix error processing with normal processing.
 So it is better to extract the bodies of the try and catch blocks out into functions of their own.*/

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
