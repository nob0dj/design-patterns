package com.sh.decorator.after;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }


    /**
     * 클래스폭발 이슈
     */
    public static void main(String[] args) {
        boolean enableSpamFiltering = true;
        boolean enableTrimming = true;
        CommentService commentService = new DefaultCommentService();
        if (enableSpamFiltering)
            commentService = new SpamFilteringCommentService(commentService);
        if (enableTrimming)
            commentService = new TrimmingCommentService(commentService);

        Client client = new Client(commentService);

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

    }

    /*
        enableSpamFiltering, enableTrimming :  false
            오징어게임
            보는게 하는거 보다 재밌을 수가 없지...
            http://whiteship.me
        enableSpamFiltering :  true
            오징어게임
            보는게 하는거 보다 재밌을 수가 없지...

        enableTrimming : true
            오징어게임
            보는게 하는거 보다 재밌을 수가 없지
            http://whiteship.me
        enableSpamFiltering, enableTrimming :  true
            오징어게임
            보는게 하는거 보다 재밌을 수가 없지
     */

}
