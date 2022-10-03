package com.sh.decorator.after;

import java.util.ArrayList;
import java.util.List;

public class DefaultCommentService implements CommentService{

    private List<String> comments = new ArrayList<>();
    public void addComment(String comment) {
        comments.add(comment);
    }

    public void printComments(){
        comments.stream().forEach(System.out::println);
    }

    public List<String> getComments() {
        return this.comments;
    }
}
