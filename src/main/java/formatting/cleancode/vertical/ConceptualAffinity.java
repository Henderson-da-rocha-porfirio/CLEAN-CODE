package src.main.java.formatting.cleancode.vertical;

/*These functions have a strong conceptual affinity because they share a common naming scheme
        and perform variations of the same basic task.
        The fact that they call each other is secondary.
        Even if they didn’t, they would still want to be close together.*/

public class ConceptualAffinity {

    static public void conceptTrue(String message, boolean condition) {
        if (!condition) fail(message);
    }

    static public void conceptTrue(boolean condition) {
        conceptTrue(null, condition);
    }

    static public void conceptFalse(String message, boolean condition) {
        conceptTrue(message, !condition);
    }

    static public void conceptFalse(boolean condition) {
        conceptFalse(null, condition);
    } …
}
