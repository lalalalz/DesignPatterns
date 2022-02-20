package ChainOfResponsibilty.after;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅 처리 진행");
        super.handle(request);
    }
}
