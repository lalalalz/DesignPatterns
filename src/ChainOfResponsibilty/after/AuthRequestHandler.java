package ChainOfResponsibilty.after;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증처리 과정 진행");
        super.handle(request);
    }
}
