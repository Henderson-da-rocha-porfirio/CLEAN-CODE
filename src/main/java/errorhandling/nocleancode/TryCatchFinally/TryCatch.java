package src.main.java.errorhandling.nocleancode.TryCatchFinally;

/* Our test fails because it doesn’t throw an exception.
        Next, we change our implementation so that it attempts to access an invalid file.
        This operation throws an exception: */
public class TryCatch {
    ...
    public List<RecordedGrip> retrieveSection(String sectionName) {
        // dummy return until we have a real implementation
        return new ArrayList<RecordedGrip>();
    }
    ...
}
