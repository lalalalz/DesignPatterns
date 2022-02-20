package Decorator.after;

public class App {

    public static void main(String[] args) {

        CommentService commentService = new DefaultCommentService();
        boolean enabledTrimming = true;
        boolean enabledSpamFilter = true;

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }
        // 여기서 Spam은 Trim 데코레이터를 생성자 인자로 전달받을 수 있음
        // 그 이유는 각각의 ConcreteDecorator의 타입이 commentService이기 때문
        // 따라서, Spam 처리 후 Trim 처리가  연달아 이루어짐
        if (enabledSpamFilter) {
            commentService = new SpamFilterCommentDecorator(commentService);
        }

        Client client = new Client(commentService);

        client.writeComment("프로그래밍은 너무 재밌어요!");
        client.writeComment("프로그래밍 완전 노잼...");
        client.writeComment("http://www.example.com");

    }
}
