package src.main.java.comments.nocleancode;

/*The first comment seems appropriate. It explains why the catch block is being ignored.
        But the second comment is pure noise.
        Apparently the programmer was just so frustrated with writing
        try/ catch blocks in this function that he needed to vent:*/

import java.net.SocketException;

public class Noise {

    private void startSending() {
        try {
            doSending();
        } catch (SocketException e) {
            // normal. someone stopped the request.
        } catch (Exception e) {
            try {
                response.add(ErrorResponder.makeExceptionString(e));
                response.closeAll();
            } catch (Exception e1) {
                // Give me a break!
            }
        }
    }
}