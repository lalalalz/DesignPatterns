package ChainOfResponsibilty.before;

import ChainOfResponsibilty.after.Request;

public class LoggingAndAuthRequestHandler {
    public void handler(Request request) {
        System.out.println("로깅을 처리합니다.");
        System.out.println("인증을 처리합니다.");
        System.out.println("기본 처리합니다.");
    }
}
