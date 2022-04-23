package src.main.java.functions.nocleancode.exceptionsanderrors.dependencymagnet;

/*Classes like this are a dependency magnet; many other classes must import and use them. Thus, when the Error enum changes,
        all those other classes need to be recompiled and redeployed. 11 This puts a negative pressure on the Error class.
        Programmers don’t want to add new errors because then they have to rebuild and redeploy everything.
        So they reuse old error codes instead of adding new ones. When you use exceptions rather than error codes,
        then new exceptions are derivatives of the exception class.
        They can be added without forcing any recompilation or redeployment.*/

public class Error {
    public enum Error {OK, INVALID, NO_SUCH, LOCKED, OUT_OF_RESOURCES, WAITING_FOR_EVENT;}
}
