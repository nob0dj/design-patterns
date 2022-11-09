package com.sh.iterator.after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {
    private final Iterator<Post> iter;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.iter = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.iter.hasNext();
    }

    @Override
    public Post next() {
        return this.iter.next();
    }
}
