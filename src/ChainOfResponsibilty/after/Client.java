package ChainOfResponsibilty.after;

public class Client {

    private RequestHandler chain;

    public Client(RequestHandler chain) {
        this.chain = chain;
    }

    public void doWork(Request request) {
        chain.handle(request);
    }

    public static void main(String[] args) {

        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new PrintRequestHandler(null)));

        Client client = new Client(chain);

        client.doWork(new Request("이것은 요청입니다"));
    }
}
