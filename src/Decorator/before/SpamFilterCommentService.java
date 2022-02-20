package Decorator.before;

public class SpamFilterCommentService extends CommentService {

    @Override
    public void addComment(String comment) {
        if (!isSpam(comment)) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
