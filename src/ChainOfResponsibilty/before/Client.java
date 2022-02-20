package ChainOfResponsibilty.before;


import ChainOfResponsibilty.after.Request;

public class Client {
    public static void main(String[] args) {

        LoggingAndAuthRequestHandler requestHandler = new LoggingAndAuthRequestHandler();
        requestHandler.handler(new Request("요청입니다."));

    }
}
