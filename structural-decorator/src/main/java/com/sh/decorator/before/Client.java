package com.sh.decorator.before;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me"); // 출력 안됨.

        Client client2 = new Client(new TrimmingCommentService());
        client2.writeComment("오징어게임");
        client2.writeComment("보는게 하는거 보다 재밌을 수가 없지..."); // 보는게 하는거 보다 재밌을 수가 없지
        client2.writeComment("http://whiteship.me");
    }

}
