package com.sh.iterator.after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // TODO 들어간 순서대로 순회하기
        // client쪽에 posts의 구조가 그대로 노출된다.
//        List<Post> posts = board.getPosts();
//        for (int i = 0 ; i < posts.size() ; i++) {
//            Post post = posts.get(i);
//            System.out.println(post.getTitle());
//        }

        // Iterator인터페이스 적용 -> posts의 타입을 몰라도 된다.
        Iterator<Post> iter = board.getPosts().iterator();
        while(iter.hasNext()){
            Post post = iter.next();
            System.out.println(post.getTitle());
        }



        // TODO 가장 최신 글 먼저 순회하기
        List<Post> posts = board.getPosts();
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }
    }

}
