package src.main.java.formatting.cleancode.horizontal;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Alignment implements ResponseSender {

    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private Request request;
    private Response response;
    private FitNesseContext context;
    protected long requestParsingTimeLimit;
    private long requestProgress;
    private long requestParsingDeadline;
    private boolean hasError;

    public FitNesseExpediter(Socket s, FitNesseContext context) throws Exception {
        this.context = context;
        socket = s;
        input = s.getInputStream();
        output = s.getOutputStream();
    }

    requestParsingTimeLimit =10000;
}
