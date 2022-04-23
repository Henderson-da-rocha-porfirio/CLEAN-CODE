package src.main.java.functions.cleancode.args;

   /* On the other hand, if you use exceptions instead of returned error codes,
    then the error processing code can be separated from the happy path code and can be simplified:*/

public class PreferExceptionsToReturningErrorCodes {
    ...

            try {
        deletePage(page);
        registry.deleteReference(page.name);
        configKeys.deleteKey(page.name.makeKey());
    }
    catch(
    Exception e){
        logger.log(e.getMessage());
    }
}

