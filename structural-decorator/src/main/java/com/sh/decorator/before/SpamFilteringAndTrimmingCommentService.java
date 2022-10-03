package com.sh.decorator.before;

public class SpamFilteringAndTrimmingCommentService extends CommentService {
    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(trim(comment));
        }

    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
    private String trim(String comment) {
        return comment.replace("...", "");
    }

}
