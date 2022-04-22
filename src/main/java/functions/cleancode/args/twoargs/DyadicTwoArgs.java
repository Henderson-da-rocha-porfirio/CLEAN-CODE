package src.main.java.functions.cleancode.args.twoargs;

import java.awt.*;
import java.io.InputStream;
import java.io.OutputStream;

/*There are times, of course, where two arguments are appropriate. For example, Point p = new Point( 0,0); is perfectly reasonable.
        Cartesian points naturally take two arguments. Indeed, we’d be very surprised to see new Point( 0).
        However, the two arguments in this case are ordered components of a single value!
        Whereas output-Stream and name have neither a natural cohesion, nor a natural ordering.*/

public class DyadicTwoArgs {

    Point p = new Point( 0,0);


  /*  Dyads aren’t evil, and you will certainly have to write them.
    However, you should be aware that they come at a cost and should take advantage of what mechanims may be available to you to convert them into monads.
    For example, you might make the writeField method a member of outputStream so that you can say outputStream.writeField( name).
    Or you might make the outputStream a member variable of the current class so that you don’t have to pass it.
    Or you might extract a new class like FieldWriter that takes the outputStream in its constructor and has a write method.*/


}
