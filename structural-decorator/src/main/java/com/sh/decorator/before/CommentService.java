package com.sh.decorator.before;

import java.util.ArrayList;
import java.util.List;

public class CommentService {

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
