package com.sh.iterator.after;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    /**
     * List<Post> : 이때 List 인터페이스가 Aggregate 인터페이스 역할
     *
     * ArrayList : ConcreteAggregate
     */
    List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getDefaultIterator() {
        return posts.iterator();
    }
}
