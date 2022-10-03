package com.sh.decorator.after;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    @DisplayName("comment 추가 기본기능")
    public void testComment(){
        // given
        DefaultCommentService commentService = new DefaultCommentService();
        Client client = new Client(commentService);

        // when
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        commentService.printComments();

        // then
        assertEquals(3, commentService.getComments().size());
        assertEquals("오징어게임", commentService.getComments().get(0));
        assertEquals("보는게 하는거 보다 재밌을 수가 없지...", commentService.getComments().get(1));
        assertEquals("http://whiteship.me", commentService.getComments().get(2));
    }

    @Test
    @DisplayName("스팸필터링 부가기능 추가")
    public void testSpamFilteringComment(){

        // given
        DefaultCommentService defaultCommentService = new DefaultCommentService();
        CommentService commentService = new SpamFilteringCommentService(defaultCommentService);
        Client client = new Client(commentService);
        // when
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        defaultCommentService.printComments();

        // then
        assertEquals(2, defaultCommentService.getComments().size());
        assertEquals("오징어게임", defaultCommentService.getComments().get(0));
        assertEquals("보는게 하는거 보다 재밌을 수가 없지...", defaultCommentService.getComments().get(1));
    }

    @Test
    @DisplayName("Trimming 부가기능 추가")
    public void testTrimmingComment(){
        // given
        DefaultCommentService defaultCommentService = new DefaultCommentService();
        CommentService commentService = new TrimmingCommentService(defaultCommentService);
        Client client = new Client(commentService);

        // when
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        defaultCommentService.printComments();

        // then
        assertEquals(3, defaultCommentService.getComments().size());
        assertEquals("오징어게임", defaultCommentService.getComments().get(0));
        assertEquals("보는게 하는거 보다 재밌을 수가 없지", defaultCommentService.getComments().get(1));
        assertEquals("http://whiteship.me", defaultCommentService.getComments().get(2));
    }

    @Test
    @DisplayName("Trimming & SpamFiltering 부가기능 추가")
    public void testTrimmingAndSpamFilteringComment(){
        // given
        DefaultCommentService defaultCommentService = new DefaultCommentService();
        CommentService commentService = new TrimmingCommentService(new SpamFilteringCommentService(defaultCommentService));
        Client client = new Client(commentService);

        // when
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        defaultCommentService.printComments();

        // then
        assertEquals(2, defaultCommentService.getComments().size());
        assertEquals("오징어게임", defaultCommentService.getComments().get(0));
        assertEquals("보는게 하는거 보다 재밌을 수가 없지", defaultCommentService.getComments().get(1));
    }

}