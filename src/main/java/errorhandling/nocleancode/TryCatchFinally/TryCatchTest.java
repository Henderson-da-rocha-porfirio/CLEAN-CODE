package src.main.java.errorhandling.nocleancode.TryCatchFinally;

/* We start with a unit test that shows that we’ll get an exception when the file doesn’t exist: */
public class TryCatchTest {

     ...

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() {
        sectionStore.retrieveSection(“ invalid - file”);
    }

    ...
}
