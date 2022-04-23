package src.main.java.functions.nocleancode.args;

   /* This does not suffer from verb/ adjective confusion but does lead to deeply nested structures.
            When you return an error code, you create the problem that the caller must deal with the error immediately.*/

public class PreferExceptionsToReturningErrorCodes {
    ...

            if(deletePage(page) = =E_OK) {
            if (registry.deleteReference(page.name) == E_OK) {
                if (configKeys.deleteKey(page.name.makeKey()) == E_OK) {
                    logger.log(" page deleted");
                } else {
                    logger.log(" configKey not deleted");
                }
            } else {
                logger.log(" deleteReference from registry failed");
            }
        } else

        {
            logger.log(" delete failed");
        }
        return E_ERROR;
    }
