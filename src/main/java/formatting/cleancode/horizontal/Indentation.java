package src.main.java.formatting.cleancode.horizontal;

/*Your eye can rapidly discern the structure of the indented file. You can almost instantly spot the variables, constructors, accessors, and methods.
        It takes just a few seconds to realize that this is some kind of simple front end to a socket, with a time-out.
        The unindented version, however, is virtually impenetrable without intense study.*/

import java.net.Socket;

public class Indentation implements SocketServer {

    private FitNesseContext context;

    public FitNesseServer(FitNesseContext context) {
        this.context = context;
    }

    public void serve(Socket s) {
        serve(s, 10000);
    }

    public void serve(Socket s, long requestTimeout) {
        try {
            FitNesseExpediter sender = new FitNesseExpediter(s, context);
            sender.setRequestParsingTimeLimit(requestTimeout);
            sender.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
-----
        }
