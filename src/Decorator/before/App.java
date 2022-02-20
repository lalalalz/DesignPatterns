package Decorator.before;

public class App {
    public static void main(String[] args) {

        Client client = new Client(new TrimmingCommentService());
//        Client client = new Client(new SpamFilterCommentService());


        client.writeComment("프로그래밍은 너무 재밌어요!");
        client.writeComment("프로그래밍 완전 노잼...");
        client.writeComment("http://www.example.com");

    }
}
