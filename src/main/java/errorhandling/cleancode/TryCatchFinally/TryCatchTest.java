package src.main.java.errorhandling.cleancode.TryCatchFinally;

/* We start with a unit test that shows that we’ll get an exception when the file exist: */
public class TryCatchTest {

    ...

    @Test(expected = StorageException.class)
    public void retrieveSectionShouldThrowOnInvalidFileName() {
        sectionStore.retrieveSection(“ invalid - file”);
    }

    ...
}
