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

        // TODO 가장 최신 글 먼저 순회하기
        Iterator<Post> iter = board.getRecentPostIterator();
        while(iter.hasNext()){
            System.out.println(iter.next().getTitle());
        }
    }

}
