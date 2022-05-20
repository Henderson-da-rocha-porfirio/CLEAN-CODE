package src.main.java.errorhandling.cleancode.TryCatchFinally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*      Our test passes now because we’ve caught the exception. We can narrow the type of the exception
        we catch to match the type that is actually
        thrown from the FileInputStream constructor: FileNotFoundException: */
public class TryCatch {

    ...

    public List<RecordedGrip> retrieveSection(String sectionName) {
        try {
            FileInputStream stream = new FileInputStream(sectionName);
            stream.close();
        } catch (FileNotFoundException e) {
            throw new StorageException(“ retrieval error”, e);
        } return new ArrayList<RecordedGrip>();
    }
    ...
}
