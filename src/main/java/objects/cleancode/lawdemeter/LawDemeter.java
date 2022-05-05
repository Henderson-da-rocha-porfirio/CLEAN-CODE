package src.main.java.objects.cleancode.lawdemeter;

/* It is usually best to split them up as follows (see: LawDemeter class):
* Whether this is a violation of Demeter depends on whether or not ctxt, Options,
* and ScratchDir are objects or data structures. If they are objects,
* then their internal structure should be hidden rather than exposed, and so knowledge of
* their innards is a clear violation of the Law of Demeter. On the other hand, if ctxt, Options,
* and ScratchDir are just data structures with no behavior,
* then they naturally expose their internal structure, and so Demeter does not apply. */

import java.io.File;

public class LawDemeter {
    ...

    Options opts = ctxt.getOptions();
    File scratchDir = opts.getScratchDir();
    final String outputDir = scratchDir.getAbsolutePath();

    ...
}

    /*The use of accessor functions confuses the issue. If the code had been written as follows,
    then we probably wouldn’t be asking about Demeter violations.
    final String outputDir = ctxt.options.scratchDir.absolutePath;
    This issue would be a lot less confusing if data structures simply had public variables and no functions,
    whereas objects had private variables and public functions. However,
    there are frameworks and standards (e.g., “beans”)
    that demand that even simple data structures have accessors and mutators.*/