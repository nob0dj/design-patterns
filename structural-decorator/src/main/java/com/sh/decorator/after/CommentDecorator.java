package com.sh.decorator.after;

/**
 * 부가적인 기능추가를 위한 부모 데코레이터 클래스
 * - CommentService 타입 구현
 * - 부가기능 클래스는 CommentDecorator를 상속하게된다.
 */
public class CommentDecorator implements CommentService{
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }
}
