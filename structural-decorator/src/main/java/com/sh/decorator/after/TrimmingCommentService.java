package com.sh.decorator.after;

public class TrimmingCommentService extends CommentDecorator {
    public TrimmingCommentService(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
