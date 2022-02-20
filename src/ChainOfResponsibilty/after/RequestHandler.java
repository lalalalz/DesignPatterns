package ChainOfResponsibilty.after;

public abstract class RequestHandler {

    RequestHandler nextHandler;

    public RequestHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Request request) {
        if(nextHandler != null) {
            nextHandler.handle(request);
        }
    }
}
