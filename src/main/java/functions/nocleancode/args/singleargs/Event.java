package src.main.java.functions.nocleancode.args.singleargs;

public class Event {

    void includeSetupPageInto( StringBuffer pageText) {


    }

/*    Try to avoid any monadic functions that don’t follow these forms, for example, void includeSetupPageInto( StringBuffer pageText).
 Using an output argument instead of a return value for a transformation is confusing.
 If a function is going to transform its input argument, the transformation should appear as the return value.
 Indeed, StringBuffer transform( StringBuffer in) is better than void transform-( StringBuffer out),
 even if the implementation in the first case simply returns the input argument.
 At least it still follows the form of a transformation..*/


}
