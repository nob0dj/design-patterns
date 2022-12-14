package com.sh.decorator.before;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
    public void printComments() {
        commentService.printComments();
    }

    /**
     * 클래스폭발 이슈
     */
    public static void main(String[] args) {
        boolean enableSpamFiltering = false;
        boolean enableTrimming = false;
        Client client = new Client(new CommentService());
        if(enableSpamFiltering)
            client = new Client(new SpamFilteringCommentService());
        if(enableTrimming)
            client = new Client(new TrimmingCommentService());
        if(enableSpamFiltering && enableTrimming)
            client = new Client(new SpamFilteringAndTrimmingCommentService());

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        client.printComments();
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
