package src.main.java.objects.nocleancode.lawdemeter;

/*      The following code3 appears to violate the Law of Demeter (among other things) because
        it calls the getScratchDir() function on the return value of getOptions()
        and then calls getAbsolutePath() on the return value of getScratchDir().

        This kind of code is often called a train wreck because it look like a bunch of coupled train cars.
        Chains of calls like this are generally
        considered to be sloppy style and should be avoided.*/

public class ViolateLawDemeter {
    ...

    final String outputDir = ctxt.getOptions().getScratchDir().getAbsolutePath();
    ...
}